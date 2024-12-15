package Level3.Exercise1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private Map<String, Redactor> redactors = new HashMap<>();

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcio;
        do {
            System.out.println("\nMenú principal:");
            System.out.println("1. Introduir redactor");
            System.out.println("2. Eliminar redactor");
            System.out.println("3. Introduir notícia a un redactor");
            System.out.println("4. Eliminar notícia");
            System.out.println("5. Mostrar totes les notícies per redactor");
            System.out.println("6. Calcular puntuació de la notícia");
            System.out.println("7. Calcular preu-notícia");
            System.out.println("0. Sortir");
            opcio = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (opcio) {
                case 1:
                    introduirRedactor(scanner);
                    break;
                case 2:
                    eliminarRedactor(scanner);
                    break;
                case 3:
                    introduirNoticia(scanner);
                    break;
                case 4:
                    eliminarNoticia(scanner);
                    break;
                case 5:
                    mostrarNoticies(scanner);
                    break;
                case 6:
                    calcularPuntuacio(scanner);
                    break;
                case 7:
                    calcularPreu(scanner);
                    break;
                case 0:
                    System.out.println("Sortint del programa...");
                    break;
                default:
                    System.out.println("Opció no vàlida.");
            }
        } while (opcio != 0);
    }

    private void introduirRedactor(Scanner scanner) {
        System.out.print("Nom del redactor: ");
        String nom = scanner.nextLine();
        System.out.print("DNI del redactor: ");
        String dni = scanner.nextLine();
        redactors.put(dni, new Redactor(nom, dni));
        System.out.println("Redactor afegit amb èxit.");
    }

    private void eliminarRedactor(Scanner scanner) {
        System.out.print("DNI del redactor a eliminar: ");
        String dni = scanner.nextLine();
        if (redactors.remove(dni) != null) {
            System.out.println("Redactor eliminat.");
        } else {
            System.out.println("Redactor no trobat.");
        }
    }

    private void introduirNoticia(Scanner scanner) {
        System.out.print("DNI del redactor: ");
        String dni = scanner.nextLine();
        Redactor redactor = redactors.get(dni);
        if (redactor == null) {
            System.out.println("Redactor no trobat.");
            return;
        }
        System.out.print("Titular de la notícia: ");
        String titular = scanner.nextLine();
        System.out.println("Tipus de notícia (futbol, bàsquet, tenis, F1, motociclisme): ");
        String tipus = scanner.nextLine();

        switch (tipus.toLowerCase()) {
            case "futbol":
                System.out.print("Competició: ");
                String competicioF = scanner.nextLine();
                System.out.print("Club: ");
                String clubF = scanner.nextLine();
                System.out.print("Jugador: ");
                String jugadorF = scanner.nextLine();
                redactor.afegirNoticia(new NoticiaFutbol(titular, competicioF, clubF, jugadorF));
                break;
            // Handle other types similarly
            default:
                System.out.println("Tipus de notícia no vàlid.");
        }
    }

    private void eliminarNoticia(Scanner scanner) {
        System.out.print("DNI del redactor: ");
        String dni = scanner.nextLine();
        Redactor redactor = redactors.get(dni);
        if (redactor == null) {
            System.out.println("Redactor no trobat.");
            return;
        }
        System.out.print("Titular de la notícia: ");
        String titular = scanner.nextLine();
        redactor.eliminarNoticia(titular);
        System.out.println("Notícia eliminada.");
    }

    private void mostrarNoticies(Scanner scanner) {
        System.out.print("DNI del redactor: ");
        String dni = scanner.nextLine();
        Redactor redactor = redactors.get(dni);
        if (redactor == null) {
            System.out.println("Redactor no trobat.");
            return;
        }
        System.out.println("Notícies del redactor " + redactor.getNom() + ":");
        for (Noticia noticia : redactor.getNoticies()) {
            System.out.println("- " + noticia.getTitular());
        }
    }

    private void calcularPuntuacio(Scanner scanner) {
        System.out.print("DNI del redactor: ");
        String dni = scanner.nextLine();
        Redactor redactor = redactors.get(dni);
        if (redactor == null) {
            System.out.println("Redactor no trobat.");
            return;
        }
        System.out.print("Titular de la notícia: ");
        String titular = scanner.nextLine();
        for (Noticia noticia : redactor.getNoticies()) {
            if (noticia.getTitular().equals(titular)) {
                System.out.println("Puntuació: " + noticia.calcularPuntuacio());
                return;
            }
        }
        System.out.println("Notícia no trobada.");
    }

    private void calcularPreu(Scanner scanner) {
        System.out.print("DNI del redactor: ");
        String dni = scanner.nextLine();
        Redactor redactor = redactors.get(dni);
        if (redactor == null) {
            System.out.println("Redactor no trobat.");
            return;
        }
        System.out.print("Titular de la notícia: ");
        String titular = scanner.nextLine();
        for (Noticia noticia : redactor.getNoticies()) {
            if (noticia.getTitular().equals(titular)) {
                System.out.println("Preu: " + noticia.calcularPreuNoticia());
                return;
            }
        }
        System.out.println("Notícia no trobada.");
    }
}
