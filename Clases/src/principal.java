
public class principal {

	public static void main(String[] args) {
		cuentaBancaria cuenta1=new cuentaBancaria(500);
		cuentaBancaria cuenta2=new cuentaBancaria();
		System.out.println("El saldo de la cuenta 1 es "+cuenta1.dameSaldo());
		System.out.println("El saldo de la cuenta 2 es "+cuenta2.dameSaldo());
		cuenta1.retira(25);
		cuenta2.ingresa(249.23);		
		System.out.println("El saldo modificado de la cuenta 1 es "+cuenta1.dameSaldo());
		System.out.println("El saldo modificado de la cuenta 2 es "+cuenta2.dameSaldo());
		
	}

}
