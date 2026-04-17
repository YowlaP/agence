package agence;

import java.util.ArrayList;

public class Agence {
    private String nom;
    private ArrayList<Compte> comptes;

    public Agence(String nom) {
        this.nom = nom;
        this.comptes = new ArrayList<>();
    }

    public void ajouterCompte(Compte c) {
        comptes.add(c);
    }

    public void supprimerCompte(Compte c) {
        comptes.remove(c);
    }

    public int nbComptes() {
        return comptes.size();
    }

    // Recherche par numéro de compte
    public Compte extraireCompte(int numero) {
        for (Compte c : comptes) {
            if (c.getNumero() == numero) return c;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Agence : ").append(nom).append(" (").append(nbComptes()).append(" comptes) ===\n");
        for (Compte c : comptes) {
            sb.append(c).append("\n");
        }
        return sb.toString();
    }
}