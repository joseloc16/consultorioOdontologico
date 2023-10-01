package com.todocode.consultorioodontologico.logica;

import javax.persistence.*;
import java.util.List;

public class Paciente extends Persona {

    private int id_paciente;
    private boolean tieneSeguro;
    private String tipoSangre;
    //Relación one to one de Paciente con Responsable
    private Responsable responsable;
    //Relación one to many de Paciente con Turno
    private List<Turno> listaTurnos;

    public Paciente() {
    }

    public Paciente(String dni, String nombre, String apellido, String telefono, String direccion,
                    String fechaNacimiento, int id_paciente, boolean tieneSeguro, String tipoSangre,
                    Responsable responsable, List<Turno> turnoList) {
        super(dni, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.id_paciente = id_paciente;
        this.tieneSeguro = tieneSeguro;
        this.tipoSangre = tipoSangre;
        this.responsable = responsable;
        this.listaTurnos = turnoList;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public List<Turno> getTurnoList() {
        return listaTurnos;
    }

    public void setTurnoList(List<Turno> turnoList) {
        this.listaTurnos = turnoList;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public boolean isTieneSeguro() {
        return tieneSeguro;
    }

    public void setTieneSeguro(boolean tieneSeguro) {
        this.tieneSeguro = tieneSeguro;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
}
