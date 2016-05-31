package upse.facsistel.academico;

public class Estudiante {
	private String nombre;
	private String apodo;
	private double promedioTotal;
	private int materiasAprobadas;
	
	public Estudiante(String nombre)
	{
		this.nombre = nombre;
		this.promedioTotal = 0;
		this.materiasAprobadas = 0;
	}
}
