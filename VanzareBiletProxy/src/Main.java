public class Main {
    public static void main(String[] args) {
        VanzareBiletInterface vanzare = new VanzareBiletProxy(new VanzareBilet());

        vanzare.vindeBilet("Alex", 16); // Bilet vândut
        vanzare.vindeBilet("Mihai", 12); // Vânzare refuzată
    }
}
