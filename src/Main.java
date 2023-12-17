import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan mesafe, yaş ve yolculuk tipi bilgilerini alıyoruz
        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        // Veri girişi kontrolü
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            // Normal ücret hesaplama
            double normalTutar = mesafe * 0.10;

            // Yaş indirimi hesaplama
            double yasIndirimOrani = 0;
            if (yas < 12) {
                yasIndirimOrani = 0.50;
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimOrani = 0.10;
            } else if (yas >= 65) {
                yasIndirimOrani = 0.30;
            }

            double yasIndirimi = normalTutar * yasIndirimOrani;

            // İndirimli tutar hesaplama
            double indirimliTutar = normalTutar - yasIndirimi;

            // Gidiş dönüş indirimi hesaplama
            double gedisDonusIndirimi = 0;
            if (yolculukTipi == 2) {
                gedisDonusIndirimi = indirimliTutar * 0.20;
            }

            // Toplam tutar hesaplama
            double toplamTutar = (indirimliTutar - gedisDonusIndirimi) * (yolculukTipi == 2 ? 2 : 1);

            // Sonucu ekrana yazdırma
            System.out.println("Toplam Tutar = " + toplamTutar + " TL");
        }

        // Scanner kapatma
        scanner.close();
    }
}
