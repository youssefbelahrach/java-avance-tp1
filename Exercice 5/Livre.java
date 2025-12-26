public class Livre implements Empruntable{

    private String titre;
    private String auteur;
    private boolean estEmprunte;

    public Livre() {
    }

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.estEmprunte = false;
    }

    @Override
    public void emprunter() {
        estEmprunte = true;
        System.out.println("Le livre '" + titre + "' a été emprunté.");
    }

    @Override
    public void retourner() {
        estEmprunte = false;
        System.out.println("Le livre '" + titre + "' a été retourné.");
    }
}
