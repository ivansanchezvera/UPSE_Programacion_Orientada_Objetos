import java.util.Random;

public class PokemonFuego extends Pokemon {

	public PokemonFuego(String nombre, float peso, float altura, int hp, int puntosCombate, String nombreEvolucion) {
		super(nombre, peso, altura, hp, puntosCombate, nombreEvolucion);
		// TODO Auto-generated constructor stub
	}

	public PokemonFuego(String nombre, int hp, int puntosCombate) {
		super(nombre, hp, puntosCombate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int atacar(Pokemon otroPokemon) {
		Random r = new Random();
		int poderAtaque = Math.round(this.puntosCombate * r.nextInt(100)/100);
		
		Class claseOtroPokemon = otroPokemon.getClass();
		
		if(claseOtroPokemon == PokemonAgua.class){
			poderAtaque = (int) Math.round(poderAtaque * 0.30);
			System.out.println("Ataque de Fuego sobre pokemon de Agua, no le hace mucho daño!");
		}
		
		if(claseOtroPokemon == PokemonFuego.class){
			poderAtaque = (int) Math.round(poderAtaque * 1.25);
			System.out.println("Ataque Fuego sobre pokemon de Fuego!!! Combatir fuego con fuego, que batalla. Efectividad media.");
		}
		
		if(claseOtroPokemon == PokemonElectrico.class){
			poderAtaque = (int) Math.round(poderAtaque * 2);
			System.out.println("Ataque de Fuego sobre pokemon electrico, es muy efectivo... Un pokemon quedara asado!");
		}
		
		System.out.println("FIIIIIIIIIRE! " + nombre + " ha usado un ataque bien a fueguillo sobre " + otroPokemon.nombre
				+ " .El ataque tiene " + poderAtaque + " de poder.");

		otroPokemon.defenderse(poderAtaque);
		System.out.println("");
		return poderAtaque;
	}

}
