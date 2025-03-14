package mainProgram;

import clase.NotaPlata;
import decorator.NotaDecorata;

public class Main {
    public static void main(String[] args) {

        NotaPlata notaPlata = new NotaPlata(123, 1000);

        NotaDecorata notaDecorata=new NotaDecorata(notaPlata);

        notaDecorata.printeazaFactura();



    }
}