package agence;

public abstract class Compte {
    private float solde;
    private static int nbTotalCompte = 0;
    private int numero;
 
    public Compte(float solde) {
        this.solde = solde;
        nbTotalCompte++;
        this.numero = nbTotalCompte;
    }
 
    public void crediter(float montant) {
        this.solde += montant;
    }
 
    // Retourne le montant effectivement retiré
    public abstract float debiter(float montant);
 
    public float getSolde() { return solde; }
    public void setSolde(float solde) { this.solde = solde; }
    public int getNumero() { return numero; }
    public static int getNbTotalCompte() { return nbTotalCompte; }
 
    @Override
    public String toString() {
        return "*************************\n" +
               "compte n° : " + numero + "\n" +
               "solde : " + (int) solde + " euro\n" +
               "*************************";
    }
}