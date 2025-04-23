public class PlataVirament implements IPlata {
    @Override
    public void plateste(double suma) {
        System.out.println("Plata prin virament bancar a sumei de " + suma + " RON efectuată.");
    }
}