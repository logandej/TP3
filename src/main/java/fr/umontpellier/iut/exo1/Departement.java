package fr.umontpellier.iut.exo1;
import java.util.*;
public class Departement {
    private String specialite;
    private String adresse;
    private ArrayList<Etudiant> ListeEtudiant;

    public Departement(String specialite, String adresse) {
        this.specialite = specialite;
        this.adresse = adresse;
        ListeEtudiant = new ArrayList<>();

    }

    @Override
    public String toString() {

        return "Departement{" +
                "ListeEtudiant=" + ListeEtudiant +
                '}';
    }
    public void inscrire(Etudiant etud)
    {
        ListeEtudiant.add(etud);
    }
    public void desinscrire(Etudiant etud)
    {
        ListeEtudiant.remove(etud);
    }
}
