
public class hilo extends Thread{
	String mensaje;
	public hilo(String nombre){
		super(nombre);
	}
	public void run(){
		for (int i=1;i<11;i++){

			for (int j=1;j<11;j++){
				System.out.println(i+"*"+j+" = "+i*j);
			}
			try{
			sleep(2000);} catch(Exception e){}
		}
		System.out.println("Proceso terminado "+this.getName());
		System.out.println(mensaje);
	}
	public void setMensaje(String msg){
		this.mensaje=msg;
	}
}
