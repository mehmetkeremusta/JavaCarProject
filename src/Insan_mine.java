import java.util.Date ;
public class Insan_mine {
    private String ad;
    private String soyAd;
    private String tcNo;
    private Date dogumTarihi;
    private int arabaSayisi;
    private Araba_mine arabalar[];
    public Insan_mine(){
        arabaSayisi = 0;
        arabalar = new Araba_mine[9];
    }
    public Insan_mine(String ad, String soyAd, String tcNo) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.tcNo = tcNo;
        arabaSayisi = 0;
        arabalar = new Araba_mine[9];
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return this.ad;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getSoyAd() {
        return this.soyAd;
    }
    public void setTcNo(String tcNo){
        this.tcNo = tcNo ;
    }
    public String getTcNo(){
        return this.tcNo;
    }
    public Date getDogumTarihi() {
        return dogumTarihi;
    }
    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public int getArabaSayisi(){return this.arabaSayisi;}

    public String arabalariListele(){
        String tmp = "Merhaba ben "+ this.ad+".";
        if(this.arabaSayisi > 0 ) {
            tmp = tmp + "Arabalarımın bilgileri aşağıdadır.\n";
            int j = 0;
            for (int i = 0; i < arabalar.length; i++) {
                if(arabalar[i] != null) {
                    j ++;
                    tmp = tmp + j + ") " + arabalar[i].getMarka() + " " + arabalar[i].getModel() + "\n";
                }

            }
        }
        return tmp;
    }
    public boolean setAraba(Araba_mine araba){
        if(!araba.IsSahibiVarMi() && arabaSayisi < arabalar.length){
            int i = 0 ;
            while(i < arabalar.length && arabalar[i] != null )
                i++;
            arabalar[i]= araba;
            arabaSayisi++;
            araba.setSahibiVarMi(true);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean arabaSat(Araba_mine theAraba , Insan_mine alici){
        int i = 0 ;
        while(i < arabalar.length && arabalar[i]!= theAraba )
            i++;
        if (i == arabalar.length){
            return false;
        }
        else{
            this.arabaSayisi--;
            arabalar[i] = null;
            theAraba.setSahibiVarMi(false);
            alici.setAraba(theAraba);
            return true;
            }


    }
    public String toString(){
        return arabalariListele();
    }


}