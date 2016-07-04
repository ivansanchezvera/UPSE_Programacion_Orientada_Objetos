package solar;

public class BalanzaInterplanetaria {

	public static void main(String[] args) {
		double pesoTerrestre = Double.parseDouble(args[0]);
		double masa = pesoTerrestre/Planeta.TIERRA.gravedadSuperficial();
		
		for(Planeta p : Planeta.values())
		{
			System.out.println("Su peso en " + p.name() + " es: " + p.pesoSuperficial(masa));
		}
	}

}
