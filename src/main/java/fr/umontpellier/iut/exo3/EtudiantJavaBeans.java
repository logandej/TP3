package fr.umontpellier.iut.exo3;

import java.time.LocalDate;

public class EtudiantJavaBeans {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String mail;
    private String Adresse;



    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", mail='" + mail + '\'' +
                ", adresse='" + Adresse + '\'' +
                '}';
    }

}
