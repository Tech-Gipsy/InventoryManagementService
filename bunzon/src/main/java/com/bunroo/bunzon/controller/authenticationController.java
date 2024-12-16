package com.bunroo.bunzon.controller;


import com.bunroo.bunzon.request.AuthRequest;
import com.bunroo.bunzon.response.BaseResponse;
import com.bunroo.bunzon.service.AuthenticationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class authenticationController {

    @Autowired
    private AuthenticationInterface authService;
    @GetMapping("/login")
    public BaseResponse loginUser(@RequestBody AuthRequest request)
    {
        return authService.userLogin(request);
    }
    @GetMapping("/list")
    public BaseResponse getUserList()
    {
        return authService.getUserList();
    }
}
