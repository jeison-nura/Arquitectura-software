
public class Usuario implements IUsuarioChat{

	private String nombre;
	private SalonPrivado salon;
	
	
	public Usuario( SalonPrivado salonchat ) {
		salon = salonchat;
	}
	
	
	@Override
	public void recibe(String de, String msg) {
		String s = "el usuario " + de +" re dice: " + msg;
		System.out.println(nombre + ": " + s);
	}

	@Override
	public void envia(String a, String msg) {
		salon.envia(nombre, a , msg);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
}
