package reto2;

public class Trabajo extends Maleta{
	
	private String color;

	
	
	public Trabajo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trabajo(String nombre, String capacidad, String numeroBolsillos,String color) {
		super(nombre, capacidad, numeroBolsillos);
		this.color = color;
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Maleta Trabajo- Nombre:"+getNombre()+ "\tcapacidad:"+ getCapacidad() + "\tbolsillos:" + getNumeroBolsillos()  + "\tcolor:"+this.getColor();
			
	}



	
	
	
	
}
