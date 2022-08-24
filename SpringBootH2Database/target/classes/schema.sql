drop table if exists emp_table;

create table emp_table(
id int auto_increment primary key,
Fname varchar(100) not null,
Lname varchar(100) not null,
email varchar(40) default null
);