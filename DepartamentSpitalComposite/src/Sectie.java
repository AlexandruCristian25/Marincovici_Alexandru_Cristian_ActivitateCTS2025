import java.util.ArrayList;
import java.util.List;

public class Sectie implements ISpital {

    private String nume;
    private List<ISpital> continut = new ArrayList<>();

    public Sectie(String nume) {

        this.nume = nume;

    }

    public void adauga(ISpital spital) {

        continut.add(spital);

    }

    @Override
    public void afisare() {

        System.out.println("Sectia " + nume + " cu un numar total de medici: " + getNrMedici());
        for(ISpital spital: continut) {

            spital.afisare();

        }

    }

    @Override
    public int getNrMedici() {

        int totalS = 0;
        for(ISpital spital: continut) {

            totalS += spital.getNrMedici();

        }

        return totalS;

    }
}
