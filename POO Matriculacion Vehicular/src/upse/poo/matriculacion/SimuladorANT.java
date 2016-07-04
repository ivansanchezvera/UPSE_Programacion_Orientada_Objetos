package upse.poo.matriculacion;

import java.util.ArrayList;

public class SimuladorANT {

	public static void main(String[] args)
	{
		Integer anio = Integer.valueOf(args[0]);
		if(anio.intValue()>2016)
		{
			System.out.println(anio + " Anio superior al actual Marty!");
		}
		else{

			Vehiculo v = new Vehiculo("Ivan", "Fiat", TipoVehiculo.CAMIONETA);
			Vehiculo v1 = new Vehiculo("Wilson", "Toyota", TipoVehiculo.AUTO);
			Vehiculo v2 = new Vehiculo("Diana", "Mustang", TipoVehiculo.AUTO);
			Vehiculo v3 = new Vehiculo("Karla", "Mercedes", TipoVehiculo.BUS);

			v2.agregarTemperaturaMotor(90);
			v2.agregarTemperaturaMotor(250);
			v2.agregarTemperaturaMotor(70);
			v2.agregarTemperaturaMotor(500);

			v1.agregarTemperaturaMotor(90);
			v1.agregarTemperaturaMotor(120);
			v1.agregarTemperaturaMotor(80);


			ANT agenciaSE = new ANT("Agencia Nacional de Transito - Santa Elena");
			agenciaSE.matricularVehiculo(v);
			agenciaSE.matricularVehiculo(v1);
			agenciaSE.matricularVehiculo(v2);
			agenciaSE.matricularVehiculo(v3);

			System.out.println("Vehiculos matriculados: \n" + agenciaSE.getVehiculosRegistrados());

			/*
	TipoVehiculo tipoABuscar = TipoVehiculo.CAMION;
	ArrayList<Vehiculo> filtrados = agenciaSE.getVehiculosPorTipo(tipoABuscar);
	if(!filtrados.isEmpty())
	{
		System.out.print("Los vehiculos de tipo " + tipoABuscar + " son: "+ filtrados);
	}else{
		System.out.print("No hay vehiculos de tipo " + tipoABuscar);
	}
			 */
		}
	}
}
