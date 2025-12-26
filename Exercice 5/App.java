public class App {
    public static void main(String[] args) {
        Livre livre1 = new Livre("Le Dernier Jour d'un condamné", "Victor Hugo");
        DVD dvd1 = new DVD("Harry Potter à l'école des sorciers", "Chris Columbus");
        Utilisateur u1 = new Utilisateur("Ahmed");

        u1.emprunterObjet(livre1);
        u1.emprunterObjet(dvd1);

        livre1.retourner();
    }
}
