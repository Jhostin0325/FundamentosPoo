/**
 * 
 */
package universidad;

/**
 * @author familiamerchan
 *
 */
public class Asignatura {
	private int codigo;
	private String denominacion;
	private Docente docente;
	
	public Asignatura(int codigo, String denominacion, Docente docente) {
		super();
		this.codigo = codigo;
		this.denominacion = denominacion;
		this.docente = docente;
	}

	@Override
	public String toString() {
		return codigo + " -	" + denominacion + " - " + docente.getNombre();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	
}
