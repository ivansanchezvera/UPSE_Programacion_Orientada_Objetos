import java.util.Random;

public abstract class Pokemon implements Comparable<Pokemon> {
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
	
	@Override
	public int compareTo(Pokemon otroPokemon) {
		
		if(this.getHp()<otroPokemon.getHp())
		{
			return -1;
		}else if(this.getHp()>otroPokemon.getHp())
		{
			return +1;
		}

		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(altura);
		result = prime * result + hp;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((nombreEvolucion == null) ? 0 : nombreEvolucion.hashCode());
		result = prime * result + Float.floatToIntBits(peso);
		result = prime * result + puntosCombate;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		if (Float.floatToIntBits(altura) != Float.floatToIntBits(other.altura))
			return false;
		if (hp != other.hp)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (nombreEvolucion == null) {
			if (other.nombreEvolucion != null)
				return false;
		} else if (!nombreEvolucion.equals(other.nombreEvolucion))
			return false;
		if (Float.floatToIntBits(peso) != Float.floatToIntBits(other.peso))
			return false;
		if (puntosCombate != other.puntosCombate)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", peso=" + peso + ", altura=" + altura + ", hp=" + hp + ", puntosCombate="
				+ puntosCombate + ", nombreEvolucion=" + nombreEvolucion + "]\n";
	}
}
