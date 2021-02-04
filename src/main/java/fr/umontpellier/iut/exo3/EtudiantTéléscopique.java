package fr.umontpellier.iut.exo3;
import fr.umontpellier.iut.exo2.Note;
import java.time.LocalDate;
import java.util.ArrayList;

public class EtudiantTéléscopique {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String mail;
    private String adresse;
    private ArrayList<Note> ListeNotes= new ArrayList<>();


    public EtudiantTéléscopique(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public EtudiantTéléscopique(String nom, String prenom, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    public EtudiantTéléscopique(String nom, String prenom, String mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
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

}
