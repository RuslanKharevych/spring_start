--liquibase formatted sql
--preconditions onFail:CONTINUE onError:MARK_RAN
--precondition-sql-check expectedResult:1 SELECT count(*) FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME = 'person'

--changeset User:create users

create table User (
    id_user int primary key,
    name varchar(255),
    years int
);

insert into User (id_user, name, years) values (1, 'User1',11);
insert into User (id_user, name, years) values (2, 'User2',22);
insert into User (id_user, name, years) values (3, 'User3',33);
insert into User (id_user, name, years) values (4, 'User4',44);
insert into User (id_user, name, years) values (5, 'User5',55);

