public class VanzareBilet implements VanzareBiletInterface {
    @Override
    public void vindeBilet(String numeClient, int varstaClient) {
        System.out.println("Bilet vândut către " + numeClient);
    }
}
