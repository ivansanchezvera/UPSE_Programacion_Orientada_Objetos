package upse.facsistel.academico;

import java.util.Random;

public class Estudiante {
	private String nombre;
	private String apodo;
	private double promedioTotal;
	private int materiasAprobadas;
	private String carrera;
	private boolean adeuda;
	
	public Estudiante(String nombre)
	{
		this.nombre = nombre;
		this.promedioTotal = 0;
		this.materiasAprobadas = 0;

	}
	
	public Estudiante(String nombre, String apodo, String carrera)
	{
		this.apodo = apodo;
		this.nombre = nombre;
		this.carrera = carrera;
	}
	
	public void imprimirDiploma()
	{
		//Validar notas
		//Validar Papeles
		//Validar deudas
		try {
			comprobarDeuda();
			System.out.println("El estudiante + " + this.nombre
					+ " al fin se graduo de " + this.carrera);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error de deuda, el estudiante "+ this.nombre + " no se puede graduar. Error" + e.getMessage());
		}
		
		
	}
	
	public void comprobarDeuda() throws Exception
	{
		Random r = new Random();
		int temp = r.nextInt(2);
		if(temp<1)
		{
			adeuda = false;
		}else{
			adeuda = true;
			throw new Exception("Error salvaje aparece");
		}
	
		//Hace magia con el sistema financiero
		
	}
}
