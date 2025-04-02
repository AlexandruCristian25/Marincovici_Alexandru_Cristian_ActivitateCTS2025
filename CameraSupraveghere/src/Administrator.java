class Administrator {

    private String nume;

    public Administrator(String nume) {

        this.nume = nume;

    }

    public void primesteNotificare(String mesaj) {

        System.out.println(nume + " a primit notificare: " + mesaj);

    }

}