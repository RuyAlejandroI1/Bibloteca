package test;

import java.util.ArrayList;
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

public class TestPrestamos3 {
	
	public class Test2prueba {
	    //variables esaticas por su alcanze

	    static Libros libro;
	    static Alumnos alumno;
	    static Profesores profesor;
	    static Prestamos prestamo;
	    static boolean salir = false;
	    static int id = 0;
	    static int isb = 0;
	    static int num = 0;
	    static Scanner leer = new Scanner(System.in);
	    static LibrosDAO metodosL = new LibrosDAO();
	    static AlumnosDAO metodosA = new AlumnosDAO();
	    static ProfesoresDAO metodosP = new ProfesoresDAO();
	    static PrestamoDAO metodosPr = new PrestamoDAO();
	    static List<Alumnos> lista = new ArrayList<>();
	    static List<Libros> listLibro = new ArrayList<>();
	    static List<Profesores> listProfesor = new ArrayList<>();
	    static int opc;

	    public static void main(String[] args) {

	        do { //bucle para regresar al menu

	            //menu 
	            System.out.println("----------------------------------------");
	            System.out.println("            Menu                        ");
	            System.out.println("----------------------------------------");
	            System.out.println("Que movimiento desea hacer");
	            System.out.println("1.- Libro");
	            System.out.println("2.- Alumno");
	            System.out.println("3.- Profesor");
	            System.out.println("4.- salir");
	            System.out.println("Elija una opcion");
	            opc = leer.nextInt();

	            switch (opc) {
	                case 1 -> {
	                    System.out.println("----------------------------------------");
	                    System.out.println("              Libro                     ");
	                    System.out.println("----------------------------------------");
	                    System.out.println("Que desea hacer");
	                    System.out.println("1.- Ingresar registro");
	                    System.out.println("2.- Actualizar");
	                    System.out.println("3.- eliminar");
	                    System.out.println("4.- buscar prestamo");
	                    System.out.println("Elija una opcion");
	                    opc = leer.nextInt();
	                    menuL(opc);

	                }
	                case 2 -> {
	                    System.out.println("----------------------------------------");
	                    System.out.println("             Alumno                     ");
	                    System.out.println("----------------------------------------");
	                    System.out.println("Que desea hacer");
	                    System.out.println("1.- Ingresar registro");
	                    System.out.println("2.- Actualizar");
	                    System.out.println("3.- eliminar");
	                    System.out.println("4.-Prestamo");
	                    System.out.println("Elija una opcion");
	                    opc = leer.nextInt();
	                    menuA(opc);
	                }
	                case 3 -> {
	                    System.out.println("----------------------------------------");
	                    System.out.println("             Profesor                   ");
	                    System.out.println("----------------------------------------");
	                    System.out.println("Que desea hacer");
	                    System.out.println("1.- Ingresar registro");
	                    System.out.println("2.- Actualizar");
	                    System.out.println("3.- eliminar");
	                    System.out.println("4.- Prestamo");
	                    System.out.println("Elija una opcion");
	                    opc = leer.nextInt();
	                    menuP(opc);

	                }
	                case 4 -> {
	                    salir = true;
	                }

	            }
	        } while (!salir);
	        metodosA.imprimirAlumno((ArrayList<Alumnos>) lista);
	        metodosL.Imprimir((ArrayList<Libros>) listLibro);
	        metodosP.Imprimir((ArrayList<Profesores>) listProfesor);
	        System.out.println(prestamo.toString());
	       
	       
	        System.out.println("FIN");
	    }

