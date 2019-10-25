
public class VideoPlayer {
	private State state;
	private Context context;
	private boolean repro = false;
	private boolean reanu = false;
	
	public VideoPlayer() {
		this.context = new Context();
	}
	
	public void Reproducir() {
		if(repro == false) {
			state = new BegininState();
			repro = true;
			stateActive();
		}else if(repro == true && reanu == true){
			state = new PlayinState();
			reanu = false;
			stateActive();
		}else {
			System.out.println("el video no se a pausado o iniciado");
		}		
		
	}
	
	public void pausar() {
		if(repro == false) {
			System.out.println("No se a iniciado el video");
		}else {
			state = new StandbyState();
			reanu = true;
			stateActive();
		}
			}
	
	public void terminar() {
		state = new FinishState();
		repro = false;
		stateActive();
	}
	
	private void stateActive() {
		context.SetContext(state);
		context.request();
	}
}
