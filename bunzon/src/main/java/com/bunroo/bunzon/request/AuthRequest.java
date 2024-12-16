package com.bunroo.bunzon.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthRequest {
    private String userName;
    private String password;
}
