/*
 * Esta clase contiene informacion basica de un partido
 * de futbol.
 * */
public class Partido {
	//Declaracion de variables
	public Equipo local;
	public Equipo visitante;
	public int golesLocal = 0;
	public int golesVisitante = 0;
	public int tarjetasRojas = 0;
	public int tarjetasAmarillas = 0;
	public String estadio;
	public static final int duracionNormal = 90;
	public String arbitro = "";
	public String fechaCalendario;
	public int numeroFecha;
	
	Partido(Equipo local, Equipo equipoVisitante, 
			String estadio, String Arbitro, String fechaCalendario)
	{
		this.local = local;
		this.visitante = equipoVisitante;
		this.estadio = estadio;
		this.arbitro = arbitro;
		this.fechaCalendario = fechaCalendario;
	}
	
	public void aumentarGolLocal()
	{
		golesLocal++;
	}
	
	public void aumentarGolVisitante()
	{
		golesVisitante++;
	}
	
	public void amonestarAmarilla()
	{
		tarjetasAmarillas++;
	}
	
	public void amonestarRoja()
	{
		tarjetasRojas++;
	}
}
