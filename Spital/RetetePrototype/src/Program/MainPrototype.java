package Program;

import retete.classes.ListaRetete;
import retete.classes.iListaRetere;

public class MainPrototype {

	public static void main(String[] args) {


		iListaRetere lista = new ListaRetete();
		lista.incarcaRetete();
		
		iListaRetere copie  = new ListaRetete();
		copie = lista.copiaza();
		
		System.out.println(copie);

	}

}
