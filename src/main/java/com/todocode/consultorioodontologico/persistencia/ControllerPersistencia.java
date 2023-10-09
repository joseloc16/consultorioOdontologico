package com.todocode.consultorioodontologico.persistencia;

import com.todocode.consultorioodontologico.logica.Usuario;

public class ControllerPersistencia {
    HorarioJpaController horarioJpa = new HorarioJpaController();
    OdontologoJpaController odontologoJpa = new OdontologoJpaController();
    PacienteJpaController pacienteJpa = new PacienteJpaController();
    PersonaJpaController personaJpa = new PersonaJpaController();
    ResponsableJpaController responsableJpa = new ResponsableJpaController();
    SecretarioJpaController secretarioJpa = new SecretarioJpaController();
    TurnoJpaController turnoJpa = new TurnoJpaController();
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();

    public void crearUsuario (Usuario usuario) {
        usuarioJpa.create(usuario);
    }
}
