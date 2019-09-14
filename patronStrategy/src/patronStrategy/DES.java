package patronStrategy;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class DES extends CiframientoLlavePrivada{
	private KeyGenerator key;
	private SecretKey clave;
	private Cipher cipher;
	
	public DES() {
		generar();
	}
	
	public void generar() {
		try {
			key = KeyGenerator.getInstance("DES");
			key.init(56);
			clave = key.generateKey();
			cipher = Cipher.getInstance("DES");
		} catch (NoSuchAlgorithmException e) {
			e.getMessage();
		} catch (NoSuchPaddingException e) {
			e.getMessage();
		}
		
	}
	
	@Override
	public byte[] encriptar(byte[] mensaje) {		
		try {
			
			cipher.init(Cipher.ENCRYPT_MODE, clave);			
			byte[] end = cipher.doFinal(mensaje);
			return end;
		} catch (InvalidKeyException e) {
			e.getMessage();
		} catch (IllegalBlockSizeException e) {
			e.getMessage();
		} catch (BadPaddingException e) {
			e.getMessage();
		}		
		return null;
	}
	
	@Override
	public byte[] desencriptar(byte[] mensaje) {
			System.out.println(mensaje + " esto llego");
			try {
				cipher.init(Cipher.DECRYPT_MODE, clave);				
				byte[] men = cipher.doFinal(mensaje);
				return men;
			} catch (InvalidKeyException e) {
				e.getMessage();
			} catch (IllegalBlockSizeException e) {
				e.getMessage();
			} catch (BadPaddingException e) {
				e.getMessage();
			}			
		
		return null;
		
	}

}
