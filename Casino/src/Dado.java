import java.util.Random;

public class Dado {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int numero1 = r.nextInt(6) + 1;
		float numero2 = r.nextInt(6) + 1;
		int numero3 = r.nextInt(6) + 1;
		
		float notaEstudiante = numero1 + numero2 * numero3;
			
		System.out.print("Estudiante, segun mi riguroso "
				+ "criterio de evaluacion su nota es: " 
				+ notaEstudiante);
		
	}

}
