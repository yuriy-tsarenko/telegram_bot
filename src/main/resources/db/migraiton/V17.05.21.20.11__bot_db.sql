DROP DATABASE if exists bot_itdn;
CREATE DATABASE IF NOT EXISTS bot_itdn;
USE bot_itdn;
CREATE TABLE IF NOT EXISTS bot
(
    id        bigint auto_increment,
    bot_name  varchar(45) null,
    bot_token varchar(45) null,
    base_url  varchar(45) null,
    primary key(id)
);

CREATE TABLE IF NOT EXISTS bot_chat
(
    id                             bigint auto_increment,
    type                           varchar(45) null,
    title                          varchar(45) null,
    first_name                     varchar(45) null,
    last_name                      varchar(45) null,
    user_name                      varchar(45) null,
    all_members_are_administrators tinyint     null,
    description                    varchar(45) null,
    invite_link                    varchar(45) null,
    bio                            varchar(45) null,
        primary key(id)
);

CREATE TABLE IF NOT EXISTS bot_user
(
    id                          bigint auto_increment,
    user_id                     varchar(45) null,
    first_name                  varchar(45) null,
    is_bot                      tinyint     null,
    last_name                   varchar(45) null,
    user_name                   varchar(45) null,
    language_code               varchar(45) null,
    can_join_groups             varchar(45) null,
    can_read_all_group_messages varchar(45) null,
    support_inline_queries      varchar(45) null,
    primary key(id)
);

CREATE TABLE IF NOT EXISTS community
(
    id          bigint auto_increment,
    bot_user_id bigint null,
    bot_chat_id bigint null,
        primary key (id),
    foreign key (bot_user_id) references bot_user(id),
    foreign key (bot_chat_id) references bot_chat(id)
);

CREATE TABLE IF NOT EXISTS file
(
    id             bigint auto_increment,
    bot_user_id    bigint null,
    file_id        varchar(45) null,
    file_unique_id varchar(45) null,
    size           bigint      null,
    file_name      varchar(45) null,
    time_type      int         null,
    file_size      int         null,
    file_content   tinytext    null,
        primary key (id),
    foreign key (bot_user_id) references bot_user(id)
);

CREATE TABLE IF NOT EXISTS message_template
(
    id          bigint auto_increment,
    bot_id      bigint      null,
    description varchar(45) null,
    type        varchar(45) null,
    template    tinytext    null,
    created     date        null,
    expire_date date        null,
        primary key (id),
    foreign key (bot_id) references bot(id)
);

CREATE TABLE IF NOT EXISTS task
(
    id          bigint auto_increment,
    bot_user_id bigint      null,
    description varchar(45) null,
    type        varchar(45) null,
    payload     varchar(45) null,
    frequency   varchar(45) null,
    created     date        null,
    expire_date date        null,
    primary key (id),
    foreign key (bot_user_id) references bot_user(id)
);

