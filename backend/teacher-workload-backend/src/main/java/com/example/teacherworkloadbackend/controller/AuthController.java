package com.example.teacherworkloadbackend.controller;

import com.example.teacherworkloadbackend.common.Result;
import com.example.teacherworkloadbackend.dto.LoginRequest;
import com.example.teacherworkloadbackend.dto.LoginResponse;
import com.example.teacherworkloadbackend.service.SysUserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final SysUserService sysUserService;

    public AuthController(SysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }

    @PostMapping("/login")
    public Result<LoginResponse> login(@Valid @RequestBody LoginRequest request) {
        LoginResponse response = sysUserService.login(request.getUsername(), request.getPassword());
        if (response == null) {
            return Result.fail(401, "用户名或密码错误");
        }
        return Result.success("登录成功", response);
    }
}
