package com.example.teacherworkloadbackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.teacherworkloadbackend.dto.LoginResponse;
import com.example.teacherworkloadbackend.entity.SysUser;

public interface SysUserService extends IService<SysUser> {

    LoginResponse login(String username, String password);
}
