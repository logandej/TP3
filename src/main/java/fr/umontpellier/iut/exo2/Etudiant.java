package fr.umontpellier.iut.exo2;
import java.time.LocalDate;
import java.util.ArrayList;

public class Etudiant {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String mail;
    private String adresse;
    private ArrayList<Note> ListeNotes= new ArrayList<>();



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

    public void note(Matiere Mat, float note){
        Note note1;
        note1= new Note(note,Mat);
        ListeNotes.add(note1);

    }
    public float calculerMoyenne() {
        float somme = 0;
        float diviseur = 0;
        if (ListeNotes.size() == 0) {
            return (0);
        }
        for (int i = 0; i < ListeNotes.size(); i++) {
            somme += ListeNotes.get(i).getNote() * ListeNotes.get(i).getMat().getCoeff();
            diviseur += ListeNotes.get(i).getMat().getCoeff();

        }
        if (diviseur != 0) {
            somme = somme / diviseur;

        }
        return somme;
    }
}
