create table file
(
    id             bigint unsigned auto_increment primary key,
    bot_user_id    varchar(45) null,
    file_id        varchar(45) null,
    file_unique_id varchar(45) null,
    size           bigint      null,
    file_name      varchar(45) null,
    time_type      int         null,
    file_size      int         null,
    file_content   tinytext    null
);
