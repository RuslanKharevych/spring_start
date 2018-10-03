--liquibase formatted sql

--changeset User_Group:create groups and users connection
create table User_Course(
    id_user_course int primary key,
    id_user int,
    id_course int,
    foreign key(id_user) references User(id_user),
    foreign key(id_course) references Course(id_course)
);

insert into User_Course(id_user_course,id_user,id_course) values(1,1,1);
insert into User_Course(id_user_course,id_user,id_course) values(2,1,2);
insert into User_Course(id_user_course,id_user,id_course) values(3,2,2);
insert into User_Course(id_user_course,id_user,id_course) values(4,2,3);
insert into User_Course(id_user_course,id_user,id_course) values(5,3,3);
insert into User_Course(id_user_course,id_user,id_course) values(6,3,4);
insert into User_Course(id_user_course,id_user,id_course) values(7,4,4);
insert into User_Course(id_user_course,id_user,id_course) values(8,4,5);
insert into User_Course(id_user_course,id_user,id_course) values(9,5,5);
insert into User_Course(id_user_course,id_user,id_course) values(10,5,1);

