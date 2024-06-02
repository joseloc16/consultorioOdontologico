package com.todocode.consultorioodontologico.logica;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Responsable extends Persona {

    private String tipoResponsabilidad;

    public Responsable() {
    }

    public Responsable(int id, String dni, String nombre, String apellido, String telefono, String direccion,
                       LocalDateTime fechaNacimiento, String tipoResponsabilidad) {
        super(id, dni, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.tipoResponsabilidad = tipoResponsabilidad;
    }

    public String getTipoResponsabilidad() {
        return tipoResponsabilidad;
    }

    public void setTipoResponsabilidad(String tipoResponsabilidad) {
        this.tipoResponsabilidad = tipoResponsabilidad;
    }
}
