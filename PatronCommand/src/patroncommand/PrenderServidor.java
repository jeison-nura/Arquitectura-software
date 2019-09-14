package patronCommand;

public class PrenderServidor implements Command{
private IServer servidor;
	
	@Override
	public void execute() {		
		servidor.conectate();
		servidor.VerificarConexion();
		servidor.prendete();
		servidor.guardarLog();
		servidor.cerrarConeccion();
	}
	
	public  PrenderServidor( IServer servidor) {
		this.servidor = servidor;
	} 
}
