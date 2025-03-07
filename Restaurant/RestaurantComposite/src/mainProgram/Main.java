package mainProgram;

import clase.Categorie;
import clase.Item;
import clase.Optiune;

public class Main {
    public static void main(String[] args) {

        Optiune cBauturi =new Categorie("Bauturi");
        Optiune cPizza=new Categorie("Pizza");
        Optiune cDesert =new Categorie("Desert");

        Optiune iBere=new Item("Bere");
        Optiune iCola=new Item("Coca Cola");
        Optiune iDoran = new Item("Dorna");

        Optiune iCapriciosa =new Item("Capriciosa");
        Optiune iMarguerita=new Item("Marguerita");
        Optiune iBufala =new Item("Bufala");

        Optiune iTiramise=new Item("Tiramisu");
        Optiune iPlacinta=new Item("Placinte");
        Optiune iClatite=new Item("Clatite");

        try {
            cBauturi.adaugaNod(iBere);
            cBauturi.adaugaNod(iCola);
            cBauturi.adaugaNod(iDoran);

            cPizza.adaugaNod(iCapriciosa);
            cPizza.adaugaNod(iMarguerita);
            cPizza.adaugaNod(iBufala);

            cDesert.adaugaNod(iTiramise);
            cDesert.adaugaNod(iPlacinta);
            cDesert.adaugaNod(iClatite);

            cBauturi.descriere();
            cPizza.descriere();
            cDesert.descriere();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}