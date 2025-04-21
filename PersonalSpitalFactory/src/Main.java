public class Main {
    public static void main(String[] args) {
        PersonalSpital p1 = FactoryPersonal.crearePersonal(TipPersonal.MEDIC, "Dr. Ionescu");
        PersonalSpital p2 = FactoryPersonal.crearePersonal(TipPersonal.ASISTENT, "Maria Pop");
        PersonalSpital p3 = FactoryPersonal.crearePersonal(TipPersonal.BRANCARDIER, "Ion Vasilescu");

        p1.afiseazaDetalii();
        p2.afiseazaDetalii();
        p3.afiseazaDetalii();
    }
}
