import java.util.Scanner;

public class Salle {
    private int num;
    private int capacite;
    private Seance[] tab_seance;
    private int nbSeance;

    public Salle(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer le numero de salle:");
        this.num = scanner.nextInt();

        System.out.print("Entrer la capacite de salle:");
        this.capacite = scanner.nextInt();

        System.out.print("Entrer le nb des seances :");
        this.nbSeance = scanner.nextInt();

        for(int i=0; i<nbSeance;i++) {
            Seance tmp = new Seance(this.capacite);
            this.tab_seance[i] = tmp;
        }




    };

}
