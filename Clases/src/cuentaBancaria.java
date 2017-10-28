
public class cuentaBancaria {
	private double cantidad;
	private double saldo;
	cuentaBancaria(){
		saldo=0;
	}
	public double dameSaldo() {
		return saldo;
	}

	cuentaBancaria(double cantidad){
		saldo=cantidad;
	}
	void ingresa(double cantidad){
		saldo=saldo+cantidad;
	}
	void retira(double cantidad){
		saldo=saldo-cantidad;
	}
}
