alter table user change name student_name varchar(10) null;
alter table teacher_info change name teacher_name varchar(10) null;
alter table student_info change name student_name varchar(10) null;
alter table paper_honor change name student_name varchar(10) null;
alter table knowledge_honor change name student_name varchar(10) null;
alter table competition_honor change name student_name varchar(10) null;
alter table ability_honor change name student_name varchar(10) null;

rename table user to user_info;