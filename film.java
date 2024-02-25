import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class film {
    private String titre;
    private String realisateur;
    private String Synopsis;
    private String[] actor;

    private String dateCreation;
    public static LocalDate getRandomDate(LocalDate startDate, LocalDate endDate) {
        Random random = new Random();
        long startEpochDay = startDate.toEpochDay();
        long endEpochDay = endDate.toEpochDay();
        long randomEpochDay = startEpochDay + random.nextInt((int) (endEpochDay - startEpochDay));
        return LocalDate.ofEpochDay(randomEpochDay);
    }

    public film() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer le nom du film:");
        this.titre = scanner.next();

        System.out.print("Entrer le nom du realisateur:");
        this.realisateur = scanner.next();

        System.out.print("Entrer le nb des acteurs du film:");
        int nb = scanner.nextInt();

        for(int i=0;i<nb;i++) {
            System.out.print("Entrer le nom du acteur:");
            this.actor[i] = scanner.next();
        }

        System.out.print("Entrer un synopsis:");
        this.Synopsis = scanner.next();

        System.out.print("Entrer la date de creation:");
        this.dateCreation = scanner.next();
    }
}
