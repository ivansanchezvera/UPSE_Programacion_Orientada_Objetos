package herencia.poo.facsistel.upse;

public abstract class PersonalSeleccionFutbol {

	protected int id;
	public static int ultimoId = 0;
	protected String nombre;
	protected String apellidos;
	protected int edad;
	
	public PersonalSeleccionFutbol(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.id = ultimoId++;
		declararImpuestos();
	}
	
	public void concentrarse()
	{
		System.out.println("Soy un personaje de seleccion sin especialidad no se como concentrarme");
	};
	
	public void darDeclaraciones()
	{
		System.out.println("Siempre salimos a ganar y a jugar de la mejor manera, pero lamentablemente las cosas no se dieron. Asi es el futbol!");
	}
	
	public abstract void entrenamiento();
	
	private void declararImpuestos()
	{
		System.out.println("Me lleva el SRI");
	}
}
