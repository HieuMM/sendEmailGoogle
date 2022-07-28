package com.example.demosendmailforgot.service;

public interface AuthService {
    void sendMailResetPassword(String mail);
    void sendMailAll(String mail,String content);
}
