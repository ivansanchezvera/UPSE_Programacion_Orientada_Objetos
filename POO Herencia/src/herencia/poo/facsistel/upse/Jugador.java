package herencia.poo.facsistel.upse;

import java.util.Random;

public class Jugador extends PersonalSeleccionFutbol{

	private int numeroDorsal;
	private PosicionJugador posicion;
	
	Jugador(String nombre, String apellidos, int edad)
	{
		super(nombre, apellidos, edad);
	}
	
	@Override
	public void concentrarse()
	{
		System.out.println("Concentrandose.... A ganar!");
	}
	
	public void jugarPartido()
	{
		System.out.println("Salir ganar con la confianza del profe!");
	}

	@Override
	public void entrenamiento()
	{
		Random r = new Random();
		System.out.println("En el entrenamiento hice " + r.nextInt() + 
				" y me trague " + r.nextInt() + " goles");
	}
	
	public void darDeclaraciones()
	{
		System.out.println("Siempre se sale a ganar pero las cosas a veces no se dan. Queriamos darle la alegria a la hinchada pero no pudo ser.");
	}
}
