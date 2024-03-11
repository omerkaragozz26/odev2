public class Ogrenci {
    private String ad, bolum, ogrNo;
    private double gano,harcHesapla;
    private int girisYili,bolumKodu,girisSira;


    public Ogrenci(String ad, String bolum,int girisYili,int bolumKodu,int girisSira,double gano) {
        this.ad = ad;
        this.bolum = bolum;
        this.bolumKodu = bolumKodu;
        this.gano = gano;
        this.girisYili=girisYili;
        this.girisSira=girisSira;
        this.ogrNo = noHesapla(this.girisYili,this.bolumKodu,this.girisSira);

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public double getHarcHesapla() {
        return harcHesapla;
    }

    public void setHarcHesapla(double harcHesapla) {
        this.harcHesapla = harcHesapla;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public int getBolumKodu() {
        return bolumKodu;
    }

    public void setBolumKodu(int bolumKodu) {
        this.bolumKodu = bolumKodu;
    }

    public int getGirisSira() {
        return girisSira;
    }

    public void setGirisSira(int girisSira) {
        this.girisSira = girisSira;
    }
    public String noHesapla(int girisYili,int bolumKodu,int girisSira){
    return ""+girisYili+""+bolumKodu+""+girisSira;
    }
    public static double HarcHesapla(int dersSayisi){
        return(dersSayisi*12.4d);
    }
    public static double HarcHesapla(int dersSayisi,int uzatilanYil){
        return(dersSayisi*uzatilanYil*12.4d);
    }



}




