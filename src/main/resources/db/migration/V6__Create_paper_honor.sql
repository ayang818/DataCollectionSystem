create table paper_honor
(
    id bigint unsigned auto_increment,
    name varchar(10) null,
    school_number int null,
    paper_title varchar(50) null,
    paper_level varchar(40) null,
    publish_year int null,
    publication_name varchar(20) null,
    author_name varchar(30) null,
    author_order int null,
    prove varchar(100) null,
    teacher_name varchar(10) null,
    teacher_id bigint unsigned null,
    pass tinyint null,
    constraint paper_honor_pk
        primary key (id)
);

create index idx_school_number
    on paper_honor (school_number);

create index idx_teacher_id
    on paper_honor (teacher_id);

