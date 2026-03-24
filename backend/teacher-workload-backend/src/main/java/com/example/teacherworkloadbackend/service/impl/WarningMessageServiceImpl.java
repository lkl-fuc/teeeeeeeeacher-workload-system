package com.example.teacherworkloadbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.teacherworkloadbackend.entity.WarningMessage;
import com.example.teacherworkloadbackend.mapper.WarningMessageMapper;
import com.example.teacherworkloadbackend.service.WarningMessageService;
import org.springframework.stereotype.Service;

@Service
public class WarningMessageServiceImpl extends ServiceImpl<WarningMessageMapper, WarningMessage> implements WarningMessageService {
}
