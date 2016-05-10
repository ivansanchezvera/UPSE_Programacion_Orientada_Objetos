import java.util.Random;

public class Jugador {
int edad = 18;
String nombre = "";
String[] habilidades;
String cedula;
int fichas = 0;
int minimoFichas = 10;
int maximoFichas = 100;
float valorFichas = (float)1.50;


Jugador(String nombre, String cedula, int edad)
{
	this.nombre = nombre;
	this.cedula = cedula;
	this.edad = edad;
	fichas = minimoFichas;
	}

public int comprarFichas(int cantidadFichas)
{
	fichas += cantidadFichas;
	return fichas;
}

public float cambiarFichas(int fichasACambiar){
	return fichasACambiar * valorFichas;
}

public float cambiarTodasFichas(){
	float valorCambiado = cambiarFichas(fichas);
	return valorCambiado;
}

public void jugar()
{
	Random r = new Random();
	int apuesta = r.nextInt(fichas);
	int suerte = r.nextInt(2);
	String mensaje = "";
	
	System.out.println("Juego en proceso... Aposto " +apuesta + " fichas.");
	
	if(suerte == 1)
	{
		fichas = fichas + apuesta;
		mensaje = "Has ganado! Festeja con tus panas tus "
				+ fichas + " fichas.";
	}else{
		fichas -= apuesta; //fichas = fichas - apuesta;
		mensaje = "Haz perdido pobre iluso! Intentalo de nuevo "
				+ "tienes " + fichas + " fichas";
	}
	
	System.out.println(mensaje);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador dinner = new Jugador("Dinner Gonzalez", "2600123548", 28);
		dinner.comprarFichas(50);
		dinner.jugar();
		dinner.jugar();
		float resultado = dinner.cambiarTodasFichas();
		System.out.println(dinner.nombre + " salio con $" + resultado + " del casino de los rusos.");
	}

}
