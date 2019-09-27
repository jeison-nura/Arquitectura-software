
public class TextToBina implements IInterpreter{

	@Override
	public void interpreter(Context context) {
		
		for(char letra: context.entrada.toCharArray()) {
			context.salida += String.format("%16s", Integer.toBinaryString(letra));
		}
		
	}

}
