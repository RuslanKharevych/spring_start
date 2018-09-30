docker run --name mysql-server -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=test_base -e MYSQL_USER=user -e MYSQL_PASSWORD=pass123 -d mysql:8

docker build -t spring-boot-example ../
docker run --name spring-boot-app -p 8989:8080 --link mysql-server:mysql -d spring-boot-example

echo HelloWorld 
