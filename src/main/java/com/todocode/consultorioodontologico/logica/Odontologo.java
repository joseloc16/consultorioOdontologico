package com.todocode.consultorioodontologico.logica;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Odontologo extends Persona {

    private String especialidad;
    //Bidireccional, va a estar en ambas clases
    @OneToMany(mappedBy = "odontologo")
    private List<Turno> listaTurnos;
    @OneToOne
    private Usuario usuario;
    @OneToOne
    private Horario horario;

    public Odontologo() {
    }

    public Odontologo(int id, String dni, String nombre, String apellido, String telefono, String direccion, LocalDateTime fechaNacimiento, String especialidad, List<Turno> listaTurnos, Usuario usuario, Horario horario) {
        super(id, dni, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.especialidad = especialidad;
        this.listaTurnos = listaTurnos;
        this.usuario = usuario;
        this.horario = horario;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
