
public class animal {
	private String tamaño;
	private String color;
	animal(){
		tamaño="grande";
		color="negro";
	}
	animal(String tamaño,String color){
		this.tamaño=tamaño;
		this.color=color;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
