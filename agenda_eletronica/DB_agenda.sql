create database if not exists db_agenda;

use db_agenda;

CREATE TABLE IF NOT EXISTS agenda(
id bigint auto_increment,
dia varchar(15),
hora varchar(10),
assunto varchar(250),
primary key(id)
);