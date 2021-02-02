package fr.umontpellier.iut.exo1;
import java.time.LocalDate;

public class Etudiant {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String mail;
    private String adresse;


    public Etudiant(String nom, String prenom, LocalDate dateNaissance, String mail, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.mail = mail;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", mail='" + mail + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
