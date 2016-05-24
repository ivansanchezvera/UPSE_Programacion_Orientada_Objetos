/**
 * Esta clase crea un circulo a traves de un punto
 * @author ivans
 *
 */
public class Circulo {
	//Atributos/Propiedades
	private double radio=1;
	public static final double pi = 3.1415926535;
	private Punto p;
	
	//Constructor
	public Circulo(Punto centro, double r)
	{
		p = centro;
		radio = r;
	}
	
	/**
	 * Este metodo calcula el Area de un circulo
	 * @return Double area
	 */
	public double calcularArea()
	{
		return pi * Math.pow(radio, 2);	
	}
	
	/**
	 * ESte metodo calcula el perimetro o circunferencia
	 * del circulo
	 * @return Double perimetro
	 */
	public double calcularCircunferencia()
	{
		return 2*pi*radio;
	}
	
	public void imprimirCirculo()
	{
		String salida = "El circulo tiene radio " + this.radio 
				+ " centrado en el punto (" 
				+ p.getX() + "," + p.getY() + ")";
		salida += "\nEl area del circulo es: " + calcularArea()
				+ " y su circunferencia es: " + calcularCircunferencia();
		System.out.println(salida);
	}
	
	
}
