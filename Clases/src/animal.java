
public class animal {
	private String tama�o;
	private String color;
	animal(){
		tama�o="grande";
		color="negro";
	}
	animal(String tama�o,String color){
		this.tama�o=tama�o;
		this.color=color;
	}
	public String getTama�o() {
		return tama�o;
	}
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
