package com.example.teacherworkloadbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.teacherworkloadbackend.entity.Workload;
import com.example.teacherworkloadbackend.mapper.WorkloadMapper;
import com.example.teacherworkloadbackend.service.WorkloadService;
import org.springframework.stereotype.Service;

@Service
public class WorkloadServiceImpl extends ServiceImpl<WorkloadMapper, Workload> implements WorkloadService {
}
