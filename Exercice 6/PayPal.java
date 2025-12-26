public class PayPal extends Paiement{
    private String email;

    public PayPal(long numTransaction, String email) {
        super(numTransaction);
        this.email = email;
    }
    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement de " + montant + " DH effectué via PayPal.");
    }
}
