
public class desHacer implements Command{

private Text texto;
	
	@Override
	public void execute() {		
		texto.deshacer();
	}
	
	public desHacer(Text texto) {
		this.texto = texto;
	}	

}
