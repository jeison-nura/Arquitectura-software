package visitorudem;

public class BlueCreditCardVisitor implements CreditCarVisitor{

	@Override
	public void ofertaGasolina(OfertaGasolina ofertaGasolina) {
		System.out.println("Descuento del 3%");
		
	}

	@Override
	public void ofertaVuelos(OfertaVuelos ofertaVuelos) {
		System.out.println("Descuento del 3%");
		
	}

	@Override
	public void ofertaParqueadero(OfertaParqueadero ofertaParqueader) {
		System.out.println("Descuento del 3%");
	}

	@Override
	public void ofertaRestaurante(OfertaRestaurante ofertaRestaurante) {
		System.out.println("Descuento del 3%");
		
	}

	@Override
	public void ofertaRopa(OfertaRopa ofertaRopa) {
		System.out.println("Descuento del 3%");
		
	}

}
