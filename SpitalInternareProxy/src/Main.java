public class Main {
    public static void main(String[] args) {
        Pacient p1 = new Pacient("Ion Popescu", true);
        Pacient p2 = new Pacient("Maria Ionescu", false);

        Internare internare = new FiltruAsigurare(new InternareSpital());

        internare.interneaza(p1);
        internare.interneaza(p2); 
    }
}
