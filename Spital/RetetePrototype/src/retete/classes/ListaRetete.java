package retete.classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListaRetete implements iListaRetere{

	private List<String> lista_retete;
	
	public ListaRetete() {
		super();
		this.lista_retete = new ArrayList<>();
	}

	public void setOferte(List<String> lista1) {
		
		this.lista_retete = lista1;
	}

	@Override
	public iListaRetere copiaza() {

	ListaRetete lista = new ListaRetete();
	List<String> lista_temp = new ArrayList<>();
		
		for(String r:lista_retete) {
			
			lista_temp.add(r);
			
		}
		lista.setOferte(lista_temp);

		return lista;

	}

	@Override
	public void incarcaRetete() {

		try {
			BufferedReader reader=new BufferedReader(new FileReader("Retete.txt"));
			String oferta=null;
			while((oferta=reader.readLine())!=null) {
				lista_retete.add(oferta);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public String toString() {
		return "ListaRetete " + lista_retete + "";
	}
	
	
}
