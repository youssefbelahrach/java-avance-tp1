public class Application {
    public static void main(String[] args) {
        Adherent adh = new Adherent("Ali", "Baba", "test@test.com", "000111222333", 25, 12345);
        Auteur aut = new Auteur("Victor", "Hugo", "victor@hugo.com", "222333444555", 50, 98765);
        Livre book = new Livre(333, "Le Dernier Jour d'un condamné", aut);

        System.out.println("----- Affichage des Informations -----");
        System.out.println(adh);
        System.out.println(book);
    }
}
