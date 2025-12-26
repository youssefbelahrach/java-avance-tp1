public class App {
    public static void main(String[] args) {

        Paiement Carte1 = new CarteCredit( 111, "1234-1234-1234-1234");
        Paiement PayPal1 = new PayPal(222, "test@test.ma");

        Commande cmd1 = new Commande(1500.0, Carte1);
        Commande cmd2 = new Commande(1000.0, PayPal1);

        cmd1.ProcessPaiement();
        cmd2.ProcessPaiement();

    }
}
