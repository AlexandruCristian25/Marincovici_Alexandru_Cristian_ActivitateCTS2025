//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Spital s1 = new Spital("Spital1", 5);
        Spital s2 = new Spital("Spital2", 6);
        Spital s3 = new Spital("Spital3", 9);

        Sectie terapieIntensiva = new Sectie("terapie intensiva");
        terapieIntensiva.adauga(s2);
        terapieIntensiva.adauga(s3);

        Sectie reanimare = new Sectie("Reanimare");
        reanimare.adauga(s1);
        reanimare.adauga(s3);
        reanimare.adauga(terapieIntensiva);

        reanimare.afisare();
        terapieIntensiva.afisare();

    }
}