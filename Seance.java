import java.util.Random;
import java.util.Scanner;

public class Seance {
    private int num;
    private String timeDebut;
    private String timeFin;
    ;
    private String date;
    private int tarif;
    private film film;
    private int place_disponible ;

    public Seance(int cap) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer le numero de seance:");
        this.num = scanner.nextInt();

        System.out.print("Entrer le temps debut de seance:");
        this.timeDebut = scanner.next();

        System.out.print("Entrer le temps fin de seance:");
        this.timeFin = scanner.next();

        System.out.print("Entrer la date de seance:");
        this.date = scanner.next();

        System.out.print("Entrer le tarif de seance:");
        this.tarif = scanner.nextInt();

        this.place_disponible = cap;

        this.film = new film();
    }
}
