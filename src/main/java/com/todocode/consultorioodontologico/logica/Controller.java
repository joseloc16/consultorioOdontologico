package com.todocode.consultorioodontologico.logica;

import com.todocode.consultorioodontologico.persistencia.ControllerPersistencia;

public class Controller {
    ControllerPersistencia controllerPersist= new ControllerPersistencia();
    public void crearUsuario(int id, String nombreUsuario, String contrasenia, String rol) {
        Usuario usuario = new Usuario(id, nombreUsuario, contrasenia, rol);
        controllerPersist.crearUsuario (usuario);
    }
}
