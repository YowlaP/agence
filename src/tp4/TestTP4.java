package tp4;

public class TestTP4 {
    public static void main(String[] args) {
        float solde;

        CompteParticulier cp1 = new CompteParticulier(100, "Rene", "Lepauvre");
        System.out.println(cp1);
        cp1.crediter(1000);
        System.out.println(cp1);
        solde = cp1.debiter(1200);
        System.out.println("Argent retiré " + solde);
        System.out.println(cp1);

        CompteParticulier cp2 = new CompteParticulier(200, "Mathieu", "Leriche");
        System.out.println("----------------------------");

        CompteEntreprise ce1 = new CompteEntreprise(10000, "GateauxBretons");
        System.out.println(ce1);
        ce1.crediter(1000);
        System.out.println(ce1);
        solde = ce1.debiter(13000);
        System.out.println("Argent retiré " + solde);
        System.out.println(ce1);

        CompteEntreprise ce2 = new CompteEntreprise(10000, "FromagesCorses");
        System.out.println("----------------------------");

        CompteNumerote cn1 = new CompteNumerote(10000, "Jean", "Cache");
        System.out.println(cn1);
        cn1.crediter(1000);
        System.out.println(cn1);
        solde = cn1.debiter(13000);
        System.out.println("Argent retiré " + solde);
        System.out.println(cn1);

        CompteNumerote cn2 = new CompteNumerote(10000, "Paul", "Lisse");
        System.out.println("----------------------------");

        Agence bf = new Agence("BankFraude");
        bf.ajouterCompte(cp1);
        bf.ajouterCompte(cp2);
        bf.ajouterCompte(ce1);
        bf.ajouterCompte(ce2);
        bf.ajouterCompte(cn1);
        bf.ajouterCompte(cn2);
        System.out.println(bf);

        bf.supprimerCompte(cp1);
        System.out.println(bf);

        Compte c = bf.extraireCompte(2);
        System.out.println(c);
    }
}