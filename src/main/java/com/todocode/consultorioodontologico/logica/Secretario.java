package com.todocode.consultorioodontologico.logica;

public class Secretario extends Persona {

    private int id_secretario;
    private String sector;
    private Usuario usuario;

    public Secretario() {
    }

    public Secretario(String dni, String nombre, String apellido, String telefono,
                      String direccion, String fechaNacimiento, int id_secretario,
                      String sector, Usuario usuario) {
        super(dni, nombre, apellido, telefono, direccion, fechaNacimiento);
        this.id_secretario = id_secretario;
        this.sector = sector;
        this.usuario = usuario;
    }

    public int getId_secretario() {
        return id_secretario;
    }

    public void setId_secretario(int id_secretario) {
        this.id_secretario = id_secretario;
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
