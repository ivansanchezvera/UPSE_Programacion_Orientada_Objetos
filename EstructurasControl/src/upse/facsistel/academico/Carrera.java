package upse.facsistel.academico;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Carrera {
	private String nombre;
	private String director;
	private ArrayList<Curso> materias = 
			new ArrayList<Curso>();
	
	public Carrera(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getDirector(){
		return this.director;
	}
	
	public boolean setDirector(String director){
		if(director.length()>5)
		{
			this.director = director;
			return true;
		}else{
			return false;
		}
	}
	
	public ArrayList<Curso> getMaterias()
	{
		return this.materias;
	}
	
	public void agregarMateria(Curso materia)
	{
		materias.add(materia);
	}
	
	
	
}
