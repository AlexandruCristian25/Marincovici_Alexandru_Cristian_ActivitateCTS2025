package Personal.classes;

public class FactoryPersonal {
	
	public IPersonal createpersonal (TipPersonal personal) throws Exception {
		
		switch (personal){
			
		case Brancardier:
			return new Brancardier();
		
		case Asistent:
			return new Asistent();
		
		case Medic:
			return new Medic();
			
		default:
			throw new Exception("Nu exista tipul de angajat!");
			
		}
	}

}
