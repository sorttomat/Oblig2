class Hovedprogram {
    public static void main(String[] args) {
        LegemiddelA legemiddelA = new LegemiddelA("Ibux", 150.0, 200.0, 20);
        LegemiddelB legemiddelB = new LegemiddelB("pPiller", 250.0, 50.0, 31);
        LegemiddelC legemiddelC = new LegemiddelC("Nesespray", 15.50, 20.0);

        Lege lege = new Lege("Henrik");
        Fastlege fastlege = new Fastlege("Bernt", 123);
        Lege lege2 = new Lege("Lisa");

        ReseptBlaa reseptBlaa = new ReseptBlaa(legemiddelA, lege, 0, 5);
        PResept pResept = new PResept(legemiddelB, fastlege, 1);
        MilitaerResept mResept = new MilitaerResept(legemiddelC, lege2, 2, 3);

        System.out.println();
        System.out.println(reseptBlaa);
        System.out.println();
        System.out.println(pResept);
        System.out.println();
        System.out.println(mResept);




    }
}