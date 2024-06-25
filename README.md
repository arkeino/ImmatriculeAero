# ImmatriculeAero
Ce projet consiste a récuperer les Immatriculation des aviosn via un cvs

Premier Pas sur Linux


Pré-Requis :

Installer le JDK en utilisant la commande suivante :

sudo apt-get update
sudo apt-get install openjdk-11-jdk

Installer Maven en utilisant la commande suivante : 

sudo apt-get install maven

Avoir un fichier application.properties dans le src/main/ressources avec un format comme en dessous :

immataeronef.filename=path/to/your/csvfile.csv

Pour compiler le programme exécuter les commandes suivante :

mvn clean install ( nettoyer et compiler le projet )

Exécuter le programme en utilisant la commande suivante :

mvn spring-boot:run

Accéder a l'application en localhost par exemple :

http://localhost:8080/aeronefs/{immatriculation}




Premier Pas sur Windows :

Téléchargez le JDK depuis le site officiel d'Oracle : Télécharger le JDK
Installez le JDK en suivant les instructions.

Utiliser la commande pour vérifier l'installation : 

java -version


Installer Maven :

Téléchargez Apache Maven depuis le site officiel : Télécharger Maven
Extrayez l'archive téléchargée à un emplacement de votre choix.

Compiler et exécuter le programme utiliser le scommande suivante :

# Nettoyer et compiler le projet
mvn clean install

# Exécuter l'application Spring Boot
mvn spring-boot:run
