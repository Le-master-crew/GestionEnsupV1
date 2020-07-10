# GestionEnsupV1

L'application a été développée avec Spring Boot. Celle-ci permet de gérer les étudiants d'une école.
Plusieurs fonctionnalités sont disponibles :
- connexion à la plateforme
- lister les étudiants
- lister les cours
- ajouter un étudiant
- supprimer un étudiant
- modifier un étudiant
- lire les informations d'un étudiant
- associer un étudiant à un cours

Prérequis :
- Installation du serveur de base de données sur la machine (XAMPP ou WAMPP)
- Créer la base de données "gestionscolaire".


Lancement de l'application :
- Télécharger le projet
- A partir de la racine du projet executer la commande : mvn spring-boot:run
- A partir d'un navigateur, accéder à : http://localhost:8080/gestion . Voici l'écran de connexion où vous pouvez vous connecter avec le compte admin

  - Accés durecteur :
    - identifiant : admin
    - mot de passe : admin
    
  - Accés enseignant :
    - identifiant : prof
    - mot de passe : prof

Swagger :
Lorsque l'application est lancée aller sur : http://localhost:8080/gestion/swagger-ui.html#/

Pour accéder à l'application en ligne déployée sur Heroku, aller sur : 
http://gestionecolev1.herokuapp.com/gestion/

Technologies utilisées :

- Spring Boot
- Tomcat
- JpaRepository
- Mysql
- PostGres
- Heroku
- Jenkins
- Swagger


Voici le lien du DockerHub sur lequel vous pouvez trouver l'image de l'application :

https://hub.docker.com/r/stolcraft/gestionensup1
