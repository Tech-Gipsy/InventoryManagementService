package com.bunroo.bunzon.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name="users",schema = "UserManagement")
public class user {
    @Id
    private Long id;
    @Column(name="username")

    private String userName;
    @Column(name="password")
    private String password;
    @Column(name="jwttoken")
    private String jwtToken;
    @Column(name="lastlogin")
    private Date lastLogin;

}
