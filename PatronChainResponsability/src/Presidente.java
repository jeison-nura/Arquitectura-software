
public class Presidente implements Gerar{
	
	private Gerar next;

	@Override
	public void setNext(Gerar gerar) {
		next = gerar;
	}

	@Override
	public Gerar getNext() {
		return next;
	}

	@Override
	public void SolicitudDeDias(int dias) {
		System.out.println("pase por presidente");
		if( dias > 5) {
			System.out.println("esto lo maneja el Presidente");
		}
	}


}
