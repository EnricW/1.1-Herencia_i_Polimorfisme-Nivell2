package Level3.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class Redactor {
    private String nom;
    private String dni;
    private static double sou = 1500.0;
    private List<Noticia> noticies;

    public Redactor(String nom, String dni) {
        this.nom = nom;
        this.dni = dni;
        this.noticies = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getDni() {
        return dni;
    }

    public List<Noticia> getNoticies() {
        return noticies;
    }

    public void afegirNoticia(Noticia noticia) {
        noticies.add(noticia);
    }

    public void eliminarNoticia(String titular) {
        noticies.removeIf(n -> n.getTitular().equals(titular));
    }

    public static double getSou() {
        return sou;
    }

    public static void incrementarSou(double increment) {
        sou += increment;
    }
}
