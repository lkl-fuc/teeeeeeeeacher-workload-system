package com.example.teacherworkloadbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.teacherworkloadbackend.entity.Teacher;
import com.example.teacherworkloadbackend.mapper.TeacherMapper;
import com.example.teacherworkloadbackend.service.TeacherService;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {
}
