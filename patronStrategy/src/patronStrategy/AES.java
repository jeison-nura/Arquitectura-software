package patronStrategy;


import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;



public class AES extends CiframientoLlavePrivada{
	private KeyGenerator key;
	private Key clave;
	private Cipher cipher;	
	
	public AES() {
		generar();
	}
	
	public void generar() {
		try {
			key = KeyGenerator.getInstance("AES");
			key.init(128);
			clave = key.generateKey();
			cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
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
		System.out.println(mensaje + " llego esto");
		try {
			cipher.init(Cipher.DECRYPT_MODE, clave);
			byte[] men = cipher.doFinal(mensaje);
			return men;
		} catch (InvalidKeyException e) {
			System.out.println(e.getMessage());
		} catch (IllegalBlockSizeException e) {
			System.out.println(e.getMessage());
		} catch (BadPaddingException e) {
			System.out.println(e.getMessage());
		} 			

		return null;
	}
}
