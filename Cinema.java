public class Cinema {
    private String nom;
    private String adr;
    private Salle[] tab_salle ;
    private int nbSalle ;
    public int[] client_fidele;
    public int[] clients;

    public Cinema(String nom, String adr,int nbsalle) {
        this.nom = nom;
        this.adr = adr;
        this.nbSalle = nbsalle;
        for(int i=0; i<this.nbSalle;i++) {
            Salle temp = new Salle();
            this.tab_salle[i] = temp;
        }
    }
}
