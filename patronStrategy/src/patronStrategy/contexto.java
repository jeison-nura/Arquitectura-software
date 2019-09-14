package patronStrategy;

public class contexto {
	
	private ICiframiento ic;
	
	public contexto( ICiframiento Ici) {
		this.ic = Ici;
	}
	
	public byte[] Ciframiento(byte[] bs){
		return ic.encriptar(bs);
	}
	
	public byte[] desciframiento(byte[] mensaje){
		return ic.desencriptar(mensaje);
	}
	
}
