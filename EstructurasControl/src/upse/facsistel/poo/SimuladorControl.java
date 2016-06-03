package upse.facsistel.poo;

import upse.facsistel.academico.*;
import java.awt.Cursor;
import java.io.IOException;
import java.util.Random;

public class SimuladorControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Curso poo = null;
		Carrera sistemas = new Carrera("Sistemas");
		
		Curso poo = new Curso(4001, "Programacion"
				+ "Orientada a Objetos");
		
		Estudiante Kerly = new Estudiante("Kerly ABC");
		poo.inscribirEstudiante(Kerly);
		
		Estudiante Dinner = new Estudiante("Dinner XYZ");
		poo.inscribirEstudiante(Dinner);
		
		Estudiante Jazmin = new Estudiante("Jazmin Limon", "JL", "Sistemas");
		poo.inscribirEstudiante(Jazmin);
		
		Curso metodosNumericos = new Curso(4002, "Metodos Numericos");
		metodosNumericos.inscribirEstudiante(Jazmin);
		
		Estudiante Wilson = new Estudiante("Wilson Mazzini");
		metodosNumericos.inscribirEstudiante(Wilson);
		
		sistemas.agregarMateria(poo);
		sistemas.agregarMateria(metodosNumericos);
		
		double promedioCurso = 0;
		try{
			promedioCurso = 5230/poo.getNumeroEstudiantes();
			System.out.println("El promedio de curso es: " + promedioCurso);
			
			if(promedioCurso>1000)
			{
				for(int i=0; i<poo.getNumeroEstudiantes(); i++)
				{
					poo.getListaEstudiantes().get(i).imprimirDiploma();
				}
			}
			
		}catch(ArithmeticException ae)
		{
			System.out.println("No se puede calcular promedio para curso sin estudiantes");
			System.out.println("Por favor ingrese estudiantes e intente de nuevo");
			ae.printStackTrace();
		}catch(NullPointerException npe)
		{
			System.out.println("Hey, inicializa el curso.");
		}
		catch(Exception e)
		{
			String error = e.getMessage();
			System.out.println("Estimado usuario, el error es: " 
			+ error + "\nCorra y pida ayuda al de sistemas");
		}finally{
			System.out.println("Estamos en el finally. Borrando curso");
			poo = null;
		}
	}

}
