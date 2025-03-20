package Main;

import Clase.PachetInternareBuilder;

public class Program {
    public Program() {
    }

    public static void main(String[] args) {
        PachetInternareBuilder pachet = (new PachetInternareBuilder()).setHasHalat(false).setHasMicDejun(true).setHasPapuci(true).setHasPatRabatabil(false);
        System.out.println(pachet.build());
    }
}
