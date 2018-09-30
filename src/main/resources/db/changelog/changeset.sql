--liquibase formatted sql
--preconditions onFail:CONTINUE onError:MARK_RAN
--precondition-sql-check expectedResult:1 SELECT count(*) FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME = 'person'

--changeset User1:3
create table User (
    id int primary key,
    name varchar(255)
);