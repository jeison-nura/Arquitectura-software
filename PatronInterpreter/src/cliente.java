

public class cliente {

	public static void main(String[] args) {
		Context context = new Context("Texto Ejemplo");
		
		IInterpreter ac = new TextToHexa();
		ac.interpreter(context);
		System.out.println(context.salida);
		
	}

}
