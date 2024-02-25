import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class film {
    private String titre;
    private String realisateur;
    private String Synopsis;
    private int nb_actor;
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
        System.out.println("\t\t\tSaisie des infos sur le film");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);

        System.out.print("\t\t\t Entrer le nom du film:");
        this.titre = scanner.next();

        System.out.print("\t\t\t Entrer le nom du realisateur:");
        this.realisateur = scanner.next();

        System.out.print("\t\t\t Entrer le nb des acteurs du film:");
         this.nb_actor = scanner.nextInt();


         this.actor = new String[nb_actor]; // Initialise le tableau avec la bonne taille
         for(int i=0;i<this.nb_actor;i++) {
             System.out.print("\t\t\t Entrer le nom du acteur:");
             String temp=scanner.next();
             this.actor[i] =temp;
           
         }

  

        System.out.print("\t\t\t Entrer un synopsis:");
        this.Synopsis = scanner.next();

        System.out.print("\t\t\t Entrer la date de creation:");
        this.dateCreation = scanner.next();
       
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$");
    }
    public void consulter_film()
    {   System.out.println("\t\t\tAffichage des infos sur le film");
        System.out.println("");
        System.out.println("\t\t\t Affichage des infos sur le film ");
        System.out.println("\t\t\t le titre du film est debut est "+this.titre);
        System.out.println("\t\t\t le realisateur est "+this.realisateur);
        System.out.println("\t\t\t la date de creation est "+this.dateCreation);
        for (int i=0;i<actor.length;i++)
        {
            System.out.println("\t\t\t l'acteur  "+i+ " est : "+this.actor[i]); 
        }
        System.out.println("\t\t\t le resume est "+this.Synopsis);
    }
}
