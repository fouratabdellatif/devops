FROM openjdk:11-jre-slim
EXPOSE 8089 //le conteneur écoute sur le port 8089
ADD target/achat-1.0.jar achat-1.0.jar //pour copier des fichiers du système de fichiers local (hôte) dans l'image Docker,le fichier JAR (dans ce cas, achat-1.0.jar) du répertoire target du système de fichiers local dans l'image Docker.
ENTRYPOINT ["java","-jar","/achat-1.0.jar"] //C'est une instruction Docker utilisée pour définir la commande qui sera exécutée 

