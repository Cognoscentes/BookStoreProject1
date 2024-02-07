import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        // TODO:  main methodunu doldurunuz

        //  Kullanıcıya menü seçeneklerini göstererek bir seçim yapmasını isteyin;
        //  yapılan seçime göre ilgili menüye (OnlineKitapMagazasi sınıfında oluşturduğunuz metodlara) yönlendirin.
        //  NOT: OnlineKitapMagazasi'nın metodlarını kullanabilmek için, nesnesini oluşturmamız şart.
        //  Sadece static metodların nesne oluşturmadan kullanılabildiğini unutmayın!

        OnlineKitapMagazasi kitapMagazasi=new OnlineKitapMagazasi();

        Scanner scanner = new Scanner(System.in);

        int secim;

        do {
            // Kullanıcı bir seçenek belirlediğinde, ilgili işlemi gerçekleştirmek için uygun methodları çağırın.
            // Programın sürekli çalışmasını sağlayın, yani kullanıcı çıkış seçeneğini seçene kadar program çalışmaya devam etmelidir.
            // Müşteri farklı bir seçenek seçtiğinde "Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin." mesajı almalıdır.
            System.out.println("============ Online Kitap Mağazası ============");

            System.out.println("\n1. Kitap Ekle" +
                    "\n2. Numarasıyla Kitap Sil" +
                    "\n3. Tüm Kitapları Listele" +
                    "\n0. Çıkış");
            System.out.print("Seçiminizi yapınız: ");

            secim=scanner.nextInt();

            switch (secim) {
                case 1:
                    kitapMagazasi.kitapEkle();
                    break;

                case 2:
                    kitapMagazasi.kitapSil();
                    break;

                case 3:
                    kitapMagazasi.kitapListele();
                    break;

                case 0:
                    System.out.println("Program sonlandırılıyor.");

                default:
                    System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.\n");
            }
        } while (secim != 0);
    }
}

