create table ability_honor
(
    id bigint unsigned auto_increment,
    name varchar(10) null,
    school_number int null,
    pass tinyint null,
    teacher_id bigint unsigned null,
    teacher_name int null,
    ability_type bigint unsigned null,
    gmt_create datetime null,
    gmt_modified datetime null,
    constraint ability_honor_pk
        primary key (id)
);

create index idx_school_number
    on ability_honor (school_number);

create index idx_teacher_id
    on ability_honor (teacher_id);

