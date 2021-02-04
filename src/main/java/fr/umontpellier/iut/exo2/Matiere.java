package fr.umontpellier.iut.exo2;

public class Matiere {
    private String Nom;
    private float Coeff;

    public Matiere(String nom, float coeff) {
        Nom = nom;
        Coeff = coeff;
    }

    @Override
    public String toString() {
        return "Matiere{" +
                "Coeff=" + Coeff +
                '}';
    }

    public float getCoeff() {
        return Coeff;
    }
}
