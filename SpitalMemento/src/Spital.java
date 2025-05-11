public class Spital {

    private SpitalStaticData staticData;
    private String medic;
    private String rezultat;

    public Spital(SpitalStaticData staticData, String medic, String rezultat) {
        this.staticData = staticData;
        this.medic = medic;
        this.rezultat = rezultat;
    }

    public Memento saveToMemento() {

        return new Memento(medic, rezultat);

    }

    public void restoreFromMemento(Memento memento) {

        this.medic = memento.getMedic();
        this.rezultat = memento.getRezultat();

    }

    public SpitalStaticData getStaticData() {
        return staticData;
    }

    public void setStaticData(SpitalStaticData staticData) {
        this.staticData = staticData;
    }

    public String getMedic() {
        return medic;
    }

    public void setMedic(String medic) {
        this.medic = medic;
    }

    public String getRezultat() {
        return rezultat;
    }

    public void setRezultat(String rezultat) {
        this.rezultat = rezultat;
    }

    public static class Memento {

        private final String medic;
        private final String rezultat;

        public Memento(String medic, String rezultat) {
            this.medic = medic;
            this.rezultat = rezultat;
        }

        public String getMedic() {
            return medic;
        }

        public String getRezultat() {
            return rezultat;
        }
    }
}
