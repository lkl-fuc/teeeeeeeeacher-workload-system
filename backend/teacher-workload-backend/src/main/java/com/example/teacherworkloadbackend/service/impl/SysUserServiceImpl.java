package com.example.teacherworkloadbackend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.teacherworkloadbackend.dto.LoginResponse;
import com.example.teacherworkloadbackend.entity.SysUser;
import com.example.teacherworkloadbackend.mapper.SysUserMapper;
import com.example.teacherworkloadbackend.service.SysUserService;
import com.example.teacherworkloadbackend.util.JwtUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    private final JwtUtils jwtUtils;

    public SysUserServiceImpl(JwtUtils jwtUtils) {
        this.jwtUtils = jwtUtils;
    }

    @Override
    public LoginResponse login(String username, String password) {
        SysUser user = this.getOne(new LambdaQueryWrapper<SysUser>()
                .eq(SysUser::getUsername, username)
                .last("limit 1"));

        if (user == null || !StringUtils.hasText(user.getPassword()) || !user.getPassword().equals(password)) {
            return null;
        }

        Map<String, Object> claims = new HashMap<>();
        claims.put("userId", user.getId());
        claims.put("username", user.getUsername());
        claims.put("role", user.getRole());
        claims.put("realName", user.getRealName());
        claims.put("teacherId", user.getTeacherId());

        String token = jwtUtils.generateToken(user.getUsername(), claims);

        return LoginResponse.builder()
                .token(token)
                .role(user.getRole())
                .realName(user.getRealName())
                .teacherId(user.getTeacherId())
                .build();
    }
}
