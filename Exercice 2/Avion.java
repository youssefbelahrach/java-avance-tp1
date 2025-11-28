public class Avion extends Vehicule{
    private String compagnie;
    private String vitesseMax;

    public Avion(String nom, double prix, String compagnie, String vitesseMax) {
        super(nom, prix);
        this.compagnie = compagnie;
        this.vitesseMax = vitesseMax;
    }

    public void emettreSon(){
        System.out.println("L'avion fait un bruit de moteur puissant.");
    }

    public void afficherInformations(){
        super.afficherInformations();
        System.out.println("- Compagnie: " + this.compagnie);
        System.out.println("- Vitesse Max de l'Avion: " + this.vitesseMax);
    }
}
