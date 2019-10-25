create table competition_honor
(
    id bigint unsigned auto_increment,
    name varchar(10) null,
    school_number int null,
    competition_level varchar(30) null,
    competition_name varchar(40) null,
    teacher_id bigint unsigned null,
    honor_level varchar(40) null,
    prove varchar(50) null,
    pass tinyint null,
    constraint competition_honor_pk
        primary key (id)
);

create index idx_school_number
    on competition_honor (school_number);

create index idx_teacher_id
    on competition_honor (teacher_id);

