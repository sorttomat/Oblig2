class LegemiddelB extends Legemiddel {
   protected int hvorVanedannende;

   public LegemiddelB(String navn, double pris, double virkestoff, int vanedannende) {
       super(navn, pris, virkestoff);
       hvorVanedannende = vanedannende;
   }

   public int hentVanedannendeStyrke() {
       return hvorVanedannende;
   }

   public String toString() {
       return super.toString() + "Vanedannende: " + hvorVanedannende + "\n";
   }
}