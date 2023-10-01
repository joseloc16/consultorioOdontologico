package com.todocode.consultorioodontologico.logica;

public class Responsable extends Persona {

    private int id_responsable;
    private String tipoResponsabilidad;

    public Responsable() {
    }

    public Responsable(String dni, String nombre, String apellido, String telefono, String direccion,
                       String fechaNacimiento, int id_responsable, String tipoResponsabilidad) {
        super(dni, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.id_responsable = id_responsable;
        this.tipoResponsabilidad = tipoResponsabilidad;
    }

    public int getId_responsable() {
        return id_responsable;
    }

    public void setId_responsable(int id_responsable) {
        this.id_responsable = id_responsable;
    }

    public String getTipoResponsabilidad() {
        return tipoResponsabilidad;
    }

    public void setTipoResponsabilidad(String tipoResponsabilidad) {
        this.tipoResponsabilidad = tipoResponsabilidad;
    }
}
