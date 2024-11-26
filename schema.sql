create database userappdb;
use userappdb;
create table users
(
id integer auto_increment primary key,
cart varchar (100) not null,
login varchar (50) not null,
email varchar (80) not null unique,
number varchar (30) not null unique,
password varchar (50) not null
);