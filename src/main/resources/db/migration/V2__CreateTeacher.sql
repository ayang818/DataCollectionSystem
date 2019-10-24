create table teacher_info
(
    id bigint unsigned auto_increment,
    name varchar(10) null,
    student_num int null,
    constraint teacher_info_pk
        primary key (id)
);

create index idx_name
    on teacher_info (name);