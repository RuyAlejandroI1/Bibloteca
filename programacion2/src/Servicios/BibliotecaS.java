package Servicios;

import java.util.List;

import programacion2.Alumnos;
import programacion2.Libros;
import programacion2.Prestamos;
import programacion2.Profesores;

public interface BibliotecaS  {
    
    
    
    
    void agragarAlumno (List<Alumnos> lista, Alumnos alumno);
    void actualizarAlumno (List<Alumnos> lista, Alumnos alumno);
    void buscarAlumno (List<Alumnos> lista, Alumnos alumno);
    void eliminarAlumno (List<Alumnos> lista, Alumnos alumno); 
     
   void agregarLibro (List<Libros> lista, Libros libro);
    void actualizarLibro (List<Libros> lista, Libros libro);
    void buscarLibro (List<Libros> lista, Libros libro);
    void eliminarLibro (List<Libros> lista, Libros libro);
    //este se parece mas al que tienen a acepcion del de actualizar y buscar 
    void agregarPrestamo ( Prestamos prestamo);
    void actualizarPrestamo ( List<Prestamos> lista, Prestamos prestamo);
    void buscarPrestamo ( List lista, Prestamos prestamo);
    void eliminarPrestamo (Prestamos prestamo);
    
    void agregarProfesor (List<Profesores> lista, Profesores profesor);
    void actualizarProfesor (List<Profesores> lista, Profesores profesor);
    void buscarProfesor (List<Profesores> lista, Profesores profesor);
    void eliminarProfesor (List<Profesores> lista, Profesores profesor);
    
}
