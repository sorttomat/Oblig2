class ReseptHvit extends Resept {
    /*
    ReseptHvit er subklassen til Resept, og superklassen til PResept og MilitaerResept.
    */

    public ReseptHvit(Legemiddel legem, Lege utskrLege, int pasId, int rt) {
        super(legem, utskrLege, pasId, rt);
    }

    public String farge() {
        return "hvit";
    }

    public double prisAaBetale() {
        return super.hentLegemiddel().hentPris();
    }

    public String toString() {
        return "Type resept: " + farge() + "\n" + super.toString() + "Pris aa betale: " + prisAaBetale() + "\n";
    }
}