package fr.umontpellier.iut.exo2;

public class Note {
    private float note;
    private Matiere Mat;

    public Note(float note, Matiere mat) {
        this.note = note;
        this.Mat = mat;
    }

    public float getNote() {
        return note;
    }

    public Matiere getMat() {
        return Mat;
    }
}
