package Level3.Exercise1;

public class NoticiaFutbol extends Noticia{
    private String competicio;
    private String club;
    private String jugador;

    public NoticiaFutbol(String titular, String competicio, String club, String jugador) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
    }

    @Override
    public double calcularPreuNoticia() {
        double preu = 300;
        if (competicio.equalsIgnoreCase("Lliga de Campions")) preu += 100;
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) preu += 100;
        if (jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) preu += 50;
        return preu;
    }

    @Override
    public int calcularPuntuacio() {
        int punts = 5;
        if (competicio.equalsIgnoreCase("Lliga de Campions")) punts += 3;
        else if (competicio.equalsIgnoreCase("Lliga")) punts += 2;
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) punts += 1;
        if (jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) punts += 1;
        return punts;
    }

    // Similar classes for NoticiaBasquet, NoticiaTenis, NoticiaF1, NoticiaMotociclisme
}
