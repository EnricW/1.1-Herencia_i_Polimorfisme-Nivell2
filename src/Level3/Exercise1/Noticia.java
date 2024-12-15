package Level3.Exercise1;

public abstract class Noticia {
    private String titular;
    private String text;
    private int puntuacio;

    public Noticia(String titular) {
        this.titular = titular;
        this.text = "";
    }

    public String getTitular() {
        return titular;
    }

    public void setText(String text) {
        this.text = text;
    }

    public abstract double calcularPreuNoticia();
    public abstract int calcularPuntuacio();
}
