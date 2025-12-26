public class CarteCredit extends Paiement{
    private String numeroCarte;

    public CarteCredit(long numTransaction, String numCarte) {
        super(numTransaction);
        this.numeroCarte = numCarte;
    }
    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement de " + montant + " DH effectué par Carte de Crédit.");
    }
}
