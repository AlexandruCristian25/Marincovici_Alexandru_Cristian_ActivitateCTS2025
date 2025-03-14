package decorator;

import clase.INotaPlata;
import clase.NotaPlata;

public class Decorator implements INotaPlata {

    protected NotaPlata notaPlata;

    public Decorator(NotaPlata notaPlata){
        this.notaPlata = notaPlata;
    }


    @Override
    public void printeazaFactura() {
        System.out.println("La Multi Ani!");
    }
}
