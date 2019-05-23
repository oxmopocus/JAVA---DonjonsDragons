public class Arme {
    Armes nomArme;
    int niveauAttaque;

    public Arme(Armes nomArme, int niveauAttaque){
        this.nomArme = nomArme;
        this.niveauAttaque = niveauAttaque;
    }

    // ************************* ACCESSEURS ************************* //

    public Armes getNomArme() {
        return nomArme;
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }
    // ************************* MUTATEURS ************************* //

    public void setNomArme() {
        this.nomArme = nomArme;
    }

    public void setNiveauAttaque() {
        this.niveauAttaque = niveauAttaque;
    }


}
