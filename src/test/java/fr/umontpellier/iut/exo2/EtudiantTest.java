package fr.umontpellier.iut.exo2;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.Month;


import static org.junit.jupiter.api.Assertions.*;

class EtudiantTest {


    private LocalDate maDate = LocalDate.of(2002, Month.OCTOBER, 3);
    private  Etudiant lolo= new Etudiant ("dejesus","logan",maDate,"logan.dejesus1@gmail.com","1 impasse belle viste 34160");


    @Test
    public void test_calculer_moyenne_retourne_0_Quand_Pas_De_Note() {

        assertEquals(0f, lolo.calculerMoyenne() );
    }
    @Test
    public void test_calculer_moyenne_retourne_valeur_note_quand_une_seule_note(){
        Matiere Maths;
        Maths = new Matiere("Maths", 1);

        lolo.note(Maths,13);
        assertEquals(13f, lolo.calculerMoyenne() );

        }
        @Test
    public void test_calculer_moyenne_retourne_valeur_note_pondérée_quand_une_seule_note_avec_coefficient(){
            Matiere Maths;
            Maths = new Matiere("Maths", 2);

            lolo.note(Maths,14);
            assertEquals(14f, lolo.calculerMoyenne() );

        }

    @Test
    public void test_calculer_moyenne_retourne_moyenne_quand_plusieurs_notes_avec_differents_coefficients()
    {
        Matiere Maths, SVT, PPP;
        Maths = new Matiere("Maths", 2);
        SVT = new Matiere("SVT", 4);
        PPP = new Matiere("PPP", 1);

        lolo.note(Maths,15);
        lolo.note(SVT,10);
        lolo.note(PPP,10);
        lolo.note(Maths,20);
        assertEquals(120/9f, lolo.calculerMoyenne() );
    }
}
