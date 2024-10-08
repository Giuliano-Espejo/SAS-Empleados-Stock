package com.gemt.ges.security.controller;

import com.gemt.ges.domain.dtos.empleado.EmpleadoCompletoDto;
import com.gemt.ges.security.dto.AuthResponse;
import com.gemt.ges.security.dto.EmpleadoCreate;
import com.gemt.ges.security.dto.EmpleadoLogin;
import com.gemt.ges.security.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
@CrossOrigin("*")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping(value = "login")
    public ResponseEntity<AuthResponse> login(@RequestBody EmpleadoLogin request) {
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping(value = "register")
    public ResponseEntity<EmpleadoCompletoDto> register(@RequestBody EmpleadoCreate request) {
        return ResponseEntity.ok(authService.register(request));
    }
}
