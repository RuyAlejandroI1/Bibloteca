package test;

import java.util.ArrayList;
import java.util.List;

import uaemex.mx.AlumnosDAO;
import uaemex.mx.LibrosDAO;
import uaemex.mx.PrestamoDAO;
import uaemex.mx.ProfesoresDAO;
import java.util.Scanner;

import programacion2.Alumnos;
import programacion2.Libros;
import programacion2.Prestamos;
import programacion2.Profesores;



public class TestPrestamos2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcion = 0;

		while (opcion != 4) {

			System.out.println("¿Que quieres realizar?");
			System.out.println("1. Ver préstamos 1");
			System.out.println("2. Ver prestamo 2");
			System.out.println("3. Ver prestamo 3");
			System.out.println("4. Salir");

			System.out.print("Seleccione una opción: ");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1 -> {

				Libros libro1 = new Libros();
				libro1.setId(1);
				libro1.setNombreL("Fundamentos de programacion");
				libro1.setCategoria("Programación");
				libro1.setEditorial("Alfaomega");
				libro1.setISBN(2324);
				libro1.setStock(5);

				Libros libro2 = new Libros();
				libro2.setId(1);
				libro2.setNombreL("Calculo");
				libro2.setCategoria("Matematicas");
				libro2.setEditorial("Alfaomega");
				libro2.setISBN(344);
				libro2.setStock(2);

				List<Libros> listaLibros = new ArrayList<>();
				listaLibros.add(libro2);
				listaLibros.add(libro1);

				Alumnos alumno1 = new Alumnos();
				alumno1.setId(1);
				alumno1.setNombre("Ruy Alejandro");
				alumno1.setApellidos("Mejia Rojas");
				alumno1.setNodecuenta(2227124);

				Prestamos prestamo1 = new Prestamos();
				// Date fechaIni = new Date();
				prestamo1.setId(1);
				prestamo1.setFolio(234);
				prestamo1.setF_inicio(0560422);
				prestamo1.setLibros(listaLibros);
				prestamo1.setPersona(alumno1);
				prestamo1.setF_devolucion(100422);
				prestamo1.setEstatus("pendiente");

				TestPrestamos test1 = new TestPrestamos();
				test1.testCrearLibro(libro1);
				test1.testCrearLibro(libro2);
				test1.testCrearAlumno(alumno1);
				test1.testCrearPrestamo(prestamo1);

				test1.consultarTodos();
				test1.consultarPrestamo();

			}
			case 2 -> {
				Libros libro3 = new Libros();
				libro3.setId(1);
				libro3.setNombreL("¿Que es la filosofia?");
				libro3.setCategoria("Filosofia");
				libro3.setEditorial("Pearson");
				libro3.setISBN(3524);
				libro3.setStock(3);

				Libros libro4 = new Libros();
				libro4.setId(1);
				libro4.setNombreL("el arte del sacrificio");
				libro4.setCategoria("Ajedrez");
				libro4.setEditorial("Casa Libros Mexico");
				libro4.setISBN(3448);
				libro4.setStock(2);

				List<Libros> listaLibros = new ArrayList<>();
				listaLibros.add(libro3);
				listaLibros.add(libro4);

				Alumnos alumno2 = new Alumnos();
				alumno2.setId(1);
				alumno2.setNombre("Isabel");
				alumno2.setApellidos("Hernadez");
				alumno2.setNodecuenta(2227682);

				Prestamos prestamo2 = new Prestamos();
				// Date fechaIni = new Date();
				prestamo2.setId(1);
				prestamo2.setFolio(234);
				prestamo2.setF_inicio(0560422);
				prestamo2.setLibros(listaLibros);
				prestamo2.setPersona(alumno2);
				prestamo2.setF_devolucion(100422);
				prestamo2.setEstatus("vencido");

				TestPrestamos test2 = new TestPrestamos();
				test2.testCrearLibro(libro3);
				test2.testCrearLibro(libro4);
				test2.testCrearAlumno(alumno2);
				test2.testCrearPrestamo(prestamo2);

				test2.consultarTodos();
				test2.consultarPrestamo();
			}
			case 3 -> {
				Libros libro5 = new Libros();
				libro5.setId(1);
				libro5.setNombreL("Precalculo");
				libro5.setCategoria("Matematicas");
				libro5.setEditorial("ESCUELA SUPERIOR DE FÍSICA Y MATEMÁTICASINSTITUTO POLITÉCNICO NACIONAL");
				libro5.setISBN(2324);
				libro5.setStock(5);

				Libros libro6 = new Libros();
				libro6.setId(1);
				libro6.setNombreL("Geometria Analitica");
				libro6.setCategoria("Matematicas");
				libro6.setEditorial("Pearson Edition");
				libro6.setISBN(344);
				libro6.setStock(2);

				List<Libros> listaLibros = new ArrayList<>();
				listaLibros.add(libro5);
				listaLibros.add(libro6);

				Profesores profesor = new Profesores();
				profesor.setId(1);
				profesor.setNombre("Alejandro");
				profesor.setApellidos("Elizagay");
				profesor.setGenero("Masculino");
				profesor.setNtrabajador(764563);

				Prestamos prestamo3 = new Prestamos();
				// Date fechaIni = new Date();
				prestamo3.setId(1);
				prestamo3.setFolio(234);
				prestamo3.setF_inicio(0560422);
				prestamo3.setLibros(listaLibros);
				prestamo3.setPersona(profesor);
				prestamo3.setF_devolucion(100422);
				prestamo3.setEstatus("vencido");

				TestPrestamos test2 = new TestPrestamos();
				test2.testCrearLibro(libro5);
				test2.testCrearLibro(libro6);
				test2.testCrearprofesor(profesor);
				test2.testCrearPrestamo(prestamo3);

				test2.consultarTodos();
				test2.consultarPrestamo();
			}
			}
		}
	}
}