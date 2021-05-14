package com.telegrambot.DBEntity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "file")
public class File {
    @Id
    @Column(name = "id")
    Long id;

    @Column(name = "bot_user_id")
    Long botUserId;

    @Column(name = "file_id")
    String fileId;

    @Column(name = "file_unique_id")
    String fileUnique_id;

    @Column(name = "size")
    Long size;

    @Column(name = "file_name")
    String fileName;

    @Column(name = "time_type")
    Date timeType;

    @Column(name = "file_size")
    Date fileSize;

    @Column(name = "file_content")
    String fileContent;
}
