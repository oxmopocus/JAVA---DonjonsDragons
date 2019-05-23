public class Sort {
    Sorts nomSort;
    int niveauAttaque;

    public Sort(Sorts nomSort, int niveauAttaque) {
        this.nomSort = nomSort;
        this.niveauAttaque = niveauAttaque;
    }

    // ************************* ACCESSEURS ************************* //

    public Sorts getNomSort() {
        return nomSort;
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }
    // ************************* MUTATEURS ************************* //

    public void setNomSort() {
        this.nomSort = nomSort;
    }

    public void setNiveauAttaque() {
        this.niveauAttaque = niveauAttaque;
    }
}
