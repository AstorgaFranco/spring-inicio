package com.service.impl;

import com.model.Empleado;
import com.repositori.EmpleadoRepositori;
import com.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class EmpleadoServiceImpl implements EmpleadoService {
    @Autowired
    private EmpleadoRepositori empleadoRepositori;



    @Override
    public Empleado saveEmpleado(Empleado empleado) {
        Optional<Empleado> empleadoGuardado= empleadoRepositori.findByEmail(empleado.getEmail());
    }

    @Override
    public List<Empleado> getAllEmpleados() {
        return null;
    }

    @Override
    public Optional<Empleado> getEmpleadoById(long id) {
        return Optional.empty();
    }

    @Override
    public Empleado updateEmpleado(Empleado empleadoActualizado) {
        return null;
    }

    @Override
    public void deleteEmpleado(long id) {

    }
}
