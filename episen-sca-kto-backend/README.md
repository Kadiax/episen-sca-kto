# episen-sca-kto-backend

## BUILD
mvn clean install

docker build -t ordersapp:1.0 .

## Run une image docker
docker run --publish 8080:8080 --detach --name orders ordersapp:1.0

## Voir le contenue du fichier sans volume
docker exec -ti orders cat orders.txt

## Voir le contenue du fichier avec volume
Afin de pouvoir sauvegarder (persister) les données et également 
partager des données entre conteneurs, Docker a développé le concept
 de volumes. Les volumes sont des répertoires (ou des fichiers) qui
  ne font pas partie du système de fichiers Union mais qui existent 
  sur le système de fichiers hôte.

En outre, les volumes constituent souvent le meilleur choix pour
 persistance des données pour le layer en lecture-écriture, car 
 un volume n'augmente pas la taille des conteneurs qui l'utilisent
  et son contenu existe en dehors du cycle de vie d'un conteneur donné.

### Source
(https://devopssec.fr/article/fonctionnement-manipulation-volumes-docker)


