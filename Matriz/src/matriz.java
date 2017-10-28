import java.util.Scanner;

public class matriz {
	static int[] matriz;
	static int numero,i;
	static int mayor, menor;
	static int total;
	public static void main(String[] args) {
		System.out.println("Introduce el numero de valores a insertar");
		Scanner sc=new Scanner(System.in);
		numero=sc.nextInt();
		matriz=new int[numero];
		//introducir los valores
		for(i=0;i<matriz.length;i++){
			System.out.println("Valor "+(i+1));
			Scanner sc2=new Scanner(System.in);
			matriz[i]=sc2.nextInt();
			menor=matriz[i];
		}
		//indica mayor menor y suma total
		for(i=0;i<matriz.length;i++){
			if(mayor<=matriz[i]){
				mayor=matriz[i];
			}
			if(menor>=matriz[i]){
				menor=matriz[i];
			}
			total=total+matriz[i];
		}
		//mostramos valores
		System.out.println("El numero menor es = "+menor);
		System.out.println("El numero mayor es = "+mayor);
		System.out.println("El total de todos los valores es = "+total);
	}

}
