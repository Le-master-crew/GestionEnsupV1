package eu.ensup.gestionscolairespringboot;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EntityScan("eu.ensup.gestionscolairespringboot.domaine")
//@ComponentScan(basePackageClasses = "eu.ensup.gestionscolairespringboot.controller")
@SpringBootApplication
public class GestionscolairespringbootApplication {

	public static void main(String[] args) {
//		SpringApplication.run(GestionscolairespringbootApplication.class, args);
		SpringApplication app = new SpringApplication(GestionscolairespringbootApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.servlet.context-path", "/gestion"));
        app.run(args);

	}

}
