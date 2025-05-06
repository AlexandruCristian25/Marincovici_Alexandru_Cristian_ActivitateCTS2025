public class Autobuz {
    private AutobuzStaticData staticData;  // flyweight
    private String sofer;
    private float consumMediu;

    public Autobuz(AutobuzStaticData staticData, String sofer, float consumMediu) {
        this.staticData = staticData;
        this.sofer = sofer;
        this.consumMediu = consumMediu;
    }

    public Memento saveToMemento() {
        return new Memento(sofer, consumMediu);
    }

    public void restoreFromMemento(Memento memento) {
        this.sofer = memento.getSofer();
        this.consumMediu = memento.getConsumMediu();
    }

    public AutobuzStaticData getStaticData() {
        return staticData;
    }

    public void setStaticData(AutobuzStaticData staticData) {
        this.staticData = staticData;
    }

    public String getSofer() {
        return sofer;
    }

    public void setSofer(String sofer) {
        this.sofer = sofer;
    }

    public float getConsumMediu() {
        return consumMediu;
    }

    public void setConsumMediu(float consumMediu) {
        this.consumMediu = consumMediu;
    }

    public static class Memento {
        private final String sofer;
        private final float consumMediu;

        public Memento(String sofer, float consumMediu) {
            this.sofer = sofer;
            this.consumMediu = consumMediu;
        }

        public String getSofer() {
            return sofer;
        }

        public float getConsumMediu() {
            return consumMediu;
        }
    }
}
