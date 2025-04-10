import java.util.List;

public class Main {
    public static void main(String[] args) {
        MagazinPantofi magazin = new MagazinPantofi();

        magazin.adaugaPantof(new Pantof("Nike Air", "Negru", 42, 450));
        magazin.adaugaPantof(new Pantof("Adidas Runner", "Alb", 43, 300));
        magazin.adaugaPantof(new Pantof("Puma Sport", "Rosu", 41, 275));
        magazin.adaugaPantof(new Pantof("Reebok Flex", "Negru", 44, 330));
        magazin.adaugaPantof(new Pantof("Asics Gel", "Albastru", 42, 400));
        magazin.adaugaPantof(new Pantof("New Balance", "Negru", 43, 370));
        magazin.adaugaPantof(new Pantof("Fila Classic", "Alb", 41, 220));
        
        magazin.adaugaCriteriu(new FiltruCuloare("Negru", true));
        magazin.adaugaCriteriu(new FiltruPretMaxim(400, true));
        magazin.adaugaCriteriu(new FiltruMarime(43, false)); // dezactivat

        System.out.println("Rezultatul căutării 1:");
        List<Pantof> rezultat1 = magazin.cauta();
        rezultat1.forEach(System.out::println);

        MagazinPantofi magazin2 = new MagazinPantofi();
        magazin2.adaugaPantof(new Pantof("Nike Air", "Negru", 42, 450));
        magazin2.adaugaPantof(new Pantof("Adidas Runner", "Alb", 43, 300));
        magazin2.adaugaPantof(new Pantof("Puma Sport", "Rosu", 41, 275));
        magazin2.adaugaPantof(new Pantof("Reebok Flex", "Negru", 44, 330));
        magazin2.adaugaPantof(new Pantof("Asics Gel", "Albastru", 42, 400));
        magazin2.adaugaPantof(new Pantof("New Balance", "Negru", 43, 370));
        magazin2.adaugaPantof(new Pantof("Fila Classic", "Alb", 41, 220));

        magazin2.adaugaCriteriu(new FiltruCuloare("Alb", true));
        magazin2.adaugaCriteriu(new FiltruPretMaxim(300, true));

        System.out.println("\nRezultatul căutării 2:");
        List<Pantof> rezultat2 = magazin2.cauta();
        rezultat2.forEach(System.out::println);
    }
}
