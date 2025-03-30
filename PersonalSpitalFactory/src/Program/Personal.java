package Program;


import Factory.FactoryAsistent;
import Factory.FactoryMedic;
import Factory.FactoryPersonal;
import Factory.IPersonalSpital;

public class Personal {

	public static void afisarePersonal(FactoryPersonal factoryPersonal) {
		
		IPersonalSpital p = factoryPersonal.crearePersonal();
		p.descriere();
		
	}
	
	public static void main(String[] args) {
		
		afisarePersonal(new FactoryMedic());
		
	}

}
