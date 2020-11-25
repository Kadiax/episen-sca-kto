# episen-sca-kto

###RUN
docker-compose up


###VOIR le volume
docker volume ls

docker volume inspect episenscakto_vol-episen-sca-kto-backend

ls /var/lib/docker/volumes/episenscakto_vol-episen-sca-kto-backend/_data

cat /var/lib/docker/volumes/episenscakto_vol-episen-sca-kto-backend/_data/orders.log

docker-compose up --scale episen-sca-kto-backend=2 --scale episen-sca-kto-front=2

