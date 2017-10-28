import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class NumerosAzar {

	public static void main(String[] args) throws IOException {
		int numeroAzar,numeroUsuario;
		String respuesta;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Random azar=new Random();
		numeroAzar=azar.nextInt(100);
		do {
			System.out.println("Dime un numero entre 1 y 100");
			numeroUsuario=Integer.parseInt(br.readLine());
			if(numeroAzar==numeroUsuario){
				System.out.println("Acertastes");
			} else {
				if(numeroAzar>numeroUsuario){
					System.out.println("El numero que indicas es menor");
				} else {
					System.out.println("El numero que indicas es mayor");
				}
			}
			System.out.println("Quieres continuar?(s/n)");
			respuesta=br.readLine();
					
		} while (respuesta.equals("s")&&(numeroAzar!=numeroUsuario));
	}

}
