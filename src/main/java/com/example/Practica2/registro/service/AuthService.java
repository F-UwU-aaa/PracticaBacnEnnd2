package com.example.Practica2.registro.service;



import com.example.Practica2.registro.dto.LoginRequestDTO;
import com.example.Practica2.registro.dto.SignupRequestDTO;
import com.example.Practica2.registro.dto.LoginResponseDTO;
import com.example.Practica2.registro.dto.SessionInfoDTO;
import jakarta.servlet.http.HttpServletRequest;

import java.security.Principal;

public interface AuthService {
    LoginResponseDTO login(LoginRequestDTO request);
    LoginResponseDTO signup(SignupRequestDTO request);
    SessionInfoDTO getSessionInfo(Principal principal);
    String logout(HttpServletRequest request);
}
