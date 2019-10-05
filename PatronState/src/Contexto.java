
public class Contexto {

	private State state;
	
	
	
	public void setContexto (State state) {
		this.state = state;
	}
	
	public void request() {
		state.estado();
	}
	
}
