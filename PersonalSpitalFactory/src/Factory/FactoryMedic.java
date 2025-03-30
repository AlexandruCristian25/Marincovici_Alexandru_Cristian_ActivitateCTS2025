package Factory;

public class FactoryMedic implements FactoryPersonal{

	@Override
	public IPersonalSpital crearePersonal() {
		
		return new Medic();
	}

}
