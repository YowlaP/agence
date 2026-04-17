package agence;

public class CompteParticulier extends Compte {
    private String nom;
    private String prenom;

    public CompteParticulier(float solde, String nom, String prenom) {
        super(solde);
        this.nom = nom;
        this.prenom = prenom;
    }

    // Pas de découvert : on ne retire que ce qu'il y a
    @Override
    public float debiter(float montant) {
        float retire = Math.min(montant, getSolde());
        setSolde(getSolde() - retire);
        return retire;
    }

    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }

    @Override
    public String toString() {
        return "*************************\n" +
               "compte n° : " + getNumero() + "\n" +
               "Titulaire : " + prenom + " " + nom + "\n" +
               "solde : " + (int) getSolde() + " euro\n" +
               "*************************";
    }
}
