
public class SimuladorPokemon {

	public SimuladorPokemon() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PokemonElectrico pikachu = new PokemonElectrico("Pikachu", 100, 70);
		PokemonAgua squirtle = new PokemonAgua("Squirtle", 80, 100);
		PokemonFuego charmander = new PokemonFuego("Charmander", 120, 110);
		
		do{
			charmander.atacar(pikachu);
			pikachu.atacar(charmander);
			squirtle.atacar(charmander);
			charmander.atacar(squirtle);
		}while(charmander.getHp()>0 && (squirtle.getHp()>0 || pikachu.getHp()>0));
	}

}
