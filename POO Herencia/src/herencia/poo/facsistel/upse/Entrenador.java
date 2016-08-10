package herencia.poo.facsistel.upse;

public class Entrenador extends PersonalSeleccionFutbol {
	
	private String credencialFederacion;

	Entrenador(String nombre, String apellidos, int edad)
	{
		super(nombre, apellidos, edad);
		this.edad = edad+1;
	}
	
	public void concentrarse()
	{
		System.out.println("Concentrando jugadores y dandoles la confianza");
	}
	
	public void dirigirPartido()
	{
		System.out.println("Insultar hasta que me explusen...");
	}

	@Override
	public void entrenamiento() {
		System.out.println("Citar a los jugadores a las 3pm");
	}
	
	
}
