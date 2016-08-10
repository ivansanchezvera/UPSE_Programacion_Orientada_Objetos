import java.util.Random;

public class PokemonElectrico extends Pokemon {

	public PokemonElectrico(String nombre, float peso, float altura, int hp, int puntosCombate,
			String nombreEvolucion) {
		super(nombre, peso, altura, hp, puntosCombate, nombreEvolucion);
		// TODO Auto-generated constructor stub
	}

	public PokemonElectrico(String nombre, int hp, int puntosCombate) {
		super(nombre, hp, puntosCombate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int atacar(Pokemon otroPokemon) {
		Random r = new Random();
		int poderAtaque = Math.round(this.puntosCombate * r.nextInt(100)/100);
		
		Class claseOtroPokemon = otroPokemon.getClass();
		
		if(claseOtroPokemon == PokemonAgua.class){
			poderAtaque = (int) Math.round(poderAtaque * 2);
			System.out.println("Ataque Electrico sobre pokemon de Agua, Brutal! ... Quedara frito!");
		}
		
		if(claseOtroPokemon == PokemonFuego.class){
			poderAtaque = (int) Math.round(poderAtaque * 1.25);
			System.out.println("Ataque Electrico sobre pokemon de Fuego, es bastante potente. Cuidado enciendes el fuego con ese ataque.");
		}
		
		if(claseOtroPokemon == PokemonElectrico.class){
			poderAtaque = (int) Math.round(poderAtaque * 0.5);
			System.out.println("Ataque Electrico sobre pokemon electrico, no es muy efectivo. Quieres recargar las baterias del enemigo.");
		}
		
		System.out.println("ZAP, ZAP, BOOM " + nombre + " ha usado un ataque electrico sobre " + otroPokemon.nombre
				+ " .El ataque tiene " + poderAtaque + " de poder.");

		otroPokemon.defenderse(poderAtaque);
		System.out.println("");
		return poderAtaque;
	}

}
