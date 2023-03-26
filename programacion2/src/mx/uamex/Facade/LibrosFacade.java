package mx.uamex.Facade;

import java.util.List;

import Servicios.BibliotecaS;
import programacion2.Libros;
import uaemex.mx.LibrosDAO;

public abstract class LibrosFacade implements BibliotecaS {
    LibrosDAO libroDao = new LibrosDAO();

  
    @Override
   public void agregarLibro(List<Libros> lista, Libros libro) {
      libroDao.Agregar(libro);
   }

 
   
    @Override
   public void actualizarLibro(List<Libros> lista, Libros libro) {
       libroDao.Actualizar(libro);
   }
   

    @Override
   public void eliminarLibro(List<Libros> lista, Libros libro) {
       libroDao.Eliminar(libro);

  
    @Override
   public void buscarLibro(List<Libros> lista, Libros libro) {
       libroDao.Buscar(0);
   }

  
   
   
   
}