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
