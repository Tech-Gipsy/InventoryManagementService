package com.bunroo.bunzon.service.impl;

import com.bunroo.bunzon.repo.UserRepo;
import com.bunroo.bunzon.request.AuthRequest;
import com.bunroo.bunzon.response.BaseResponse;
import com.bunroo.bunzon.service.AuthenticationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationImpl implements AuthenticationInterface {

    @Autowired
    private UserRepo userRepo;

    @Override
    public BaseResponse userLogin(AuthRequest request) {
        BaseResponse resp=new BaseResponse();
        //resp.setStatusCode("200");
        return resp;
    }

    @Override
    public BaseResponse getUserList() {
        BaseResponse resp=new BaseResponse();
        System.out.println(userRepo.findAll());
        //resp.setStatusCode("200");
        return resp;
    }
}
