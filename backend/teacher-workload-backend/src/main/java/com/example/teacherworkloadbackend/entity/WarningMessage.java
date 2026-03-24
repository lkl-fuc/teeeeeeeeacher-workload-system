package com.example.teacherworkloadbackend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("warning_message")
public class WarningMessage {

    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField("teacher_id")
    private Long teacherId;

    @TableField("warning_type")
    private String warningType;

    @TableField("warning_content")
    private String warningContent;

    private String level;

    private Integer status;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("handle_time")
    private LocalDateTime handleTime;
}
