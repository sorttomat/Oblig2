abstract class Resept {
    /*
    Resept er superklassen til ReseptHvit og ReseptBlaa.
    */
    private Legemiddel legemiddel;
    private Lege utskrivendeLege;
    private int pasientId;
    private int reit;
    private static int idTeller = 0;
    private int id;

    protected Resept(Legemiddel legem, Lege utskrLege, int pasId, int rt) {
        legemiddel = legem;
        utskrivendeLege = utskrLege;
        pasientId = pasId;
        reit = rt;
        id = idTeller;
        idTeller += 1;
    }

    public int hentId() {
        return id;
    }

    public Legemiddel hentLegemiddel() {
        return legemiddel;
    }

    public Lege hentLege() {
        return utskrivendeLege;
    }

    public boolean bruk() {
        if (reit > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
        return "Resept-ID: " + id + "\n" + utskrivendeLege.toString() + 
        legemiddel.toString() + "Pasient-ID: " + pasientId + "\n" + "Reit: " + reit + "\n";
    }

    public abstract String farge();

    public abstract  double prisAaBetale();




}