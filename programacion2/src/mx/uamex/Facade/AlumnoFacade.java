package mx.uamex.Facade;


import java.util.List;

import Servicios.BibliotecaS;
import programacion2.Alumnos;
import uaemex.mx.AlumnosDAO;

	
	 abstract class AlumnoFacade implements BibliotecaS {
		    
		    AlumnosDAO alumnoDao = new AlumnosDAO();

		    @Override
		    public void agragarAlumno(List<Alumnos> lista, Alumnos alumno) {
		        alumnoDao.agragarAlumno(alumno);

		    }

		  
		    @Override
		    public void actualizarAlumno(List<Alumnos> lista, Alumnos alumno) {
		        alumnoDao.actualizarAlumno(alumno);
		    }
		    
		    @Override
		    public void eliminarAlumno(List<Alumnos> lista, Alumnos alumno) {
		        alumnoDao.eliminarAlumno(alumno);
		    }

		  
		    @Override
		    public void buscarAlumno(List<Alumnos> lista, Alumnos alumno) {
		        alumnoDao.buscarAlumno(0);
		    }
		    
		    
		    
		}
