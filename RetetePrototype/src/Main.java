//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        IReteta reteta1 = new Reteta("Compensata", 5, true);
        System.out.println(reteta1);
        IReteta reteta2 = new Reteta("Cu plata", 8, false);
        System.out.println(reteta1);
        IReteta reteta3 = new Reteta("Gratis", 3, true);
        System.out.println(reteta1);
        
    }
}