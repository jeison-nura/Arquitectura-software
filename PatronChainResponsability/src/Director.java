
public class Director implements Gerar{
	
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
		System.out.println("pase por director");
		if(dias <= 3) {
			System.out.println("esto lo maneja el Director");
		} else {
			next.SolicitudDeDias(dias);
		}
	}


}
