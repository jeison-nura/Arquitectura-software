import java.util.Base64;


public class TextToBase64 implements IInterpreter{

	@Override
	public void interpreter(Context context) {
		
		context.salida = Base64.getEncoder().encodeToString(context.entrada.getBytes());
		
	}

}
