package patronCommand;

public class BrasilServer implements IServer{

	@Override
	public void apagate() {
		System.out.println("aPagando server brasil");
	}

	@Override
	public void prendete() {
		System.out.println("prendiendo server brasil");
	}

	@Override
	public void conectate() {
		System.out.println("conectando a brasil");
	}

	@Override
	public void VerificarConexion() {
		System.out.println("verificando conexion a brasil");
	}

	@Override
	public void guardarLog() {
		System.out.println("guardando");
	}

	@Override
	public void cerrarConeccion() {
		System.out.println("cerrando coneccion a brasil");		
	}


}
