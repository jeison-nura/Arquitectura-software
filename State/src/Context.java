
public class Context {
	private State state;
	
	public void SetContext(State state) {
		this.state = state;
	}
	
	
	public void request() {
		state.PressPlay();
	}
}
