package com.todocode.consultorioodontologico.logica;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Paciente extends Persona {

    private boolean tieneSeguro;
    private String tipoSangre;
    //Relación one to one de Paciente con Responsable
    @OneToOne
    private Responsable responsable;
    //Relación one to many de Paciente con Turno
    @OneToMany(mappedBy = "paciente")
    private List<Turno> listaTurnos;

    public Paciente() {
    }

    public Paciente(int id, String dni, String nombre, String apellido, String telefono, String direccion,
                    LocalDateTime fechaNacimiento, boolean tieneSeguro, String tipoSangre, Responsable responsable,
                    List<Turno> listaTurnos) {
        super(id, dni, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.tieneSeguro = tieneSeguro;
        this.tipoSangre = tipoSangre;
        this.responsable = responsable;
        this.listaTurnos = listaTurnos;
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
