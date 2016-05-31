package upse.facsistel.poo;

import upse.facsistel.academico.*;
import java.awt.Cursor;
import java.util.Random;

public class SimuladorControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Curso poo = new Curso(4001, "Programacion"
				+ "Orientada a Objetos");
		
		Estudiante Kerly = new Estudiante("Kerly ABC");
		poo.inscribirEstudiante(Kerly);
		
		Estudiante Dinner = new Estudiante("Dinner XYZ");
		poo.inscribirEstudiante(Dinner);
		
		double promedioCurso = 0;
		try{
			promedioCurso = 5230/poo.getNumeroEstudiantes();
			System.out.println("El promedio de curso es: " + promedioCurso);
		}catch(ArithmeticException ae)
		{
			System.out.println("No se puede calcular promedio para curso sin estudiantes");
			System.out.println("Por favor ingrese estudiantes e intente de nuevo");
		}
	}

}
