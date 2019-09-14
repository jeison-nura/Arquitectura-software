package patronCommand;

public class Cliente {
	
	public static void main(String[] args) {

		Command command = new PrenderServidor(new BrasilServer()); 
		Invoker servAdmin = new Invoker(command);
		servAdmin.run();
	}
}
