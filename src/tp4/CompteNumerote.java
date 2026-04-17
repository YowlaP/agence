package tp4;

public class CompteNumerote extends CompteParticulier {
    private static int nid = 100000; // compteur statique des comptes numérotés
    private int identification;

    public CompteNumerote(float solde, String nom, String prenom) {
        super(solde, nom, prenom); // nom connu de la banque, jamais affiché
        nid++;
        this.identification = nid;
    }

    // Pas de découvert (hérité de CompteParticulier)

    @Override
    public String toString() {
        return "*************************\n" +
               "compte n° : " + getNumero() + "\n" +
               "Identification : " + identification + "\n" +
               "solde : " + (int) getSolde() + " euro\n" +
               "*************************";
    }
}
