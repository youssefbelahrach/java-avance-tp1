public class Application {
    public static void main(String[] args) {

        Ingenieur engineer = new Ingenieur("Salami", "Ahmed", "salami@test.ma", "0601020304", 15000, "Développeur Java");
        Manager chef = new Manager("Baba", "Karim", "baba@test.ma", "0605060708", 32000, "Finance");

        System.out.println("------- Ingénieur -------");
        System.out.println("Nom & Prénom : " + engineer.nom + " " + engineer.prenom);
        System.out.println("Spécialité : " + engineer.specialite);
        System.out.println("Salaire: " + engineer.calculerSalaire() + " DH");

        System.out.println("\n------- Manager -------");
        System.out.println("Nom & Prénom  : " + chef.nom + " " + chef.prenom);
        System.out.println("Service : " + chef.service);
        System.out.println("Salaire: " + chef.calculerSalaire() + " DH");
    }
}
