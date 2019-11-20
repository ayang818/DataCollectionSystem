drop table closure_table;

create table data_dict
(
    id bigint unsigned auto_increment,
    first int null,
    second int null,
    third int null,
    code int null,
    constraint data_dict_pk
        primary key (id)
);

create index idx_code
    on data_dict (code);