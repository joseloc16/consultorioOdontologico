package com.todocode.consultorioodontologico.logica;

import java.time.LocalDateTime;

public class Turno {

    private int id_turno;
    private LocalDateTime fechaTurno;
    private String horaTurno;
    private String afeccion;
    private Paciente paciente;
    private Odontologo odontologo;

    public Turno() {
    }

    public Turno(int id_turno, LocalDateTime fechaTurno, String horaTurno, String afeccion, Paciente paciente, Odontologo odontologo) {
        this.id_turno = id_turno;
        this.fechaTurno = fechaTurno;
        this.horaTurno = horaTurno;
        this.afeccion = afeccion;
        this.paciente = paciente;
        this.odontologo = odontologo;
    }

    public int getId_turno() {
        return id_turno;
    }

    public void setId_turno(int id_turno) {
        this.id_turno = id_turno;
    }

    public LocalDateTime getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(LocalDateTime fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public String getHoraTurno() {
        return horaTurno;
    }

    public void setHoraTurno(String horaTurno) {
        this.horaTurno = horaTurno;
    }

    public String getAfeccion() {
        return afeccion;
    }

    public void setAfeccion(String afeccion) {
        this.afeccion = afeccion;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }
}
