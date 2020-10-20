# episen-sca-kto-frontend
# episen-sca-kto-frontend

###BUILD
docker build -t ordersfront:1.0 .

###RUN
docker run --publish 80:80 --detach --name orders-front ordersfront:1.0

docker run --link orders -p 81:80 --detach --name orders-front ordersfront:1.0
