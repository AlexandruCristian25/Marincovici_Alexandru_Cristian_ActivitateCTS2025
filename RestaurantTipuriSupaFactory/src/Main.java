//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Supa s1 = SupaFactory.creeazaSupa(TipSupa.SupaLeguma, "Supa legume", 15.99);
        Supa s2 = SupaFactory.creeazaSupa(TipSupa.SupaCiuperci, "Supa ciuperci", 20.99);
        Supa s3 = SupaFactory.creeazaSupa(TipSupa.SupaVita, "Supa vita", 18.99);

        s1.afiseazaInfo();
        s2.afiseazaInfo();
        s3.afiseazaInfo();

    }
}