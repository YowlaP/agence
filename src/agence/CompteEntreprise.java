package agence;

public class CompteEntreprise extends Compte {
    private String raisonSociale;
    private float decouvert; // fixé au 1er dépôt (= solde initial)

    public CompteEntreprise(float solde, String raisonSociale) {
        super(solde);
        this.raisonSociale = raisonSociale;
        this.decouvert = solde; // le découvert max = montant du premier dépôt
    }

    // Découvert autorisé jusqu'à -decouvert
    @Override
    public float debiter(float montant) {
        float maxRetrait = getSolde() + decouvert;
        float retire = Math.min(montant, maxRetrait);
        setSolde(getSolde() - retire);
        return retire;
    }

    public String getRaisonSociale() { return raisonSociale; }
    public float getDecouvert() { return decouvert; }

    @Override
    public String toString() {
        return "*************************\n" +
               "compte n° : " + getNumero() + "\n" +
               "Entreprise : " + raisonSociale + "\n" +
               "solde : " + (int) getSolde() + " euro\n" +
               "découvert max : " + (int) decouvert + " euro\n" +
               "*************************";
    }
}
