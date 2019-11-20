drop index idx_code on data_dict;

create index idx_name_code
    on data_dict (name, code);
