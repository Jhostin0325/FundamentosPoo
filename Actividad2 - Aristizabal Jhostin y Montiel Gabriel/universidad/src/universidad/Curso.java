/**
 * 
 */
package universidad;

/**
 * @author familiamerchan
 *
 */
public class Curso {
	private int codigo;
	private Asignatura asignatura;
	private String grupo;
	private Docente docente;
	private Estudiante[] listaEstudiante;
	private float promedio;
	
	public Curso(int codigo, Asignatura asignatura, String grupo, Docente docente, int cantidad) {
		super();
		this.codigo = codigo;
		this.asignatura = asignatura;
		this.grupo = grupo;
		this.docente = docente;
		listaEstudiante = new Estudiante[cantidad];
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Estudiante[] getListaEstudiante() {
		return listaEstudiante;
	}

	public void setListaEstudiante(Estudiante[] listaEstudiante) {
		this.listaEstudiante = listaEstudiante;
	}
	
	public float getPromedio() {
		return promedio;
	}

	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}

	public void agregarEstudiante(Estudiante estudiante) {
		for (int i = 0; i < listaEstudiante.length; i++) {
			if (listaEstudiante[i] == null) {
				listaEstudiante[i] = estudiante;
				break;
			}
		}
	}
	
	public void mostrarLista() {
		for (Estudiante estudiante : listaEstudiante) {
			if (estudiante != null) {
				System.out.println(estudiante);
			}
			else {
				
			}
		}
	}
	
	public void buscarEstudiante(int identificacion) {
		for (int i = 0; i < listaEstudiante.length; i++) {
			if (identificacion == listaEstudiante[i].getIdentificacion()) {
				System.out.println(listaEstudiante[i]);
				break;
			}
			else {
			
			}
		}
	}
	
	/*public Estudiante modificarEstudiante (int identificacion) {
		for (Estudiante estudiante : listaEstudiante) {
			if (estudiante.getIdentificacion()==identificacion) {
				return estudiante;
			}
			else {
				break;
			}
		}
		return null;
	}*/
	public void modificarEstudiante(int identificacion, int codigo, String nombre, float nota[]) {
		for(int i = 0; i<listaEstudiante.length; i++)
        {
          if (listaEstudiante[i] != null) {
        	  if(identificacion == listaEstudiante[i].getIdentificacion()){
                  listaEstudiante[i].setIdentificacion(codigo);
                  listaEstudiante[i].setNombre(nombre);
                  listaEstudiante[i].setNota(nota);
                  listaEstudiante[i].calcularNotaFinal();
              	}
				break;
          	}
        }            
	}
	
	public void promedioCurso() {
		float notaTotal = 0;
		int contador = 0;
		for (int i = 0; i < listaEstudiante.length; i++) {
			if (listaEstudiante[i] != null) {
				contador = contador + 1;
				notaTotal += listaEstudiante[i].getNotaFinal();
			}
		}
		promedio = notaTotal / contador;
		System.out.println("		Promedio del curso: " + promedio);

	}
}
