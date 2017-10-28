import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class condicional {
	//Codigo Jose Ojeda - Condicionales
	public static void main(String[] args) throws  IOException {
		int edad;
		System.out.println("Que edad tienes?");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		edad=Integer.parseInt(br.readLine());
		//condicional if
		if(edad<18){
			System.out.println("Eres menor de edad");
		} else if (edad<=0 || edad>100){
			System.out.println("Edad no valida");
		} else
		{
			System.out.println("Eres mayor de edad");		}
		//switch
		int opcion;
		System.out.println("Pulsa 1 o 2");
		System.out.println("1.Grabar");
		System.out.println("2.Salir");
		BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
		opcion=Integer.parseInt(br2.readLine());
		switch(opcion){
		case 1:
			System.out.println("Seleccionastes grabar");
			break;
		case 2:
			System.out.println("Seleccionastes salir");
			break;	
		default:
			System.out.println("Error al seleccionar");
			break;
		}	}}
