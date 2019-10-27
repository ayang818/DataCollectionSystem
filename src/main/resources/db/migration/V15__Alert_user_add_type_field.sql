alter table user_info
    add type tinyint null;

create table admin_info
(
    id           bigint unsigned auto_increment
        primary key,
    username     int(12)     null,
    password     varchar(50) null,
    token        varchar(40) null,
    gmt_create   datetime    null,
    gmt_modified datetime    null,
    type tinyint null
);

create index uk_token on admin_info(token);
create index uk_username on admin_info(username);