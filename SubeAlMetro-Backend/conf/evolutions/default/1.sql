# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table estacion (
  codigo                    varchar(255) not null,
  nombre_estacion           varchar(255),
  distrito                  varchar(255),
  ubicacion                 varchar(255),
  posicion_latitud          varchar(255),
  posicion_longitud         varchar(255),
  constraint pk_estacion primary key (codigo))
;

create table usuario (
  usuario                   varchar(255) not null,
  nombre_completo           varchar(255),
  contrasenha               varchar(255),
  constraint pk_usuario primary key (usuario))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table estacion;

drop table usuario;

SET FOREIGN_KEY_CHECKS=1;

