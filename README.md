# Cities API



##   Based project:

Bootcamp Final Project everis Quality Assurance Beginner #2

[Digital Innovation One - everis](https://github.com/andrelugomes/digital-innovation-one/tree/master/cities-api)

##  SWAGGER

[SWAGGER Api Documentation on Heroku](https://wz-citiesapi.herokuapp.com/swagger-ui.html#/city-resource)

## DataBase

### Postgres

- [Postgres Docker Hub](https://hub.docker.com/_/postgres)

```
docker run --name bd-postgres -d -p 5432:5432 -e POSTGRES_USER=Minos -e POSTGRES_PASSWORD=admin -e POSTGRES_DB=cities postgres
```

- [data](https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL)

  ~~~
  cd ~/workspace/sql-paises-estados-cidades/PostgreSQL
  
  docker run -it --rm --net=host -v ${PWD}:/tmp postgres /bin/bash
  
  psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
  psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
  psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql
  
  psql -h localhost -U postgres_user_city cities
  
  CREATE EXTENSION cube; 
  CREATE EXTENSION earthdistance;

- [Postgres Earth distance](https://www.postgresql.org/docs/current/earthdistance.html)

- [earthdistance--1.0--1.1.sql](https://github.com/postgres/postgres/blob/master/contrib/earthdistance/earthdistance--1.0--1.1.sql)

- [OPERATOR <@>](https://github.com/postgres/postgres/blob/master/contrib/earthdistance/earthdistance--1.1.sql)

- [postgrescheatsheet](https://postgrescheatsheet.com/#/tables)

- [datatype-geometric](https://www.postgresql.org/docs/current/datatype-geometric.html)

### Access

```
docker exec -it cities-db /bin/bash

psql -U Minos cities
```

### Query Earth Distance

Point

```
select ((select lat_lon from cidade where id = 4929) <@> (select lat_lon from cidade where id=5254)) as distance;
```

Cube

```
select earth_distance(
    ll_to_earth(-21.95840072631836,-47.98820114135742), 
    ll_to_earth(-22.01740074157715,-47.88600158691406)
) as distance;
```

## Spring Boot

- Java 11
- Maven Project
- Jar
- Spring Web
- Spring Data JPA
- PostgreSQL Driver
- Swagger

### Spring Data

- [jpa.query-methods](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods)

### Properties

- [appendix-application-properties](https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html)
- [jdbc-database-connectio](https://www.codejava.net/java-se/jdbc/jdbc-database-connection-url-for-common-databases)

### Types

- [JsonTypes](https://github.com/vladmihalcea/hibernate-types)
- [UserType](https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/usertype/UserType.html)

