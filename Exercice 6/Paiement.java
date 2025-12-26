public abstract class Paiement {
    private long numTransaction;

    public Paiement(long numTransaction) {
        this.numTransaction = numTransaction;
    }

    public Paiement() {
    }

    public abstract void effectuerPaiement(double montant);
}
