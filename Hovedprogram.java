class Hovedprogram {
    public static void main(String[] args) {
        /*
        Dette programmet oppretter minst én instans av hver type objekt, og printer ut
        informasjon om dem ved å kalle paa objektenes toString()-metoder (som jeg 
        har modifisert), dette skjer automatisk naar man bruker System.out.println paa et objekt.
        */
        LegemiddelA legemiddelA = new LegemiddelA("Ibux", 150.0, 200.0, 20);
        LegemiddelB legemiddelB = new LegemiddelB("pPiller", 250.0, 50.0, 31);
        LegemiddelC legemiddelC = new LegemiddelC("Nesespray", 15.50, 20.0);
        LegemiddelA legemiddelA2 = new LegemiddelA("Antibiotika", 300.0, 500.0, 50);

        Lege lege = new Lege("Henrik");
        Fastlege fastlege = new Fastlege("Bernt", 123);
        Lege lege2 = new Lege("Lisa");

        ReseptBlaa reseptBlaa = new ReseptBlaa(legemiddelA, lege, 0, 5);
        PResept pResept = new PResept(legemiddelB, fastlege, 1);
        MilitaerResept mResept = new MilitaerResept(legemiddelC, lege2, 2, 3);
        ReseptHvit hResept = new ReseptHvit(legemiddelA2, fastlege, 10, 4);

        System.out.println();
        System.out.println(reseptBlaa);
        System.out.println();
        System.out.println(pResept);
        System.out.println();
        System.out.println(mResept);
        System.out.println();
        System.out.println(hResept);
    }
}