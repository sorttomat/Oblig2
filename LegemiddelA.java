class LegemiddelA extends Legemiddel {
    protected int styrkeLegemiddel;

    public LegemiddelA(String navn, double pris, double virkestoff, int styrke) {
        super(navn, pris, virkestoff);
        styrkeLegemiddel = styrke;
    }

    public int henNtarkotiskStyrke() {
        return styrkeLegemiddel;
    }

    public String toString() {
        return super.toString() + "Styrke: " + styrkeLegemiddel + "\n";
    }
}