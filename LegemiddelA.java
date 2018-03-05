class LegemiddelA extends Legemiddel {
    /*
    LegemiddelA er subklassen til Legemiddel.
    */
    private int styrkeLegemiddel;

    public LegemiddelA(String navn, double pris, double virkestoff, int styrke) {
        super(navn, pris, virkestoff);
        styrkeLegemiddel = styrke;
    }

    public int hentNarkotiskStyrke() {
        return styrkeLegemiddel;
    }

    public String toString() {
        return super.toString() + "Styrke: " + hentNarkotiskStyrke() + "\n";
    }
}