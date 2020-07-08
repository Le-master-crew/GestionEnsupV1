package eu.ensup.gestionscolairespringboot.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import eu.ensup.gestionscolairespringboot.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	public UserDetailsService userDetailsService() {
		return new UserDetailsServiceImpl();
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService());
		authProvider.setPasswordEncoder(passwordEncoder());
		System.out.println(authProvider);
		return authProvider;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers(
					"/register",
					"/registerOK",
					"/login",
					"/js/**",
					"/css/**",
					"/images/").permitAll()
			.antMatchers("/listeEtudiants*")
				.hasAuthority("ROLE_DIRECTEUR")
			.antMatchers("/**")
				.hasAnyAuthority("ROLE_DIRECTEUR", "ROLE_ENSEIGNANT", "ROLE_ADMIN") 
			.anyRequest().authenticated()
			.and()
				.formLogin()
				.permitAll()
			.and()
				.logout()
				.logoutSuccessUrl("/login")
				.permitAll()
			.and()
				.exceptionHandling()
				.accessDeniedPage("/accessDenied.jsp")
			.and()
				.csrf()
				.disable()

			;
	}
}
