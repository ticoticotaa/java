
public class hilo extends Thread {
	String mensaje;

	public hilo(String name)

	{

		super(name);

	}

	public void run()

	{

		for (int i = 1; i < 11; i++)

		{
			for(int j=1;j<11;j++){
			System.out.println("Multiplico "+i+" por "+j+" que nos da "+i*j);}

		}

		System.out.println("Este proceso ha terminado:" + this.getName());
		System.out.println(mensaje);

	}

	public void setMensaje(String msj)

	{

		this.mensaje = msj;

	}
}
