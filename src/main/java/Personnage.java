
public class Personnage {
    //Attributs
    //Stocke le nom du perso
    private String nom;
    //Stocke l'image du perso
    private String image;
    //Stocke la vie du perso
    private int vie;
    //Stocke la force du perso
    private int force;

    public Personnage() {

    }

    public Personnage(String pNom, String pImage, int pVie, int pForce) {
        this.nom = pNom;
        this.image = pImage;
        this.vie = pVie;
        this.force = pForce;
    }

    @Override
    public String toString() {
        return "Personnage : \n"
                + "classe : " + this.getClass().getSimpleName() + "\n"
                +"nom : " + this.nom + " \n"
                + "force : " + this.force + "\n"
                + "vie : " + this.vie + "\n";
    }


    // ************************* ACCESSEURS ************************* //
    public String getNom() {
        return nom;
    }

    public String getImage() {
        return image;
    }

    public int getVie() {
        return vie;
    }

    public int getForce() {
        return force;
    }
    // ************************* MUTATEURS ************************* //

    public void setNom(String pNom) {
        this.nom = pNom;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public void setForce(int force) {
        this.force = force;
    }
}



