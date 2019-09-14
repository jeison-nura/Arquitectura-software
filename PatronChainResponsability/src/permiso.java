
public class permiso implements Gerar{
	
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
		
		Coordinador cor = new Coordinador();
		this.setNext(cor);
		Director dir = new Director();
		cor.setNext(dir);
		Gerente ger = new Gerente();
		dir.setNext(ger);
		VicePresidente vic = new VicePresidente();
		dir.setNext(vic);
		Presidente pre1 = new Presidente();
		ger.setNext(pre1);
		Presidente pre2 = new Presidente();
		vic.setNext(pre2);
		
		next.SolicitudDeDias(dias);
	}

	
}
