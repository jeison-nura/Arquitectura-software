package patronStrategy;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class RSA extends CiframientoLlavePublica{
	
	private PrivateKey pk = null;
	private PublicKey puk = null;
	private Cipher ch = null;
	private KeyPairGenerator kpg;
	private KeyPair kp;
	public RSA() {		
		try {
			kpg = KeyPairGenerator.getInstance("RSA");
		    kp = kpg.generateKeyPair();
		    pk = kp.getPrivate();
		    puk = kp.getPublic();
		    ch = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		    
		} catch (NoSuchAlgorithmException e) {
			e.getMessage();
		} catch (NoSuchPaddingException e) {
			e.getMessage();
		}
	   
		
	}
	
	@Override
	public byte[] encriptar(byte[] mensaje) {
		try {
			ch.init(Cipher.ENCRYPT_MODE, puk);
			byte[] encrip = ch.doFinal( mensaje);
			return encrip;
			
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
		
		try {
			ch.init(Cipher.DECRYPT_MODE, pk);
			byte[] encrip = ch.doFinal( mensaje);
			return encrip;
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
