package com.example.teacherworkloadbackend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@TableName("workload")
public class Workload {

    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField("teacher_id")
    private Long teacherId;

    @TableField("semester_name")
    private String semesterName;

    @TableField("teaching_hours")
    private BigDecimal teachingHours;

    @TableField("research_score")
    private BigDecimal researchScore;

    @TableField("service_score")
    private BigDecimal serviceScore;

    @TableField("total_score")
    private BigDecimal totalScore;

    @TableField("warning_level")
    private String warningLevel;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;
}