	    //metodo menus 
	    public static void menuL(int opc) {
	        boolean Bandera = true;
	        switch (opc) {
	            case 1 -> {
	                while (Bandera) {

	                    libro = new Libros();
	                    System.out.println("Ingrese el titulo del libro");
	                    libro.setNombreL(leer.next());
	                    System.out.println("Ingrese el isbn");
	                    libro.setISBN(leer.nextInt());
	                    System.out.println("Ingrese la editorial");
	                    libro.setEditorial(leer.next());
	                    System.out.println("Ingres la categoria");
	                    libro.setCategoria(leer.next());
	                    System.out.println("Ingrese el stock ");
	                    libro.setStock(leer.nextInt());
	                    metodosL.Agregar(libro);

	                    System.out.println("\nDesea ingresar otro libro? \n\n1.- para si \n0.- volver al principal menu");
	                    opc = leer.nextInt();
	                    // condicion para el bucle de bandera
	                    if (opc != 1) {
	                        Bandera = (false);

	                    }
	                }
	            }

	            case 2 -> {

	                while (Bandera) {
	                    System.out.println("Ingrese el numero de id");
	                    id = leer.nextInt();
	                    libro = metodosL.Buscar(id);

	                    if (libro == null) {
	                        System.out.println("NNo existe el libro");

	                    } else {
	                        System.out.println("Ingrese el Titulo");
	                        libro.setNombreL(leer.next());
	                        System.out.println("Ingrese el isbn");
	                        libro.setISBN(leer.nextInt());
	                        System.out.println("Ingres la categoria");
	                        libro.setCategoria(leer.next());
	                        metodosL.Actualizar(libro);
	                    }

	                    System.out.println("\nDesea desea realizar otra actualizacion? \n\n1.- para si \n0.- volver al principal menu");
	                    opc = leer.nextInt();
	                    // condicion para el bucle de bandera
	                    if (opc != 1) {
	                        Bandera = (false);

	                    }
	                }
	            }

	            case 3 -> {
	                while (Bandera) {
	                    System.out.println("Ingrese el numero de id");
	                    id = leer.nextInt();
	                    libro = metodosL.Buscar(id);

	                    if (libro == null) {
	                        System.out.println("NNo existe el libro");

	                    } else {
	                        metodosL.Eliminar(libro);
	                    }

	                    System.out.println("\nDesea eliminar otro registro? \n\n1.- para si \n0.- volver al principal menu");
	                    opc = leer.nextInt();
	                    // condicion para el bucle de bandera
	                    if (opc != 1) {
	                        Bandera = (false);

	                    }
	                }

	            }
	        }
	    }

	    public static void menuA(int opc) {
	        boolean Bandera = true;
	        switch (opc) {
	            case 1 -> {
	                while (Bandera) {
	                    alumno = new Alumnos();
	                    System.out.println("Ingrese el numero de cuenta");
	                    alumno.setNodecuenta(leer.nextInt());
	                    System.out.println("Ingrese el nombre");
	                    alumno.setNombre(leer.next());
	                    System.out.println("Ingrese apellidos");
	                    alumno.setApellidos(leer.next());
	                    System.out.println("Ingrese el genero");
	                    alumno.setGenero(leer.next());
	                    alumno.setId(id);
	                    id = id + 1;

	                    metodosA.agragarAlumno(alumno);

	                    System.out.println("\nDesea agregar otro alumno? \n\n1.- para si \n0.- volver al principal menu");
	                    opc = leer.nextInt();
	                    // condicion para el bucle de bandera
	                    if (opc != 1) {
	                        Bandera = (false);

	                    }
	                }
	            }

	            case 2 -> {
	                System.out.println("Ingrese el numero de id");
	                id = leer.nextInt();
	                alumno = metodosA.buscarAlumno(id);

	                if (alumno == null) {
	                    System.out.println("NNo existe el alumno");

	                } else {
	                    System.out.println("Ingrese el nombre");
	                    alumno.setNombre(leer.next());
	                    System.out.println("Ingrese aprllidos");
	                    alumno.setApellidos(leer.next());
	                    System.out.println("Ingrese el genero");
	                    alumno.setGenero(leer.next());
	                    metodosA.actualizarAlumno(alumno);
	                }

	                while (Bandera) {

	                    System.out.println("\nDesea eliminar otro registro? \n\n1.- para si \n0.- volver al principal menu");
	                    opc = leer.nextInt();
	                    // condicion para el bucle de bandera
	                    if (opc != 1) {
	                        Bandera = (false);

	                    }
	                }
	            }

	            case 3 -> {
	                System.out.println("Ingrese el numero de id");
	                id = leer.nextInt();
	                alumno = metodosA.buscarAlumno(id);

	                if (alumno == null) {
	                    System.out.println("NNo existe el alumno");

	                } else {
	                    metodosA.eliminarAlumno(alumno);
	                }

	                while (Bandera) {
	                    System.out.println("\nDesea eliminar otro registro?? \n\n1.- para si \n0.- volver al principal menu");
	                    opc = leer.nextInt();
	                    // condicion para el bucle de bandera
	                    if (opc != 1) {
	                        Bandera = (false);

	                    }
	                }

	            }
	            case 4 -> {
	                prestamo = new Prestamos();
	                System.out.println("Ingrese el folio");
	                prestamo.setFolio(leer.nextInt());
	                prestamo.setF_inicio(opc);
	                prestamo.setEstatus("regular");
	                
	                prestamo.setLibros(listLibro);
	                prestamo.setPersona(alumno);
	            }

	        }
	    }

