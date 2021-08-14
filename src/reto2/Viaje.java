package reto2;

public class Viaje extends Maleta{
	
	private String vidaUtil;
	
	

	public Viaje() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Viaje(String nombre, String capacidad, String numeroBolsillos, String vidaUtil) {
		super(nombre, capacidad, numeroBolsillos);
		
		this.vidaUtil = vidaUtil;
		// TODO Auto-generated constructor stub
	}
	
	

	public String getVidaUtil() {
		return vidaUtil;
	}

	public void setVidaUtil(String vidaUtil) {
		this.vidaUtil = vidaUtil;
	}

	@Override
	public String toString() {
		return "Maleta Viaje- Nombre:"+getNombre()+ "\tcapacidad:"+ getCapacidad() + "\tbolsillos:" + getNumeroBolsillos()  + "\tcolor:"+this.getVidaUtil();	
	}

	
	

	
	

}
