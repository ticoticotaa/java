package tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class iniciacionJava {

	public static void main(String[] args) throws IOException {
		//Mostrar cadena de texto al usuario
		System.out.println("Dime tu nombre: ");
		//Entrada del dato del usuario
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String nombre=br.readLine();
		System.out.println("Hola, "+nombre);
	}

}
