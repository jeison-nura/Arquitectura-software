
public class TextToASCII implements IInterpreter{

	@Override
	public void interpreter(Context context) {
		
		for(int i = 0; i < context.entrada.length(); i++ ) {
			
			context.salida += context.entrada.codePointAt(i);
			
		}
		
	}

}
