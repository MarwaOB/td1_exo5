import java.util.Scanner;

public class Cinema {
    private String nom;
    private String adr;
    private Salle[] tab_salle ;
    private int nbSalle ;
    public int[] client_fidele;
    public int[] clients;

    public Cinema() {
        System.out.println("Saisie des infos sur le cinema");
        System.out.println("");
        
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Entrer le nom du cinema:");
        this.nom = scanner.next();

        System.out.print(" Entrer l'adresse:");
        this.adr = scanner.next();

        System.out.print(" Entrer le nb des salles :");
        this.nbSalle = scanner.nextInt();
        
        this.tab_salle = new Salle[nbSalle]; 
        for(int i=0; i<this.nbSalle;i++) {
            Salle temp = new Salle();
            this.tab_salle[i] = temp;
        }
    }

    public void Consulter()
    {   System.out.println("Affichage des infos sur le cinema");
        System.out.println("");
        System.out.println("le nom du cinema est "+this.nom);
        System.out.println("l'adresse  est "+this.adr);
        System.out.println("le nombre des salles est "+this.nbSalle);
        for(int i=0;i<this.nbSalle;i++)
        {
            tab_salle[i].consulter_salle(i);
        }
    }
}
