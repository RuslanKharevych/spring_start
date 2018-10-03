--liquibase formatted sql

--changeset Group:create groups

create table Course (
    id_course int primary key,
    name varchar(255),
    type varchar(255)
);

insert into Course (id_course, name, type) values (1, 'Course1','first');
insert into Course (id_course, name, type) values (2, 'Course2','second');
insert into Course (id_course, name, type) values (3, 'Course3','third');
insert into Course (id_course, name, type) values (4, 'Course4','fourth');
insert into Course (id_course, name, type) values (5, 'Course5','fifth');

