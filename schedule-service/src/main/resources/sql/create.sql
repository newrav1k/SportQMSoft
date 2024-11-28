create table sections
(
    id    bigserial primary key,
    title varchar(64) not null
);

create table trainings
(
    id              bigserial primary key,
    title           varchar(128) not null,
    start_date      date         not null,
    start_time      time         not null,
    available_seats int          not null check (available_seats >= 0),
    user_id         bigint,
    section_id      bigint       not null references sections (id) on delete cascade
);