create table student_info
(
    id bigint unsigned auto_increment,
    name varchar(10) null,
    school_number char(10) null,
    sex tinyint null,
    phone_number int null,
    major varchar(40) null,
    class_number int null,
    preview_major varchar(40) null,
    first_teacher varchar(10) null,
    second_teacher varchar(10) null,
    constraint student_info_pk
        primary key (id)
);

create unique index uk_school_number
    on student_info (school_number);

