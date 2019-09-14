package patronStrategy;

public interface ICiframiento {
	public byte[] encriptar(byte[] bs);
	public byte[] desencriptar(byte[] mensaje);
}
