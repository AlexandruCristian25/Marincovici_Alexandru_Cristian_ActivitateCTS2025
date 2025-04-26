public class VanzareBiletProxy implements VanzareBiletInterface {
    private VanzareBilet vanzareBilet;

    public VanzareBiletProxy(VanzareBilet vanzareBilet) {
        this.vanzareBilet = vanzareBilet;
    }

    @Override
    public void vindeBilet(String numeClient, int varstaClient) {
        if (varstaClient >= 14) {
            vanzareBilet.vindeBilet(numeClient, varstaClient);
        } else {
            System.out.println("Vânzare refuzată. Clientul " + numeClient + " nu are vârsta minimă de 14 ani.");
        }
    }
}
