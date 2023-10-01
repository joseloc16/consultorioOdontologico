package com.todocode.consultorioodontologico.logica;

import javax.persistence.*;
import java.util.List;

public class Odontologo extends Persona {

    private int id_odontologo;
    private String especialidad;
    private List<Turno> listaTurnos;
    private Usuario usuario;
    private Horario horario;

    public Odontologo() {
    }

    public Odontologo(String dni, String nombre, String apellido, String telefono, String direccion,
                      String fechaNacimiento, int id_odontologo, String especialidad,
                      List<Turno> listaTurnos, Usuario usuario, Horario horario) {
        super(dni, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.id_odontologo = id_odontologo;
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

    public int getId_odontologo() {
        return id_odontologo;
    }

    public void setId_odontologo(int id_odontologo) {
        this.id_odontologo = id_odontologo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
