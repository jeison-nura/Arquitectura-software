
public class Agua {
	private int temperatura;
	private State state;
	private Contexto context;
	
	public Agua() {
		this.context = new Contexto();
	}
	
	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
		
		if(temperatura <= -34) {
			this.state = new solido();
		}else if (temperatura > 145) {
			this.state = new gaseoso();
		}else {
			this.state = new Liquido();
		}
		
		context.setContexto(state);
		context.request();
	}
	
	
}
