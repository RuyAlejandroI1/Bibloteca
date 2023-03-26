package mx.uamex.Facade;

import java.util.List;

import Servicios.BibliotecaS;
import programacion2.Prestamos;
import uaemex.mx.PrestamoDAO;


	public abstract class PrestamosFacade implements BibliotecaS {
	    PrestamoDAO prestamoDao = new PrestamoDAO();

	   
	    @Override
	    public void agregarPrestamo(Prestamos prestamo) {
	       prestamoDao.Agregar(prestamo);
	    }

	   public void buscarPrestamo(List lista, Prestamos prestamo) {
	       prestamoDao.Buscar(0);
	   }
	    
	    @Override
	    public void actualizarPrestamo(List<Prestamos> lista, Prestamos prestamo) {
	       prestamoDao.Actualizar(prestamo);
	    }
	    

	  
	    @Override
	    public void eliminarPrestamo(Prestamos prestamo) {
	        prestamoDao.Eliminar(prestamo);
	    }

	   
	  

	   
	    
	}
