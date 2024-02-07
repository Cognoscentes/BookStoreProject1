import java.util.ArrayList;
import java.util.Scanner;

class OnlineKitapMagazasi {
    private ArrayList<Kitap> kitapListesi = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private Scanner scannerInt = new Scanner(System.in);

    public void kitapEkle() {

        System.out.print("kitap adı giriniz: ");
        String kitapAdi = scanner.nextLine();
        System.out.print("yazar adı giriniz: ");
        String yazarAdi = scanner.nextLine();
        System.out.print("Yayın yılı giriniz: ");
        int yayinYili = scannerInt.nextInt();
        System.out.print("fiyat bilgisi giriniz: ");
        double fiyat = scannerInt.nextInt();

        Kitap k = new Kitap(kitapAdi, yazarAdi, yayinYili, fiyat);
        kitapListesi.add(k);

        // TODO: kitapEkle() methodunu doldurunuz
        // Kullanıcıdan Kitap Adı, Yazar Adı, Yayın Yılı (int) ve Fiyat (double) bilgisini alarak,
        // itapListesine ekleyen metodu yazınız.
        // NOT: Kullanıcıdan aldığınız bilgilerle bir kitap nesnesi oluşturmayı unutmayınız.

    }

    //////////////////////////////////////////////////
    public void kitapSil() {

        System.out.print("Silmek istediğiniz kitabın numarasını girin: ");
        int silinenKtpId = scanner.nextInt();
        boolean varMi = false;
        for (Kitap k : kitapListesi) {
            if (k.getId() == silinenKtpId) {
                kitapListesi.remove(k);
                System.out.println("kitap başarıyla silindi");
                varMi = true;
                break;
            }
        }
        if (!varMi) {
            System.out.println("belirtilen numarada bir kitap bulunamadı");
        }

        // TODO: kitapSil() methodunu doldurunuz
        // Kullanıcıdan unique (yegane) kitap numarasını alarak, kitap listesinden çıkaran metodu yazınız.
        // NOT: Silinecek kitabın listede olup olmadığını kontrol etmeyi unutmayınız.
        // İşlemin sonucunu konsola yazdırınız: "Kitap başarıyla silindi." veya "Belirtilen numarada bir kitap bulunamadı." gibi...


    }

    //////////////////////////////////////////////////
    public void kitapListele() {

        if (kitapListesi.isEmpty()) {
            System.out.println("Henüz kitap eklenmemiş.");
        } else {
            for (Kitap k : kitapListesi) {
                System.out.println("kitap listesi= " + k);
            }
        }

        // TODO: kitapListele() methodunu doldurunuz
        // Lİstede bulunan kitapları listeleyen metodu yazınız...
        // Listede kitap yoksa konsola "Henüz kitap eklenmemiş." veya "Listede kitap yok" mesajı yazdırınız.


    }
}
