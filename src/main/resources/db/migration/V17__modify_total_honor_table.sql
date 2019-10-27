alter table statistics_honor
    add detail_id bigint unsigned null;

create index idx_detail_id
    on statistics_honor (detail_id);