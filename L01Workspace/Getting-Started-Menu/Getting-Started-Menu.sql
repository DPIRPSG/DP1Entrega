drop database if exists `Getting-Started-Menu`;
create database `Getting-Started-Menu`;
grant select, insert, update, delete
on `Getting-Started-Menu`.* to 'acme-user'@'%';
grant select, insert, update, delete, create, drop, references, index, alter,
create temporary tables, lock tables, create view, create routine,
alter routine, execute, trigger, show view
on `Getting-Started-Menu`.* to 'acme-manager'@'%';