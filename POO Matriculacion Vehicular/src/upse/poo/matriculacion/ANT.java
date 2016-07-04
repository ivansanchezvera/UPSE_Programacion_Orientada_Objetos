package upse.poo.matriculacion;

import java.util.ArrayList;

public class ANT {
	private ArrayList<Vehiculo> vehiculosRegistrados = new ArrayList<Vehiculo>();
	public static int ultimaMatricula;
	private String nombreAgencia = "";
	
	ANT(String nombreAgencia)
	{
		this.nombreAgencia = nombreAgencia;
		
	}
	
	public ArrayList<Vehiculo> getVehiculosPorTipo(TipoVehiculo tipoFiltro)
	{
		ArrayList<Vehiculo> vehiculosFiltrados = new ArrayList<Vehiculo>();
		
		for(Vehiculo v:vehiculosRegistrados)
		{
			if(v.getTipo()==tipoFiltro)
			{
				vehiculosFiltrados.add(v);
			}
		}
		
		return vehiculosFiltrados;
	}
	
	public void matricularVehiculo(Vehiculo v)
	{
		if(pasaRevisionVehiculo(v))
		{
			v.setMatricula("YBA" + ultimaMatricula);
			ultimaMatricula++;
		
			vehiculosRegistrados.add(v);
		}else{
			System.out.println("Vehiculo no se puede matricular porque no paso la revision " + v);
		}
	}

	private boolean pasaRevisionVehiculo(Vehiculo v) {
		boolean pasaRevision = true;
		
		for(Double t:v.getTemperaturasMotor())
		{
			if(t>150){
				//pasaRevision = false;
				return false;
			}
		}
		
		return pasaRevision;
	}

	public ArrayList<Vehiculo> getVehiculosRegistrados() {
		return vehiculosRegistrados;
	}
}
