import java.io.File;
import java.io.IOException;

public class SimuladorArchivos {

	public SimuladorArchivos() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File miArchivo = new File("prueba.txt");
		try {
			miArchivo.createNewFile();
			System.out.println("Archivo creado"
					+ " revisa carpeta de proyecto!");
			
			System.out.println("Ahora intentaremos borrarlo");
			Thread.sleep(10000);
			if(miArchivo.delete())
			{
				System.out.println("Si se borro!");				
			}else{
				System.out.println("No pude borrar! Alerta!");				
			}
			
		} catch (IOException e) {
			System.err.println("Error en la creacion"
					+ " de archivo.");
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
