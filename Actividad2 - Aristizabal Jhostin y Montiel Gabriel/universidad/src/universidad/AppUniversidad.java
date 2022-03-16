/**
 * 
 */
package universidad;

import java.util.Scanner;

/**
 * @author familiamerchan
 *
 */
public class AppUniversidad {

	private static Scanner datoUsuario = new Scanner(System.in);
	private static Scanner stringUsuario = new Scanner(System.in);
	private static Scanner floatUsuario = new Scanner(System.in);
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		int opcionElegida;
		
		Docente docente= new Docente(1001, "William Frasser", "Ingeniero en sistemas");
	    Asignatura asignatura= new Asignatura(5012, "Fundamentos de Diseño de Software",docente);
		System.out.println("Ingrese la capacidad total de estudiantes");
		int cantidad = datoUsuario.nextInt();
		Curso curso = new Curso(2002, asignatura, "G01", docente, cantidad);
		curso.getListaEstudiante();
		
		do {
			System.out.println("      Menu");
		    System.out.println("1. Inscribir estudiantes");
		    System.out.println("2. Mostrar lista de estudiantes inscritos");
		    System.out.println("3. Buscar estudiante y mostrar datos");
		    System.out.println("4. Modificar datos de un estudiante");
		    System.out.println("5. Mostrar calificacion de los estudiantes");
		    System.out.println("6. Salir");
		    System.out.println("Digita la opcion deseada:");
		    opcionElegida= datoUsuario.nextInt();
	
		    switch (opcionElegida) {
			case 1:
				float nota[] = new float[3];
				System.out.println("Ingrese el codigo: ");
				int codigo = datoUsuario.nextInt();
				System.out.println("Ingrese el nombre: ");
				String nombre = stringUsuario.nextLine();
				for(int i=0; i<3; i++){
					System.out.println("Ingrese la nota: ");
					float nota1 = floatUsuario.nextFloat();
					nota[i] = nota1;
				}
				Estudiante estudiante= new Estudiante(codigo, nombre, asignatura, nota);
				estudiante.calcularNotaFinal();
				curso.agregarEstudiante(estudiante);
				break;
			case 2:
				curso.mostrarLista();
				break;
			case 3:
				System.out.println("Ingrese la identificacion del estudiante: ");
				int identificacion = datoUsuario.nextInt();
				curso.buscarEstudiante(identificacion);
				break;
			case 4:
				System.out.println("Ingrese la identificacion del estudiante: ");
				int identificacion1 = datoUsuario.nextInt();
				float notaModificada[] = new float[3];
				System.out.println("Ingrese el codigo: ");
				int codigoModificado = datoUsuario.nextInt();
				System.out.println("Ingrese el nombre: ");
				String nombreModificado = stringUsuario.nextLine();
				for(int i=0; i<3; i++){
					System.out.println("Ingrese la nota:");
					float nota1 = floatUsuario.nextFloat();
					notaModificada[i] = nota1;
				}
				curso.modificarEstudiante(identificacion1, codigoModificado, nombreModificado, notaModificada);
				break;
				/*System.out.println("Ingrese la identificacion del estudiante: ");
				int identificacion1 = datoUsuario.nextInt();
				curso.modificarEstudiante(identificacion1);
				float notaModificada[] = new float[3];
				System.out.println("Ingrese el codigo: ");
				int codigoModificado = datoUsuario.nextInt();
				curso.modificarEstudiante(identificacion1).setIdentificacion(codigoModificado);
				System.out.println("Ingrese el nombre: ");
				String nombreModificado = stringUsuario.nextLine();
				curso.modificarEstudiante(identificacion1).setNombre(nombreModificado);
				for(int i=0; i<3; i++){
					System.out.println("Ingrese la nota: ");
					float nota1 = floatUsuario.nextFloat();

					notaModificada[i] = nota1;
					curso.modificarEstudiante(identificacion1).setNota(notaModificada);
				}
				break;
				*/
			case 5:
				System.out.println(asignatura);
				System.out.println();
				System.out.println("Codigo     Nombre Apellido		   Asignatura			    c1   c2   c2		Final");
				curso.mostrarLista();
				curso.promedioCurso();
				break;
			case 6:
				opcionElegida = 0;
				System.out.println("Fin del programa");
				break;
			default:
				break;
			}
		    
		} while (opcionElegida != 0);

	}

}
