drop database if exists `Simple-Project`;
create database `Simple-Project`;
grant select, insert, update, delete
on `Simple-Project`.* to 'acme-user'@'%';
grant select, insert, update, delete, create, drop, references, index, alter,
create temporary tables, lock tables, create view, create routine,
alter routine, execute, trigger, show view
on `Simple-Project`.* to 'acme-manager'@'%';