	    public static void menuP(int opc) {
	        boolean Bandera = true;
	        switch (opc) {
	            case 1 -> {
	                while (Bandera) {
	                    profesor = new Profesores();
	                    System.out.println("Ingrese el numero de empleado");
	                    profesor.setNtrabajador(leer.nextInt());
	                    System.out.println("Ingrese el nombre");
	                    profesor.setNombre(leer.next());
	                    System.out.println("Ingrese apellidos");
	                    profesor.setApellidos(leer.next());
	                    System.out.println("Ingrese el genero");
	                    profesor.setGenero(leer.next());
	                    metodosP.Agregar(profesor);
	                    profesor.setId(id);
	                    id = id + 1;
	                    System.out.println("\nDesea ingresar otro Profesor? \n\n1.- para si \n0.- volver al principal menu");
	                    opc = leer.nextInt();

	                    // condicion para el bucle de bandera
	                    if (opc != 1) {
	                        Bandera = (false);

	                    }
	                }
	            }

	            case 2 -> {
	                while (Bandera) {
	                    System.out.println("Ingrese el numero de id");
	                    id = leer.nextInt();
	                    profesor = metodosP.Buscar(id);
	                    if (alumno == null) {
	                        System.out.println("NNo existe el Profesor");

	                    } else {
	                        System.out.println("Ingrese el nombre");
	                        profesor.setNombre(leer.next());
	                        System.out.println("Ingrese apellidos");
	                        profesor.setApellidos(leer.next());
	                        System.out.println("Ingrese el genero");
	                        profesor.setGenero(leer.next());
	                        metodosP.Actualizar(profesor);
	                    }

	                    System.out.println("\nDesea realizar otra actualizacion? \n\n1.- para si \n0.- volver al principal menu");
	                    opc = leer.nextInt();
	                    // condicion para el bucle de bandera
	                    if (opc != 1) {
	                        Bandera = (false);

	                    }
	                }
	            }

	            case 3 -> {
	                while (Bandera) {
	                    System.out.println("Ingrese el numero de id");
	                    id = leer.nextInt();
	                    profesor = metodosP.Buscar(id);

	                    if (alumno == null) {
	                        System.out.println("NNo existe el Profesor");

	                    } else {
	                        metodosP.Eliminar(profesor);
	                    }

	                    // condicion para el bucle de bandera
	                    if (opc != 1) {
	                        Bandera = (false);

	                    }
	                }

	            }
	            case 4 -> {
	                while (Bandera) {
	                    prestamo = new Prestamos();
	                    System.out.println("Ingrese el folio");
	                    prestamo.setId(leer.nextInt());
	                    prestamo.setFolio(leer.nextInt());
	                    prestamo.setF_inicio(leer.nextInt());
	                    prestamo.setF_devolucion(leer.nextInt());
	                    prestamo.setLibros(listLibro);
	                    prestamo.setPersona(alumno);
	                    prestamo.setEstatus(leer.next());
	                    

	                }
	            }
	        }
	    }
	}
}

	   
	
