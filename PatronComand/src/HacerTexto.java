
public class HacerTexto implements Command{

	private Text texto;
	
	@Override
	public void execute() {		
		texto.hacer();
	}
	
	public HacerTexto(Text texto) {
		this.texto = texto;
	}	

}
