
public class PartidoPandillero implements FutbolCallejero, EventoPublico {

	public float recaudacion;
	
	@Override
	public void anotacionLocal() {
		// TODO Auto-generated method stub

	}

	@Override
	public void anotacionVisitante() {
		// TODO Auto-generated method stub

	}

	@Override
	public void amonestacionAmarilla(int dorsal, String Equipo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void amonestacionRoja(int dorsal, String Equipo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void finPrimerTiempo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void finSegundoTiempo() {
		// TODO Auto-generated method stub
		System.out.println("Pitido final."),
	}

	@Override
	public void getLocal() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getVisitante() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void noPicarse(String jugador) {
		System.out.println("No seas picado " + jugador + ". Te la tengo jurada");
	}

	@Override
	public void noLlorar(String jugador) {
		System.out.println("No seas lloron " + jugador + ". Solo se llora en la champions.");
	}

	@Override
	public boolean vieneCarro() {
		//Random si viene o no viene
		return false;
	}

	@Override
	public boolean estaOffside() {
		return true;
	}

	@Override
	public void palabrasAlcalde() {
		System.out.println("Es un honor para mi inaugurar este partido numero XXV entre netas y LatinKing. Que la suerte este siempre de su lado.");
		
	}

	@Override
	public float recaudacionImpuesto() {
		float impuestoTotal = impuesto * recaudacion; 
		recaudacion = recaudacion - impuesto;
		return impuestoTotal;
	}

}
