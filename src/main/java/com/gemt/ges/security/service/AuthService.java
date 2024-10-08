package com.gemt.ges.security.service;

import com.gemt.ges.domain.dtos.empleado.EmpleadoCompletoDto;
import com.gemt.ges.security.dto.AuthResponse;
import com.gemt.ges.security.dto.EmpleadoCambioPassword;
import com.gemt.ges.security.dto.EmpleadoCreate;
import com.gemt.ges.security.dto.EmpleadoLogin;

public interface AuthService {
    public AuthResponse login(EmpleadoLogin request);
    public EmpleadoCompletoDto register(EmpleadoCreate request);
    public EmpleadoCompletoDto changePassword(EmpleadoCambioPassword request);
}
