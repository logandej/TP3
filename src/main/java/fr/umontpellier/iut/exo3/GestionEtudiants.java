package fr.umontpellier.iut.exo3;
import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiants {
    public static void main(String[] args) {
        EtudiantTéléscopique lolo, Logan, Quentin;


        LocalDate maDate = LocalDate.of(2002, Month.OCTOBER, 3);
        lolo= new EtudiantTéléscopique ("dejesus","logan");
        Logan= new EtudiantTéléscopique("dejesus","surnom",maDate);
        Quentin= new EtudiantTéléscopique ("Arzalier","Quentin","quentin.arzalier@gmail.com");

        //EtudiantJavaBeans
        EtudiantJavaBeans toto = new EtudiantJavaBeans();
        toto.setNom("Dupont");
        toto.setDateNaissance(LocalDate.of(2002, Month.JANUARY, 28));
        /* ... */
        toto.setAdresse("99, av. Occitanie, 34000 Montpellier");



        //Etudiants Téléscopiques
        System.out.println(lolo.toString());
        System.out.println(toto.toString());
        System.out.println(Quentin.toString());

        //Etudiant javaBeans
        System.out.println(toto.toString());







    }
}
