public class Application {
    public static void main(String[] args) {
        Cercle c = new Cercle("Cercle", 4);
        Rectangle r = new Rectangle("Rectangle", 2, 4);

        c.afficherDetails();
        r.afficherDetails();

    }
}
