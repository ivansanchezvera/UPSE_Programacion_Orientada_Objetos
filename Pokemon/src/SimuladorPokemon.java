import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class SimuladorPokemon {

	public SimuladorPokemon() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PokemonElectrico pikachu = new PokemonElectrico("Pikachu", 100, 70);
		PokemonAgua squirtle = new PokemonAgua("Squirtle", 80, 100);
		PokemonFuego charmander = new PokemonFuego("Charmander", 120, 110);
		PokemonFuego ponita = new PokemonFuego("Ponita", 100, 90);
		PokemonFuego ponita2 = new PokemonFuego("Ponita", 100, 90);
		PokemonFuego ponita3 = ponita2;
		
		ArrayList<Pokemon> miPokedex = new ArrayList<Pokemon>();
		
		miPokedex.add(pikachu);
		miPokedex.add(squirtle);
		miPokedex.add(charmander);
		miPokedex.add(ponita);
		
		System.out.println("Mi pokedex sin ordenar: " + miPokedex);
		
		Collections.sort(miPokedex);
		
		
		System.out.println();
		System.out.println("Mi magia de Collections");

		System.out.println("Mi pokedex ordenado: " + miPokedex);
		
		System.out.println("Mi pokemon mas debil es: " + Collections.min(miPokedex));
		System.out.println("Mi pokemon mas fuerte es: " + Collections.max(miPokedex));
		
		//System.out.println("Entero de comparacion: " + pikachu.compareTo(ponita));
		//System.out.println("Comparando igualdad estricta: " + ponita2.equals(ponita));
		
		/*
		pikachu.dibujar();
		squirtle.dibujar();
		
		do{
			charmander.atacar(pikachu);
			pikachu.atacar(charmander);
			squirtle.atacar(charmander);
			charmander.atacar(squirtle);
		}while(charmander.getHp()>0 && (squirtle.getHp()>0 || pikachu.getHp()>0));
		*/
	}

}
