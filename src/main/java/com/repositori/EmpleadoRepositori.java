package com.repositori;

import com.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmpleadoRepositori  extends JpaRepository<Empleado,Long> {

     Optional<Empleado> findByEmail(String email);

}
