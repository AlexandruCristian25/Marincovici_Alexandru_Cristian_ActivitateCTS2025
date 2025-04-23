public class PlataCard implements IPlata {
    @Override
    public void plateste(double suma) {
        System.out.println("Plata cu cardul a sumei de " + suma + " RON efectuată.");
    }
}