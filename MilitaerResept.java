class MilitaerResept extends ReseptHvit {

   public MilitaerResept(Legemiddel legem, Lege utskrLege, int pasId, int rt) {
       super(legem, utskrLege, pasId, rt);
   }

   public double prisAaBetale() {
       return 0.0;
   }

   public String toString() {
       return super.toString();
   }


}