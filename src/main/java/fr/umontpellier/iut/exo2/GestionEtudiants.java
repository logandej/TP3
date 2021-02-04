package fr.umontpellier.iut.exo2;
import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiants {
    public static void main(String[] args) {
        Etudiant lolo, toto, Quentin, Loïc;
        Departement monDepInfo;
        monDepInfo = new Departement("Informatique","3 rue de la paix");

        LocalDate maDate = LocalDate.of(2002, Month.OCTOBER, 3);
        lolo= new Etudiant ("dejesus","logan",maDate,"logan.dejesus1@gmail.com","1 impasse belle viste 34160");
        toto= new Etudiant ("dejesus","surnom",maDate,"logan.dejesus1@gmail.com","1 impasse belle viste 34160");
        Quentin= new Etudiant ("Arzalier","Quentin",maDate,"quentin.arzalier@gmail.com","saint mathieu de tréviers");
        Loïc= new Etudiant ("Gestin","Loïc",maDate,"Loïc@gmail.com","A coté du departement informatique");


        monDepInfo.inscrire(lolo);
        monDepInfo.inscrire(toto);
        monDepInfo.inscrire(Quentin);
        monDepInfo.inscrire(Loïc);

        System.out.println(monDepInfo.toString());
        System.out.println("desinscription");

        monDepInfo.desinscrire(toto);
        monDepInfo.desinscrire(Quentin);

        System.out.println(monDepInfo.toString());

        if (lolo==toto){
            System.out.println("yep");
        }
        else { System.out.println("noo"); }









    }
}
