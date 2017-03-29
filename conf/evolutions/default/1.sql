# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table flight (
  flight_id                     integer not null,
  flight_date                   timestamp,
  dep_time                      varchar(255),
  arr_time                      varchar(255),
  aircraft_id                   integer,
  route_id                      integer,
  constraint pk_flight primary key (flight_id)
);
create sequence flight_seq;


# --- !Downs

drop table if exists flight;
drop sequence if exists flight_seq;

