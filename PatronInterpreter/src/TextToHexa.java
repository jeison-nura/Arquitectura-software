
public class TextToHexa implements IInterpreter{

	@Override
	public void interpreter(Context context) {
		
		for(char letra: context.entrada.toCharArray()) {
			context.salida += Integer.toHexString(letra);
		}
		
	}

}
