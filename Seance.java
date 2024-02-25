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
        System.out.println("\t\tSaisie des infos sur la seance");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);

        System.out.print("\t\t Entrer le numero de seance:");
        this.num = scanner.nextInt();

        System.out.print("\t\t Entrer le temps debut de seance:");
        this.timeDebut = scanner.next();

        System.out.print("\t\t Entrer le temps fin de seance:");
        this.timeFin = scanner.next();

        System.out.print("\t\t Entrer la date de seance:");
        this.date = scanner.next();

        System.out.print("\t\t Entrer le tarif de seance:");
        this.tarif = scanner.nextInt();

        this.place_disponible = cap;

        this.film = new film();
       
        System.out.println("\t\t**********************************");
    }

    void consulter_seance(int n)
    {
        System.out.println("\t\tAffichage des infos sur la seance :"+n+1);
        System.out.println("");
        System.out.println("\t\t le numero de la seance est "+this.num);
        System.out.println("\t\t l'heure debut est "+this.timeDebut);
        System.out.println("\t\t l'heure fin est "+this.timeFin);
        System.out.println("\t\t la date de la seanc est "+this.date);
        System.out.println("\t\t le tarif est "+this.tarif);
        System.out.println("\t\t le nombre de places disponibles est "+this.place_disponible);
        this.film.consulter_film();
    }
}
