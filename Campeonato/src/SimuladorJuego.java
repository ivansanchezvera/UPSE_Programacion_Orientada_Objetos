
public class SimuladorJuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equipo barcelona = new Equipo("Barcelona", 1921, "Guillermo Almada", 
				14, 'A', "Guayaquil", "Monumental", 15000, "Jose Francisco Cevallos", 
				(float)10000000.00);
		Jugador diaz = new Jugador("Damian Diaz", 30, "Argentino", 35000);
		barcelona.contratarJugador(diaz);
		
		Equipo emelec = new Equipo("emelec", 1930, "Omar De Felipe", 13, 
				'A', "Guayaquil", "No tiene", 900, "Nassib Neme", 
				(float)8000000.00);
		
		Jugador dreer = new Jugador("Esteban Dreer", 33, "Argentino-Ecuatoriano Cambiado", 30000);
		emelec.contratarJugador(dreer);
		
		Partido clasico = new Partido(barcelona, emelec, barcelona.estadio, "Omar Ponce", "15-Mayo-2016");
		clasico.aumentarGolLocal();
		clasico.aumentarGolLocal();
		clasico.aumentarGolLocal();
		clasico.aumentarGolLocal();
		clasico.aumentarGolLocal();
		
		clasico.amonestarAmarilla();
		
		System.out.println("El resultado fue: " + 
		clasico.local.nombre + " " + clasico.golesLocal + " - " 
		+ clasico.golesVisitante + " " + clasico.visitante.nombre );
	}

}
