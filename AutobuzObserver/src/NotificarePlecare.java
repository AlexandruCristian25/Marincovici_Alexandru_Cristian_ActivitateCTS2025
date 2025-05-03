import java.util.List;

public class NotificarePlecare {

    public void trimiteNotificare(List<Calator> calatori) {

        for(Calator calator : calatori) {

            if(calator.isSubscribedToNotificcations()) {

                trimiteNotificare(calator);

            }

        }

    }

    private void trimiteNotificare(Calator calator) {

        System.out.println("Trimite notificare catre: " + calator.getNume());

    }

}
