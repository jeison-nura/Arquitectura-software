
public class Cliente {

	public static void main(String[] args) {
		Texto text = new Texto();
		Command comando = new desHacer(text);
		Command comando2 = new HacerTexto(text);
		Invoker edi = new Invoker(comando);
		Invoker edo = new Invoker(comando2);
		text.setTexto("hola");
		text.imprimir();
		edi.run();
		text.Modificar("modificado");
		text.imprimir();
		edi.run();
		text.imprimir();
		edo.run();
		text.imprimir();
	}

}
