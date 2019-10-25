create table knowledge_honor
(
    id bigint unsigned auto_increment,
    name varchar(10) null,
    school_number int null,
    pass tinyint null,
    teacher_id bigint unsigned null,
    teacher_name varchar(10) null,
    honor_type varchar(10) null comment '知识产权类型',
    honor_name varchar(30) null comment '知识产权名称',
    register_number varchar(50) null comment '登记号',
    authorization_status varchar(20) null comment '授权状态',
    prove varchar(100) null,
    constraint knowledge_honor_pk
        primary key (id)
);

create index idx_school_number
    on knowledge_honor (school_number);

create index idx_teacher_id
    on knowledge_honor (teacher_id);

