public class DVD implements Empruntable {
    private String titre;
    private String realisateur;
    private boolean estEmprunte;


    public DVD() {
    }

    public DVD(String titre, String realisateur) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.estEmprunte = false;
    }

    @Override
    public void emprunter() {
        estEmprunte = true;
        System.out.println("Le DVD '" + titre + "' a été emprunté.");
    }

    @Override
    public void retourner() {
        estEmprunte = false;
        System.out.println("Le DVD '" + titre + "' a été retourné.");
    }
}
