
public interface Futbol extends Deporte {
	
	public void anotacionLocal();
	public void anotacionVisitante();
	public void amonestacionAmarilla(int dorsal, String Equipo);
	public void amonestacionRoja(int dorsal, String Equipo);
	public void finPrimerTiempo();
	public void finSegundoTiempo();
}
