create table graduation
(
    id bigint unsigned auto_increment,
    student_name varchar(40) null,
    student_number int null,
    teacher_id int null,
    teacher_name varchar(40) null,
    whereabouts varchar(100) null,
    gmt_create datetime null,
    gmt_modified datetime null,
    constraint graduation_pk
        primary key (id)
);

create index idx_student_number
    on graduation (student_number);

create index idx_teacher_id
    on graduation (teacher_id);