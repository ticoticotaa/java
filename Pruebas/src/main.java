
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hilo hilo1 = new hilo("Hilo 1");

		hilo hilo2 = new hilo("Hilo 2");

		hilo1.setMensaje("Este es el mensaje del hilo 1");

		hilo2.setMensaje("Mensaje hilo 2");

		hilo1.start();

		hilo2.start();
	}

}
