# episen-sca-kto-frontend

###BUILD
docker build -t episen-sca-kto-front:1.0 .

###RUN
docker run --publish 80:80 --detach --name orders-front episen-sca-kto-frontend:1.0

docker run --link episen-sca-kto-backend -p 80:80 --detach --name orders-front episen-sca-kto-frontend:1.0

###push image
docker tag episen-sca-kto-front:1.0 kadiax/episen-sca-kto-front:1.0

docker push kadiax/episen-sca-kto-front:1.0


docker tag episen-sca-kto_episen-sca-kto-front kadiax/episen-sca-kto-front:2.0

docker push kadiax/episen-sca-kto-front:2.0

docker tag episen-sca-kto_episen-sca-kto-front kadiax/episen-sca-kto-front:3.0

docker push kadiax/episen-sca-kto-front:3.0


