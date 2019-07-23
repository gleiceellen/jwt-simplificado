package com.dio.jwt.dto;

import com.dio.jwt.model.User;

public class DadosLogin {

    private String email;
    private String senha;

    public DadosLogin() {

    }

    public DadosLogin(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}
