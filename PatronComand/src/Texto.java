import java.util.ArrayList;

public class Texto implements Text{
	
	ArrayList<String> textos = new ArrayList<String>();
	private int index = textos.size();
	
	public String texto;
	
	@Override
	public void hacer() {
		if(index < textos.size()) {
			index++;
		}
		this.texto = textos.get(index);
	}

	@Override
	public void deshacer() {
		if(index > 0) {
			index--;
		}
		this.texto = textos.get(index);
	}

	public void setTexto(String texto) {
		this.texto = texto;
		textos.add(texto);
		index = textos.size();
	}
	
	public void Eliminar(String texto) {
		this.texto = "";
		textos.add(texto);
		index = textos.size();
	}
	
	public void Agregar(String texto) {
		textos.add(texto);
		index = textos.size();
	}
	
	public void Modificar(String texto) {
		this.texto = texto;
		textos.add(texto);
	}
	
	public void imprimir() {
		System.out.println(this.texto);
	}
}
