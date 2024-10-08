package com.gemt.ges.security.service;

import com.gemt.ges.business.facade.EmpleadoFacade;
import com.gemt.ges.domain.dtos.empleado.EmpleadoCompletoDto;
import com.gemt.ges.repositories.EmpleadoRepository;
import com.gemt.ges.security.dto.AuthResponse;
import com.gemt.ges.security.dto.EmpleadoCreate;
import com.gemt.ges.security.dto.EmpleadoLogin;
import com.gemt.ges.security.jwt.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImp implements AuthService{
    @Autowired
    private EmpleadoRepository empleadoRepository;
    @Autowired
    private JwtService jwtService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private EmpleadoFacade empleadoFacade;

    public AuthResponse login(EmpleadoLogin request){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(),request.getPassword()));
        UserDetails user = empleadoRepository.findByEmail(request.getEmail()).orElseThrow();
        String token = jwtService.getToken(user);
        return AuthResponse.builder()
                .token(token)
                .build();
    }

    @Override
    public EmpleadoCompletoDto register(EmpleadoCreate request) {
        request.setPassword(passwordEncoder.encode(request.getPassword()));
        return empleadoFacade.createNew(request);
    }
}
