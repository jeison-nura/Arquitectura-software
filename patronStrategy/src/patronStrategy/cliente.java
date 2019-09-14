package patronStrategy;

public class cliente {

	public static void main(String[] args) {
		
		contexto ct = new contexto(new ELGamal());
		byte [] ci = ct.Ciframiento("negro mk me importa un pepino".getBytes());
		System.out.println(new String(ci));
		byte[] des = ct.desciframiento(ci);
		System.out.println(new String(des));
	}

}
