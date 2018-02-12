class ReseptBlaa extends Resept {
    public ReseptBlaa(Legemiddel legem, Lege utskrLege, int pasId, int rt) {
        super(legem, utskrLege, pasId, rt);
    }

    public String farge() {
        return "blaa";
    }

    private double avslag(double pris) {
        return (pris * 25)/100.0;
    }

    public double prisAaBetale() {
        double fullPris = super.hentLegemiddel().hentPris();
        return avslag(fullPris);
    }

    public String toString() {
        return "Type resept: " + farge() + "\n" + super.toString() + "Pris aa betale: " + prisAaBetale() + "\n";
    }


}