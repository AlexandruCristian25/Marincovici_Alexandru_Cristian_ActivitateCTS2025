class Magazin implements IMagazin {

    @Override
    public double calculeazaTotal(String client, double totalCos, String adresa) {
        double taxaTransport = (adresa.equals("local")) ? 10 : 20;
        return totalCos + taxaTransport;
    }

}
