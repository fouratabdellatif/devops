FROM openjdk:11-jre-slim
//le conteneur écoute sur le port 
EXPOSE 8089 
//pour copier des fichiers du système de fichiers local (hôte) dans l'image Docker,le fichier JAR du répertoire target du système de fichiers local dans l'image Docker.
ADD target/achat-1.0.jar achat-1.0.jar 
//C'est une instruction Docker utilisée pour définir la commande qui sera exécutée 
ENTRYPOINT ["java","-jar","/achat-1.0.jar"] 
