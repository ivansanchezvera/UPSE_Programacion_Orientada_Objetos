package upse.facsistel.academico;

import java.util.ArrayList;

public class Curso {
	
	private int codigo;
	private int numeroEstudiantes;
	public static final int maxEstudiantes = 40;
	private String nombreCurso = "";
	private ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
	
	public Curso(int codigo, String nombreCurso)
	{
		this.codigo = codigo;
		this.nombreCurso = nombreCurso;
		this.numeroEstudiantes = 0;
	}
	
	public void inscribirEstudiante(Estudiante e)
	{
		listaEstudiantes.add(e);
		numeroEstudiantes = listaEstudiantes.size();
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getNumeroEstudiantes() {
		return numeroEstudiantes;
	}

	public ArrayList<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}
	
	public void imprimirListaEstudiantes()
	{
		System.out.println(listaEstudiantes);
	}

	
}
