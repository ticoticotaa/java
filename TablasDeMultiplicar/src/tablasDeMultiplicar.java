import java.util.Scanner;

public class tablasDeMultiplicar {
	//Codigo Java - Jose Ojeda - Tablas de multiplicar
	private static int opcion=0;
	public static void main(String[] args) {
		int numeroUsuario;
		int i;
				muestraOpcion();
		do{
		System.out.println("De que numero quieres la tabla de multiplicar?(1-10)");
		Scanner sc=new Scanner(System.in);
		numeroUsuario=sc.nextInt();
		for(i=1;i<=10;i++){
			System.out.println(i+" X "+numeroUsuario+" = "+(i*numeroUsuario));
		}
		muestraOpcion();
	}while(opcion!=2);
	}
	static void muestraOpcion(){
		System.out.println("1. Tabla de Multiplicar");
		System.out.println("2. Salir");
		Scanner sc=new Scanner(System.in);
		opcion = sc.nextInt();
	}

}
