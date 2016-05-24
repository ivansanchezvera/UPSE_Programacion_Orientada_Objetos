
public class Punto {
	//Atributos
	private double x = 0;
	private double y = 0;
	
	public Punto(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public void imprimir()
	{
		System.out.println("Este punto esta en x: "
				+ this.x + " y: " + this.y);
	}
}
