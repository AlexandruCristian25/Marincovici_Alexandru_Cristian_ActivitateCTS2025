public class Sectiune implements ISectiune {

    private String nume;
    private int nrSectiuni;

    public Sectiune(String nume, int nrSectiuni) {
        nume = nume;
        this.nrSectiuni = nrSectiuni;
    }

    @Override
    public void afisare() {

        System.out.println("Sectiunea " + nume + " are" + " " + nrSectiuni + " nr subsectiuni.");

    }

    @Override
    public int getNrSectiuni() {
        return nrSectiuni;
    }
}
