public class FactoryPersonal {
    public static PersonalSpital crearePersonal(TipPersonal tip, String nume) {
        switch (tip) {
            case BRANCARDIER:
                return new Brancardier(nume);
            case ASISTENT:
                return new Asistent(nume);
            case MEDIC:
                return new Medic(nume);
            default:
                throw new IllegalArgumentException("Tip personal necunoscut: " + tip);
        }
    }
}
