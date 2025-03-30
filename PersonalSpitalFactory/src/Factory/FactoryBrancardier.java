package Factory;

public class FactoryBrancardier implements FactoryPersonal{
	
	@Override
	public IPersonalSpital crearePersonal() {
		
		return new Brancardier();
	}

}
