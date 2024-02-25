import java.util.Scanner;

public class Salle {
    private int num;
    private int capacite;
    private Seance[] tab_seance;
    private int nbSeance;

    public Salle(){
        System.out.println("\tSaisie des infos sur la salle");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);

        System.out.print("\t Entrer le numero de salle:");
        this.num = scanner.nextInt();

        System.out.print("\t Entrer la capacite de salle:");
        this.capacite = scanner.nextInt();

        System.out.print("\t Entrer le nb des seances :");
        this.nbSeance = scanner.nextInt();
        this.tab_seance = new Seance[nbSeance]; 
        for(int i=0; i<nbSeance;i++) {
            Seance tmp = new Seance(this.capacite);
            this.tab_seance[i] = tmp;
        }


        
        System.out.println("\t----------------------------------------------");

    }
    public void consulter_salle(int n)
    {   
        System.out.println("\tAffichage des infos sur la salle :"+n+1);
        System.out.println("");
        System.out.println("\t Le numero de la salle est "+this.num);
        System.out.println("\t la capacite de la salle est "+this.capacite);
        System.out.println("\t le nombre de la seance  de la salle est "+this.nbSeance);
        for (int i=0;i<nbSeance;i++)
        {
            tab_seance[i].consulter_seance(i);
        }
        

    }

}
