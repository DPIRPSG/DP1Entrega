drop database if exists `Getting-Started`;
create database `Getting-Started`;
grant select, insert, update, delete
on `Getting-Started`.* to 'acme-user'@'%';
grant select, insert, update, delete, create, drop, references, index, alter,
create temporary tables, lock tables, create view, create routine,
alter routine, execute, trigger, show view
on `Getting-Started`.* to 'acme-manager'@'%';