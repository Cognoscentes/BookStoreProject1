
class Kitap {

    private String kitapAdi;
    private String yazarAdi;
    private int yayinYili;
    private double fiyat;
    private final int id;
    private static int sayac=1;

    public Kitap(String kitapAdi, String yazarAdi, int yayinYili, double fiyat) {

        setKitapAdi(kitapAdi);
        setYazarAdi(yazarAdi);
        setYayinYili(yayinYili);
        setFiyat(fiyat);
        this.id=sayac++;

    }


    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public int getYayinYili() {
        return yayinYili;
    }

    public void setYayinYili(int yayinYili) {
        this.yayinYili = yayinYili;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public static int getSayac() {
        return sayac;
    }

    public static void setSayac(int sayac) {
        Kitap.sayac = sayac;
    }

    public int getId() {
        return id;
    }



    // TODO: Gerekli olan getter() veya setter() metodlarını oluşturunuz.
    // Kullanılmayanları oluşturmanıza gerek yok.
    // Program tamamlandıktan sonra kullanılmayan metodları sonradan silmek de bir yöntemdir

    @Override
    public String toString() {
        //TODO: Kitabın özelliklerini yazdıracak toString() metodunu tamamlayınız...(Return icini doldurun)

        return  " Kitap id: " + this.id + " " +
                " Kitap Adı: " + this.kitapAdi +
                " Yazar Adı: " + this.yazarAdi +
                " Yayın Yılı: " + this.yayinYili +
                " Fiyat: " + this.fiyat + "₺";
    }
}
