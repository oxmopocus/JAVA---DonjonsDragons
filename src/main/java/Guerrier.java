public class Guerrier extends Personnage {
    private String bouclier;

    public Guerrier(String pNom, String pImage, int pVie, int pForce, String gBouclier) {
        super(pNom,pImage,pVie,pForce);
        this.bouclier = gBouclier;
    }

    // ************************* ACCESSEURS ************************* //

    public String getBouclier() {
        return bouclier;
    }
    // ************************* MUTATEURS ************************* //

    public void setBouclier() {
        this.bouclier = bouclier;
    }
}


