import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calator calator1 = new Calator("Popescu Alexandru", false);
        Calator calator2 = new Calator("Ionescu Vasile", true);
        Calator calator3 = new Calator("Vasilescu Maria", true);

        List<Calator> calatori = Arrays.asList(calator1, calator2, calator3);

        NotificarePlecare notificarePlecare = new NotificarePlecare();
        notificarePlecare.trimiteNotificare(calatori);

    }
}