create table products
(
    id          serial
        primary key,
    name        varchar(100) not null,
    description text,
    price       numeric(10, 2),
    stock       integer,
    category_id integer
        references categories,
    created_at  timestamp default CURRENT_TIMESTAMP
);

alter table products
    owner to postgres;


