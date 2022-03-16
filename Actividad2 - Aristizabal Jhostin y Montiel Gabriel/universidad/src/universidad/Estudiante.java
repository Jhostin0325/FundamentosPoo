/**
 * 
 */
package universidad;

import java.util.Arrays;

/**
 * @author familiamerchan
 *
 */
public class Estudiante {
	private int identificacion;
	private String nombre;
	private Asignatura asignatura;
	private float nota[];
	private float notaFinal;
	
	public Estudiante(int identificacion, String nombre, Asignatura asignatura, float[] nota) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.asignatura = asignatura;
		this.nota = nota;
	}
	
	public Estudiante() {
		super();
	}

	@Override
	public String toString() {
		String resultado;
		if (notaFinal >= 3.0) {
			resultado="Aprobo";
		}
		else {
			resultado="No aprobo";
		}
		return identificacion + " - 	" + nombre + " - 	" + asignatura.getDenominacion()
				+ "	- " + Arrays.toString(nota) + "	     " + notaFinal + "		"  + resultado;
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

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public float[] getNota() {
		return nota;
	}

	public void setNota(float[] nota) {
		this.nota = nota;
	}

	public float getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(float notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	public void calcularNotaFinal() {
		notaFinal=0;
		for (int i = 0; i < nota.length; i++) {
			if (i == 0 || i == 1) {
				notaFinal+= nota[i]*0.3;
				Math.round(notaFinal);
			}
			else {
				notaFinal+= nota[i]*0.4;
				Math.round(notaFinal);
			}
		}
	}
	
}
