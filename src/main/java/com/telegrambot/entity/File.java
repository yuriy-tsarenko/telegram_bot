package com.telegrambot.entity;

import com.telegrambot.util.DAOEntity;
import com.telegrambot.util.Repository;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "file")
@DynamicUpdate
public class File extends Repository implements DAOEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "bot_user_id")
    private Long botUserId;

    @Column(name = "file_id")
    private String fileId;

    @Column(name = "file_unique_id")
    private String fileUniqueId;

    @Column(name = "size")
    private Long size;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "time_type")
    private Date timeType;

    @Column(name = "file_size")
    private Date fileSize;

    @Column(name = "file_content")
    private String fileContent;
}
