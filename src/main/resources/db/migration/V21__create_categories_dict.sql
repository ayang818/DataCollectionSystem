create table categories_dict
(
	id bigint unsigned auto_increment,
	title varchar(40) null,
	constraint categories_dict_pk
		primary key (id)
);