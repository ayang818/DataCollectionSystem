alter table data_dict drop column first;

alter table data_dict
    add name varchar(100) null after id;

alter table data_dict drop column second;

alter table data_dict drop column third;

