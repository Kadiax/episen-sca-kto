# episen-sca-kto-backend

###BUILD
docker build -t episen-sca-kto-backend:1.0 .

###RUN
docker run --publish 80:80 --detach --name orders-back episen-sca-kto-backend:1.0

###push image
docker tag episen-sca-kto-backend:1.0 kadiax/episen-sca-kto-backend:1.0

docker push kadiax/episen-sca-kto-backend:1.0

