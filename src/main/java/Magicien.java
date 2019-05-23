public class Magicien extends Personnage{
    private String philtre;

    public Magicien(String pNom, String pImage, int pVie, int pForce, String mPhiltre){
        super(pNom,pImage,pVie,pForce);
        this.philtre = mPhiltre;
    }

    // ************************* ACCESSEURS ************************* //

    public String getPhiltre(){
        return philtre;
    }
    // ************************* MUTATEURS ************************* //

    public void setPhiltre(){
        this.philtre = philtre;
    }
}
