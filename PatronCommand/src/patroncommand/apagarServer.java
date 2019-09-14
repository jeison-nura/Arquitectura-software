package patronCommand;

public class apagarServer implements Command{

	private IServer servidor;
	
	@Override
	public void execute() {		
		servidor.conectate();
		servidor.VerificarConexion();
		servidor.guardarLog();
		servidor.apagate();
		servidor.cerrarConeccion();
	}
	
	public apagarServer (IServer servidor) {
		this.servidor = servidor;
	}

}
