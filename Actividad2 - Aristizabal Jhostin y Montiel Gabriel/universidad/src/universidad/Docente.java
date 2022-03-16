/**
 * 
 */
package universidad;

/**
 * @author familiamerchan
 *
 */
public class Docente {
	private int identificacion;
	private String nombre;
	private String profesion;
	
	public Docente(int identificacion, String nombre, String profesion) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.profesion = profesion;
	}

	@Override
	public String toString() {
		return identificacion + " -	" + nombre + " - " + profesion;
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	
	
}
