import java.util.HashMap;

public class SalonPrivado implements ISalonChat{
	
	private HashMap<String, Usuario> participantes = new HashMap<String, Usuario>();
	private HashMap<String, Usuario> bloqueados = new HashMap<String, Usuario>();

	@Override
	public void registra(Usuario user) {
		participantes.put(user.getNombre(), user);
	}

	@Override
	public void envia(String de, String a, String msg) {
		if ( bloqueados.containsKey(de) ) {
			System.out.println("Ustede se encuentra bloqueado");
		}else if ( bloqueados.containsKey(a) ) {
			System.out.println("El usuario a quien intenta enviar el mensaje se encuentra bloqueado");
		} else {
			if ( participantes.containsKey(de) && participantes.containsKey(a)) {
				Usuario u = participantes.get(a);
				u.recibe(de, msg);
			} else {
				System.out.println("Usuario Inexistente");
			}
		}
	}
	
	public void bloquearUsuario(Usuario user) {
		if(participantes.containsKey(user.getNombre())) {
			bloqueados.put(user.getNombre(), user);
		} else {
			System.out.println("El usuario que intenta bloquear no se encuentra en la sala del chat");
		}		
	}
	
	public void desbloquearUsuario(Usuario user) {
		if(participantes.containsKey(user.getNombre()) && bloqueados.containsKey(user.getNombre())) {
			bloqueados.remove(user.getNombre(), user);
			System.out.println("el usuario: " + user.getNombre() + " ha sido desbloqueado");
		} else {
			System.out.println("El usuario que intenta desbloquear no se encuentra en la sala del chat"
					+ "o no se encuentra bloqueado");
		}
	}
	
	public void invitarUsuario(Usuario user) {
		participantes.put(user.getNombre(), user);
		System.out.println("Se agrego a : " + user.getNombre() + " a la sala");
	}
	
	public void BuscarUsuario(Usuario user) {
		if(participantes.containsKey(user.getNombre())) {
			System.out.println("El usuario: " + participantes.get(user.getNombre()) + " se encuentra en la sala");
		}
	}

}
