create table competition_honor
(
    id bigint unsigned primary key auto_increment,
    competition_type varchar(40) null,
    competition_level varchar(40) null,
    competition_year varchar(40) null,
    competition_total_name varchar(80) null,
    team_number varchar(20) null,
    student_name varchar(40) null,
    grade varchar(10) null,
    school_number varchar(20) null,
    major varchar(60) null ,
    college varchar(60) null,
    guidance_teacher varchar(60) null,
    honor_level varchar(60) null,
    message varchar(200) null,
    pass tinyint null,
    gmt_create datetime null,
    gmt_modified datetime null
);

create index idx_school_number on competition_honor(school_number);