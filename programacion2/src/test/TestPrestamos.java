package test;

import java.util.List;
import java.util.Scanner;
import programacion2.Alumnos;
import programacion2.Libros;
import programacion2.Prestamos;
import programacion2.Profesores;
import uaemex.mx.AlumnosDAO;
import uaemex.mx.LibrosDAO;
import uaemex.mx.PrestamoDAO;
import uaemex.mx.ProfesoresDAO;

public class TestPrestamos {

    AlumnosDAO alumnoDao = new AlumnosDAO();
    LibrosDAO libroDao = new LibrosDAO();
    PrestamoDAO prestamoDao = new PrestamoDAO();
    ProfesoresDAO profesorDao = new ProfesoresDAO();

    public void testCrearPrestamo(Prestamos prestamo) {
        prestamoDao.Agregar(prestamo);
        System.out.println("Fin agregar prestamo");

    }

    public void testCrearLibro(Libros libro) {
        libroDao.Agregar(libro);
        System.out.println("Fin agregar");

    }

    public void testCrearAlumno(Alumnos alumno) {
        alumnoDao.agragarAlumno(alumno);
        System.out.println("agregoalumno");
    }
    public void testCrearprofesor(Profesores profesor) {
    	profesorDao.Agregar(profesor);
        System.out.println("agregoprofesor");
    }

    public void consultarPrestamo() {


        Prestamos p = prestamoDao.Buscar(1);
        System.out.println("Bsqueda por id  " + p.toString());
    }

    public void consultarTodos() {
        List<Prestamos> prestamos = prestamoDao.imprimirtListaPrestamos();

        for (Prestamos p : prestamos) {
            System.out.println(p.toString());
        }

    }

}