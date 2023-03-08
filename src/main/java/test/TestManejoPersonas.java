package test;

import datos.*;
import domain.*;
import java.util.List;

/**
 *
 * @author Sebastian
 */
public class TestManejoPersonas {
    public static void main(String[] args) {
        
        /* PERSONAS */
        
        PersonaDAO personaDao = new PersonaDAO();
        
        //Insertar persona
        //Persona personaNueva = new Persona("Carlos","Esparza","carlos@gmail.com","3316916086");
        //personaDao.insertar(personaNueva);
        
        //Actualizar persona
        //Persona personaActualizada = new Persona(4,"Juan","Perez","juan@gmail.com","3316916086");
        //personaDao.actualizar(personaActualizada);
        
        //Eliminar persona
        //Persona personaEliminar = new Persona(4);
        //personaDao.eliminar(personaEliminar);
        
        //Seleccionar personas
        //List<Persona> personas = personaDao.seleccionar();
        //personas.forEach(persona -> {
        //    System.out.println("persona = " + persona);
        //});
        
        /* USUARIOS */
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        
        //Insertar usuario
        //Usuario usuarioNuevo = new Usuario("pedro","0987");
        //usuarioDao.insertar(usuarioNuevo);
        
        //Actualizar usuario
        //Usuario usuarioActualizar = new Usuario(2,"Jose","5678");
        //usuarioDao.actualizar(usuarioActualizar);
        
        //Eliminar usuario
        //Usuario usuarioEliminar = new Usuario(1);
        //usuarioDao.eliminar(usuarioEliminar);
        
        //Seleccionar Usuarios
        //List<Usuario> usuarios = usuarioDao.seleccionar();
        //usuarios.forEach(usuario -> {
        //    System.out.println("usuario = " + usuario);
        //});
    }
}
