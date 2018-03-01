class Lege {
    /*
    Lege er superklassen til Fastlege.
    */
    String navnLege;

    public Lege(String navn) {
        navnLege = navn;
    }

    public String hentNavn() {
        return navnLege;
    }

    public String toString() {
        return "Navn paa lege: " + navnLege + "\n";
    }
}