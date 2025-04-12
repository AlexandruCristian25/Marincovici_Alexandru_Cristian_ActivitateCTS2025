public class RaportFactory {

    public FieldReport getRaport(String tipRaport) {

        if(tipRaport.equalsIgnoreCase("Informare")) {

            return new RaportInformare();

        }

        if(tipRaport.equalsIgnoreCase("Avertizare")) {

            return new RaportAvertizare();

        }if(tipRaport.equalsIgnoreCase("Alertare")) {

            return new RaportAlertare();

        }

        return null;

    }

}
