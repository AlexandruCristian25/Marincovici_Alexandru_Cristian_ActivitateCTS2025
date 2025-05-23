import java.util.ArrayList;
import java.util.List;

public class Categorie implements  ISectiune {

    private String numeC;
    private List<ISectiune> continut = new ArrayList<>();

    public  Categorie(String numeC) {

        this.numeC = numeC;

    }

    public void adauga(ISectiune sectiune) {

        continut.add(sectiune);

    }

    @Override
    public void afisare() {

        System.out.println("Categorie " + numeC + " cu un numar total de " + getNrSectiuni());
        for(ISectiune sectiune: continut) {

            sectiune.afisare();

        }

    }

    @Override
    public int getNrSectiuni() {

        int total = 0;
        for(ISectiune sectiune: continut) {

            total += sectiune.getNrSectiuni();

        }

        return total;

    }
}
