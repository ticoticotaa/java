import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class fichero {
	public File archivo=null;
	public FileReader lector=null;
	public BufferedReader br=null;
	public FileWriter fichero=null;
	public PrintWriter escritor=null;
	void leer(String nombreArchivo){
		try {
			archivo=new File(nombreArchivo);
			lector=new FileReader(archivo);
			br=new BufferedReader(lector);
			String linea;
			while((linea=br.readLine())!=null){
				System.out.println(linea);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				if(null!=lector){
					lector.close();
				}
			}catch(Exception e2){
				e2.printStackTrace();
			}
		}
	}
	void escribir(String nombreArchivo){
		try {
			fichero=new FileWriter(nombreArchivo);
			escritor=new PrintWriter(fichero);
			for(int i=0;i<15;i++){
				escritor.println("Linea "+i);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
			try {
				if(null!=escritor){
					escritor.close();
				}
			}catch(Exception e2){
				e2.printStackTrace();
			}
		}
	}
}
