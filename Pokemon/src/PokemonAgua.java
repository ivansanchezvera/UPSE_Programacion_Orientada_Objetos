import java.util.Random;

public class PokemonAgua extends Pokemon implements GraficosJuego{
	
	public PokemonAgua(String nombre, int hp, int puntosCombate) {
		super(nombre, hp, puntosCombate);
		
	}

	@Override
	public int atacar(Pokemon otroPokemon) {
		Random r = new Random();
		int poderAtaque = Math.round(this.puntosCombate * r.nextInt(100)/100);
		
		Class claseOtroPokemon = otroPokemon.getClass();
		
		if(claseOtroPokemon == PokemonAgua.class){
			poderAtaque = (int) Math.round(poderAtaque * 0.50);
			System.out.println("Ataque de Agua sobre pokemon de Agua, no es muy efectivo.");
		}
		
		if(claseOtroPokemon == PokemonFuego.class){
			poderAtaque = (int) Math.round(poderAtaque * 2);
			System.out.println("Ataque de Agua sobre pokemon de Fuego, es super efectivo.");
		}
		
		if(claseOtroPokemon == PokemonAgua.class){
			poderAtaque = (int) Math.round(poderAtaque * 1);
			System.out.println("Ataque de Agua sobre pokemon electrico, no es muy efectivo");
		}
		
		System.out.println("Splash, Splash... " + nombre + " ha usado un ataque de agua sobre " + otroPokemon.nombre
				+ " .El ataque tiene " + poderAtaque + " de poder.");

		otroPokemon.defenderse(poderAtaque);
		System.out.println("");
		return poderAtaque;
		
	}

	@Override
	public void dibujar() {
		String pokemonADibujar = "*****Squirtle*****\n"
+"				   ,........__	\n"
+"	            ,-'            \"`-.\n"
+"	            ,'                   `-.\n"
+"	          ,'                        \\n"
+"	        ,'                           .\n"
+"	        .'\\               ,\"\".       `\n"
+"	       ._.'|             / |  `       \\n"
+"	       |   |            `-.'  ||       `.\n"
+"	       |   |            '-._,'||       | \\n"
+"	       .`.,'             `..,'.'       , |`-.\n"
+"	       l                       .'`.  _/  |   `.\n"
+"	       `-.._'-   ,          _ _'   -\\\" \\\\  .     `\n"
+"	  `.\"\"\"\"\"'-.`-...,---------','         `. `....__.\n"
+"	  .'        `\"-..___      __,'\\          \\  \\     \\\n"
+"	  \\_ .          |   `\"\"\"\"'    `.           . \\     \\n"
+"	    `.          |              `.          |  .     L\n"
+"	      `.        |`--...________.'.        j   |     |\n"
+"	        `._    .'      |          `.     .|   ,     |\n"
+"	           `--,\\       .            `7\"\"' |  ,      |\n"
+"	              ` `      `            /     |  |      |    _,-'\"\"\"`-.\n"
+"	               \\ `.     .          /      |  '      |  ,'          `.\n"
+"	                \\  v.__  .        '       .   \\    /| /              \\n"
+"	                 \\/    `\"\"\\\"\"\"\"\"\"\"`.       \\   \\  /.''                |\n"
+"	                  `        .        `._ ___,j.  `/ .-       ,---.     |\n"
+"	                  ,`-.      \\         .\"     `.  |/        j     `    |\n"
+"	                 /    `.     \\       /         \\ /         |     /    j\n"
+"	                |       `-.   7-.._ .          |\"          '         /\n"
+"	                |          `./_    `|          |            .     _,'\n"
+"	                `.           / `----|          |-............`---'\n"
+"	                  \\          \\      |          |\n"
+"	                 ,'           )     `.         |\n"
+"	                  7____,,..--'      /          |\n"
+"	                                    `---.__,--.'mh\n"
+"		\n";
		
		System.out.println(pokemonADibujar);
		
	}

}
