class Fastlege extends Lege implements Kommuneavtale {
    int avtalenummer;

    public Fastlege(String navn, int avtalenr) {
        super(navn);
        avtalenummer = avtalenr;
    }

    public int hentAvtalenummer() {
        return avtalenummer;
    }

    public String toString() {
        return super.toString() + "Avtalenummer: " + avtalenummer + "\n";
    }
}