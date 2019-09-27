
public class cliente {

	public static void main(String[] args) {
		SalonPrivado s = new SalonPrivado();
			
			
		Usuario u1 = new Usuario(s);
		u1.setNombre("jaime");
		s.registra(u1);
		
		Usuario u2 = new Usuario(s);
		u2.setNombre("jeison");
		s.registra(u2);
		
		Usuario u3 = new Usuario(s);
		u3.setNombre("pedro");
		s.registra(u3);
		
		s.bloquearUsuario(u1);
		
		u2.envia("jaime", "hola");
		u3.envia("jorge", "este man esta aqui");
		u3.envia("jeison", "lo elimino?");
		
		s.desbloquearUsuario(u2);
		s.desbloquearUsuario(u1);
		
		u2.envia("jaime", "hola");
	}

}
