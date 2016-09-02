import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimuladorLectorArchivos {

	public SimuladorLectorArchivos() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader miLectorDeArchivo = new FileReader("archivito.txt");
			BufferedReader bfr = new BufferedReader(miLectorDeArchivo);
			String lineaLeida; 
			
			FileWriter miEscritorDeArchivo = new FileWriter("archivito.txt");
			BufferedWriter bfw = new BufferedWriter(miEscritorDeArchivo);
			bfw.newLine();
			bfw.write("Chao se acabo la clase.");
			bfw.close();
			
			int i = 1;
			while((lineaLeida = bfr.readLine())!=null)
			{
				//System.out.println(i +". "+ lineaLeida);
				//i++;
				
				String[] palabras = lineaLeida.split(" ");
				for(String palabra: palabras)
				{
					System.out.println(palabra);
				}
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Archivo no encontrado!");
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Archivo existe pero con errores.");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}finally{
			
		}
		
	}

}
