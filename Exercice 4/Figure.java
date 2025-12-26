public abstract class Figure {
    protected String nom;

    public Figure(String nom) {
        this.nom = nom;
    }

    public abstract double calculerAire();
    public abstract double calculerPerimetre();

    public void afficherDetails(){
        System.out.println("-----------------------------------");
        System.out.println("Nom de la Figure: " + this.nom);
        System.out.println("Aire: " + this.calculerAire());
        System.out.println("Périmètre: " + this.calculerPerimetre());
        System.out.println("-----------------------------------\n");
    }



}
