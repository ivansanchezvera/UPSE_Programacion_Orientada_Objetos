package herencia.poo.facsistel.upse;

import java.util.Random;

public class Masajista extends PersonalSeleccionFutbol {

	private String titulo;
	
	public Masajista(String nombre, String apellidos, int edad, String titulo) {
		super(nombre, apellidos, edad);
		this.titulo = titulo;
	}

	@Override
	public void entrenamiento() {
		Random r = new Random();
		int parteAMasajear = r.nextInt(5);
		String parteDelCuerpo = "";
		
		switch (parteAMasajear) {
		case 0:
			parteDelCuerpo = "Cabeza";
			break;
		case 1:
			parteDelCuerpo = "Pierna";
			break;
		case 2:
			parteDelCuerpo = "Espalda";
			break;
		case 3:
			parteDelCuerpo = "Pecho";
			break;
		case 4:
			parteDelCuerpo = "Brazos";
			break;
		default:
			parteDelCuerpo = "Tobillo";
			break;
		}
		
		System.out.println("Hoy me toca masajear muchas " + parteDelCuerpo);

	}

	public void pedirAsistenciaMedica()
	{
		System.out.println("Se jodio el jugador, necesito llamar a un Deportologo!!!");
	}
}
