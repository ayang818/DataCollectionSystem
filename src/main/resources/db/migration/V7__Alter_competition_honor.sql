alter table competition_honor
    add teacher_name varchar(10) null after competition_name;

alter table competition_honor modify prove varchar(100) null;