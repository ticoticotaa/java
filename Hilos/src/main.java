
public class main {

	public static void main(String[] args) {
		hilo hilo1=new hilo("hilo 1");
		hilo hilo2=new hilo("hilo 2");
		hilo1.setMensaje("Mensaje del hilo 1");
		hilo2.setMensaje("Mensaje del hilo 2");
		hilo2.start();
		hilo1.start();
	}

}
