create table users
(
    id           bigserial primary key,
    firstname    varchar(128) not null,
    lastname     varchar(128) not null,
    birthday     date         not null,
    username     varchar(128) not null unique,
    phone_number varchar(20) unique,
    password     varchar(128) not null,
    role         varchar(16)  not null,
    section_id   bigint
);