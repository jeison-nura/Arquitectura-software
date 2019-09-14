package patronCommand;

public class ArgentinaServer implements IServer{

	@Override
	public void apagate() {
		System.out.println("aPagando server argentina");
	}

	@Override
	public void prendete() {
		System.out.println("prendiendo server argentina");
	}

	@Override
	public void conectate() {
		System.out.println("conectando a argentina");
	}

	@Override
	public void VerificarConexion() {
		System.out.println("verificando conexion a argentina");
	}

	@Override
	public void guardarLog() {
		System.out.println("guardando");
	}

	@Override
	public void cerrarConeccion() {
		System.out.println("cerrando coneccion a argentina");		
	}

}
