//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Araba_mine araba1 = new Araba_mine();
        araba1.setMarka("Skoda");
        araba1.setModel("Octavia");
        araba1.setOtomatikMi(true);
        araba1.setRenk("White");
        araba1.setSasiNo("H675EKRJ9384");
        Araba_mine araba2 = new Araba_mine("BMW", "iX3", "JSDME3942KDNW");
        araba2.setRenk("Blue");
        Araba_mine araba3 = new Araba_mine("Nissan", "QASHQAI", "HDKSNEK39029DN");
        Araba_mine araba4 = new Araba_mine("Dodge", "Charger", "SKDNLFN3324KND");
        Araba_mine araba5 = new Araba_mine("KIA", "Picanto", "SDKFMSAN5435DSD");
        Araba_mine araba6 = new Araba_mine("Bmw","M5","JSKNDE0937KBD");
        Araba_mine araba7 = new Araba_mine("Chevrolet","Aveo","KSNDF9394KDN");
        Araba_mine araba8 = new Araba_mine("Jaguar","F-PACE","JDBSJ293739JBD");
        Araba_mine araba9 = new Araba_mine("Isuzu","D-Max","KSPWLSN2836KDB");
        Araba_mine araba10 = new Araba_mine("Hyundai","IQNIQ 3","KDSKNLFNK3409SK");
        Araba_mine araba11 = new Araba_mine("Nissan","Juke","POESUNE9283KDN");
        System.out.println(araba1 + "\n" + araba2 + "\n" + araba3 + "\n" + araba4 + "\n" + araba5);
        Insan_mine insan1 = new Insan_mine("Mine", "Ay", "90845739092");
        Insan_mine insan2 = new Insan_mine("Alper", "Kartal", "63726865349");
        Insan_mine insan3 = new Insan_mine("Selma", "Sezgin", "90949512847");
        Insan_mine insan4 = new Insan_mine("Mert", "Dertli", "45483487764");
        Insan_mine insan5 = new Insan_mine();
        Insan_mine galeri = new Insan_mine();
        insan5.setAd("Feyza");
        insan5.setSoyAd("Kural");
        insan5.setTcNo("89456347654");

        insan1.setAraba(araba1);
        insan2.setAraba(araba2);
        insan2.setAraba(araba3);
        insan4.setAraba(araba4);
        galeri.setAraba(araba6);
        galeri.setAraba(araba7);
        galeri.setAraba(araba8);
        galeri.setAraba(araba9);
        galeri.setAraba(araba10);
        galeri.setAraba(araba11);
        insan5.setAraba(araba4); // calismaz cünkü sahibi var .
        insan5.setAraba(araba5);
        insan2.arabaSat(araba2, insan4);
        galeri.arabaSat(araba10,insan3);
        galeri.arabaSat(araba9,insan3);
        galeri.arabaSat(araba8,insan2);
        System.out.println(insan2.getArabaSayisi());
        System.out.println(insan1+"\n"+insan2+"\n"+insan3+"\n"+insan4+"\n"+insan5);

    }
}