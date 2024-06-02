package com.todocode.consultorioodontologico.logica;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Entity
public class Secretario extends Persona {

    private String sector;
    @OneToOne
    private Usuario usuario;

    public Secretario() {
    }

    public Secretario(int id, String dni, String nombre, String apellido, String telefono, String direccion,
                      LocalDateTime fechaNacimiento, String sector, Usuario usuario) {
        super(id, dni, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.sector = sector;
        this.usuario = usuario;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
