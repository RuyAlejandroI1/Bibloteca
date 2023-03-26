package mx.uamex.Facade;

import java.util.List;

import Servicios.BibliotecaS;
import programacion2.Profesores;
import uaemex.mx.ProfesoresDAO;

public abstract class ProfesoresFacade implements BibliotecaS {
    ProfesoresDAO profesorDao = new ProfesoresDAO();

   
    @Override
    public void agregarProfesor(List<Profesores> lista, Profesores profesor) {
       profesorDao.Agregar(profesor);
    }

  
    
    @Override
    public void actualizarProfesor(List<Profesores> lista, Profesores profesor) {
        profesorDao.Actualizar(profesor);
    }
    

    @Override
    public void eliminarProfesor(List<Profesores> lista, Profesores profesor) {
        profesorDao.Eliminar(profesor);
    }

   
    @Override
    public void buscarProfesor(List<Profesores> lista, Profesores profesor) {
        profesorDao.Buscar(0);
    }

   
    
}
