create table statistics_honor
(
    id bigint unsigned auto_increment,
    student_name varchar(50) null,
    school_number int null,
    type int null,
    honor_name varchar(80) null,
    pass tinyint null,
    constraint statistics_honor_pk
        primary key (id)
);

create index idx_school_number
    on statistics_honor (school_number);