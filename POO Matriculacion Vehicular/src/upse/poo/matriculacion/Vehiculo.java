package upse.poo.matriculacion;

import java.util.ArrayList;

public class Vehiculo {
	private String dueno = "";
	private String marca = "";
	private TipoVehiculo tipo;
	private String matricula = "";
	private ArrayList<Double> temperaturasMotor = new ArrayList<Double>();
	
	Vehiculo(String dueno, String marca, TipoVehiculo tipo)
	{
		this.dueno = dueno;
		this.marca = marca;
		this.tipo = tipo;
		this.matricula = "Por Matricular";
	}

	public String getDueno() {
		return dueno;
	}

	public void setDueno(String dueno) {
		this.dueno = dueno;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public TipoVehiculo getTipo() {
		return tipo;
	}

	public void setTipo(TipoVehiculo tipo) {
		this.tipo = tipo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void agregarTemperaturaMotor(double temperatura)
	{
		Double temp = new Double(temperatura);
		temperaturasMotor.add(temp);
	}
	
	public ArrayList<Double> getTemperaturasMotor()
	{
		return temperaturasMotor;
	}

	@Override
	public String toString() {
		return "\nVehiculo [dueno=" + dueno + ", marca=" + marca + ", tipo=" + tipo + ", matricula=" + matricula + "]\n";
	}
	
	
}
