class Legemiddel {
    /*
    Legemiddel er superklassen til LegemiddalA, LegemiddelB og LegemiddelC.
    */
    protected static int idTeller = 0;
    protected int id;
    protected String navnLegemiddel;
    protected double prisLegemiddel;
    protected double virkestoffLegemiddel;

    public Legemiddel(String navn, double pris, double virkestoff) {
        navnLegemiddel = navn;
        prisLegemiddel = pris;
        virkestoffLegemiddel = virkestoff;
        id = idTeller;
        idTeller += 1;
    }

    public int hentId() {
        return id;
    }

    public String hentNavn() {
        return navnLegemiddel;
    }

    public double hentPris() {
        return prisLegemiddel;
    }

    public double hentVirkestoff() {
        return virkestoffLegemiddel;
    }

    public void nyPris(int nyPris) {
        prisLegemiddel = nyPris;
    }

    public String toString() {
        return "Navn paa legemiddel: " + navnLegemiddel + "\nLegemiddel-ID: " + id + "\nPris: " + 
        prisLegemiddel + "\nVirkestoff (mg): " + virkestoffLegemiddel + "\n";
    }
    
}