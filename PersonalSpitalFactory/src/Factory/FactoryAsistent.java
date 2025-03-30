package Factory;

public class FactoryAsistent implements FactoryPersonal{
	
	@Override
	public IPersonalSpital crearePersonal() {
		
		return new Asistent();
	}

}
