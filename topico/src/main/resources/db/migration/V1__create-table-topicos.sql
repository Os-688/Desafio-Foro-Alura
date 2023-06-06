create table topicos(

    id bigint not null auto_increment,
    titulo varchar(100) not null unique,
    mensaje varchar(100) not null unique,
    fecha_creacion DATE not null,
    status_topico tinyint not null,
    autor varchar(100) not null,
    curso varchar(100) not null,

    primary key(id)

);