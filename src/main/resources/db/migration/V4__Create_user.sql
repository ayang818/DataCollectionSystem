create table user
(
    id bigint unsigned auto_increment,
    name varchar(10) null,
    username int(12) null,
    password varchar(50) null,
    token varchar(40) null,
    gmt_create datetime null,
    gmt_modified datetime null,
    constraint user_pk
        primary key (id)
);

create unique index uk_token
    on user (token);

create unique index uk_username
    on user (username);

