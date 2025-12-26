public class Utilisateur {
    private String nom;

    public Utilisateur() {
    }

    public Utilisateur(String nom) {
        this.nom = nom;
    }

    public void emprunterObjet(Empruntable objet) {
        objet.emprunter();
    }
}
