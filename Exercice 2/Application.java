public class Application {

    public static void main(String[] args) {

        Voiture clio = new Voiture("Renault", 250000, "Clio", 2021);
        Moto peugeaut = new Moto("Peugeaut", 10000, "103", "2 ch");
        Avion airbus = new Avion("Airbus", 500000000, "A380", "1100 Km/h");

        clio.emettreSon();
        clio.afficherInformations();
        System.out.println();

        peugeaut.emettreSon();
        peugeaut.afficherInformations();
        System.out.println();

        airbus.emettreSon();
        airbus.afficherInformations();
    }


}
