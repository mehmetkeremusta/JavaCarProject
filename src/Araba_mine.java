public class Araba_mine {
    private String marka;
    private String model;
    public String sasiNo;
    private String renk;
    private boolean otomatikMi;
    private boolean sahibiVarMi;
    public Araba_mine (){
        sahibiVarMi = false;

    }
    public Araba_mine ( String marka , String model ,String  sasiNo){
        this.marka = marka;
        this.model = model;
        this.sasiNo = sasiNo;
        sahibiVarMi = false ;
    }
    public void setSahibiVarMi (boolean sahibiVarMı){this.sahibiVarMi = sahibiVarMı;}
    public boolean IsSahibiVarMi (){return this.sahibiVarMi;}

    public void setMarka(String marka ){this.marka = marka;}
    public String getMarka(){return this.marka;}

    public void setModel(String model){this.model = model;}
    public String getModel(){return this.model;}

    public void setSasiNo(String sasiNo){this.sasiNo = sasiNo;}
    public String getSasiNo(){return this.sasiNo;}

    public void setRenk(String renk){this.renk = renk;}
    public String getRenk(){return this.renk;}

    public void setOtomatikMi(boolean otomatikMi){this.otomatikMi = otomatikMi;}
    public boolean isOtomatikMi(){return this.otomatikMi;}

    public String toString(){
        String tmp;
        tmp = "Merhaba ben bir arabayım. ";
        tmp = tmp + " Markam: "+ this.marka + " Modelim: "+this.model ;
    return tmp ;

    }
}
