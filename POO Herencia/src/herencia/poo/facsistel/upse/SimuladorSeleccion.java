package herencia.poo.facsistel.upse;

public class SimuladorSeleccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador achilier = new Jugador("Gabriel", "Achilier", 30);
		achilier.concentrarse();
		achilier.jugarPartido();
		achilier.darDeclaraciones();
		achilier.entrenamiento();
		
		System.out.println();
		System.out.println("***********Quinteros************");
		Entrenador quinteros = new Entrenador("Gustavo", "Quinteros", 45);
		quinteros.concentrarse();
		quinteros.dirigirPartido();
		quinteros.darDeclaraciones();
		quinteros.entrenamiento();
		
		System.out.println();
		System.out.println("***********Masajista************");
		Masajista masajistaRichard = new Masajista("Richard", "Catuto", 20, "Sobador");
		masajistaRichard.concentrarse();
		masajistaRichard.entrenamiento();
		masajistaRichard.darDeclaraciones();
		masajistaRichard.pedirAsistenciaMedica();

	}

}
