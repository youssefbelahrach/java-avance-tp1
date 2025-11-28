public class Livre {
    private int isbn;
    private String titre;
    private Auteur auteurLivre;

    public Livre(int ISBN, String titre, Auteur auteurLivre) {
        this.isbn = ISBN;
        this.titre = titre;
        this.auteurLivre = auteurLivre;
    }

    @Override
    public String toString() {
        return "Livre: " + titre + " (ISBN: " + isbn + ")\n" + "Ecrit par: [" + auteurLivre.toString();
    }
}
