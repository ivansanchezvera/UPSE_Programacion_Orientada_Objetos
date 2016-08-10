import java.util.Random;

public abstract class Pokemon {
	protected String nombre;
	protected float peso;
	protected float altura;
	protected int hp;
	protected int puntosCombate;
	protected String nombreEvolucion;
	
	//Metodos
	public Pokemon(String nombre, float peso, float altura, int hp, int puntosCombate, String nombreEvolucion)
	{
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
		this.hp = hp;
		this.puntosCombate = puntosCombate;
		this.nombreEvolucion = nombreEvolucion;
		
	}
	
	public Pokemon(String nombre, int hp, int puntosCombate)
	{
		this.nombre = nombre;
		this.hp = hp;
		this.puntosCombate = puntosCombate;
		this.nombreEvolucion = "Evolucion desconocida. No hay informacion disponible en el Pokedex";
	}
	
	//Defenderse
	public void defenderse(int poderAtaque)
	{
		Random r = new Random();
		int opcion = r.nextInt(3);
		
		switch (opcion) {
		case 0:
			System.out.println(nombre + " ha esquivado el ataque por completo... Que buena defensa!");
			break;
		case 1:
			int danoRecibido = r.nextInt(poderAtaque);
			this.recibirAtaque(danoRecibido);
			System.out.println("Rayos! ... " + nombre + " solo pudo esquivar parcialmente el ataque. "
					+"El dano recibido es de " +danoRecibido + " y ahora " + nombre + "solo tiene " + hp + " hp");
			break;
		case 2:
			System.out.println("Por un #$!#@$%. " + nombre + " ha recibido el ataque completamente."
					+"El dano recibido es de " + poderAtaque + " y ahora " + nombre + "solo tiene " + hp + " hp");
		default:
			System.out.println("Me lleva!... " + nombre + " se ha quedado inmovil y ha recibido el ataque completamente."
					+"El dano recibido es de " + poderAtaque + " y ahora " + nombre + "solo tiene " + hp + " hp");

			break;
		}
		
		
	}
	
	//Evolucionar
	public void evolucionar()
	{
		System.out.println("Hey... Wow " + nombre + " a evolucionado a " + nombreEvolucion);
		this.nombre = this.nombreEvolucion;
	}
	
	//RecibirAtaque
	public void recibirAtaque(int poderAtaque)
	{
		this.hp = this.hp - poderAtaque;
		if(this.hp<=0)
		{
			System.out.println("Ooooh! Este ataque ha desmayado a " + this.nombre);
		}
	}
	
	//Atacar (Polimorfico)
	public abstract int atacar(Pokemon otroPokemon);

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreEvolucion() {
		return nombreEvolucion;
	}

	public void setNombreEvolucion(String nombreEvolucion) {
		this.nombreEvolucion = nombreEvolucion;
	}

	public float getPeso() {
		return peso;
	}

	public float getAltura() {
		return altura;
	}

	public int getHp() {
		return hp;
	}

	public int getPuntosCombate() {
		return puntosCombate;
	}
}
