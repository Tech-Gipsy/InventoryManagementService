package com.bunroo.bunzon.service;

import com.bunroo.bunzon.request.AuthRequest;
import com.bunroo.bunzon.response.BaseResponse;
import org.springframework.stereotype.Service;

public interface AuthenticationInterface {
    public BaseResponse userLogin(AuthRequest request);

    BaseResponse getUserList();
}
