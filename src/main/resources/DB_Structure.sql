CREATE database if not exists telegram_bot;
SET FOREIGN_KEY_CHECKS=0;
use telegram_bot;
DROP TABLE IF EXISTS bot;
DROP TABLE IF EXISTS message_template;
DROP TABLE IF EXISTS bot_user;
DROP TABLE IF EXISTS task;
DROP TABLE IF EXISTS community;
DROP TABLE IF EXISTS bot_chat;
CREATE TABLE bot
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    bot_name VARCHAR(30) NOT NULL,
    bot_token VARCHAR(30) NOT NULL,
    base_url VARCHAR(30) NOT NULL
);
CREATE TABLE message_template
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    bot_id BIGINT NOT NULL,
    description VARCHAR(30) NOT NULL,
    type VARCHAR(30) NOT NULL,
    template TEXT NOT NULL,
    created Date NOT NULL,
    expire_date Date NOT NULL,
    FOREIGN KEY (bot_id) REFERENCES bot(id) ON DELETE CASCADE
);
CREATE TABLE bot_user
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT NOT NULL,
    first_name VARCHAR(30) NOT NULL,
    is_bot bool NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    user_name VARCHAR(30) NOT NULL,
    laguage_code VARCHAR(30) NOT NULL,
    can_join_groups VARCHAR(30) NOT NULL,
    can_read_all_froup_messages VARCHAR(30) NOT NULL,
    support_inline_queries VARCHAR(30) NOT NULL
);
CREATE TABLE file
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    bot_user_id BIGINT NOT NULL,
    file_id VARCHAR(30) NOT NULL,
    file_unique_id VARCHAR(30) NOT NULL,
    size BIGINT NOT NULL,
    file_name VARCHAR(30) NOT NULL,
    mime_type Date NOT NULL,
    file_size Date NOT NULL,
    file_content Text,
    FOREIGN KEY (bot_user_id) REFERENCES bot_user(id) ON DELETE CASCADE
);
CREATE TABLE task
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    bot_user_id BIGINT NOT NULL,
    description VARCHAR(30) NOT NULL,
    type VARCHAR(30) NOT NULL,
    payload VARCHAR(30) NOT NULL,
    frequency VARCHAR(30) NOT NULL,
    created Date NOT NULL,
    expire_date Date NOT NULL,
    FOREIGN KEY (bot_user_id) REFERENCES bot_user(id) ON DELETE CASCADE
);
CREATE TABLE community
(
    bot_user_id BIGINT NOT NULL,
    bot_chat_id BIGINT NOT NULL,
    FOREIGN KEY (bot_user_id) REFERENCES bot_user(id) ON DELETE CASCADE,
    FOREIGN KEY (bot_chat_id) REFERENCES bot_chat(id) ON DELETE CASCADE
);
CREATE TABLE bot_chat
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    chat_id BIGINT NOT NULL,
    type VARCHAR(30) NOT NULL,
    title VARCHAR(30) NOT NULL,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    user_name VARCHAR(30) NOT NULL,
    all_members_are_administrators bool NOT NULL,
	description VARCHAR(30) NOT NULL,
	invite_link VARCHAR(30) NOT NULL,
	bio VARCHAR(30) NOT NULL
);
