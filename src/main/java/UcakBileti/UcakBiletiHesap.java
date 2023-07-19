package UcakBileti;

import java.util.Scanner;

public class UcakBiletiHesap {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Sabit değerleri final değişkenler olarak tanımladık
        final double KM_BASI_UCRET = 0.10;
        final double COCUK_INDIRIMI = 0.5;
        final double GENCLIK_INDIRIMI = 0.9;
        final double YASLI_INDIRIMI = 0.7;
        final double GIDIS_DONUS_INDIRIMI = 0.8;

        System.out.println("Lütfen gitmek istediginiz mesafeyi km cinsinden giriniz:");
        double mesafe = scan.nextDouble();

        System.out.println("Lütfen Yaşınızı Giriniz:");
        double yolcuYasi = scan.nextDouble();

        System.out.println("Yolculuk Tipini Giriniz: \n1)Tek Yön \n2)Gidiş Dönüş");
        int yolculukTipi = scan.nextByte();

        double biletFiyati;

        if (mesafe < 0) System.out.println("Hatalı mesafe girişi yaptınız.Lütfen 0'dan büyük değer giriniz.");
        else {

            switch (yolculukTipi) {

                case 1:

                    // Ternary operatörü kullandık
                    System.out.println(yolcuYasi < 0 || yolcuYasi > 120 ? "Hatalı yaş verisi girdiniz. 0-120 arasında değer giriniz" : "");

                    // Tekrar eden hesaplamayı bir değişkene atadık
                    biletFiyati = mesafe * KM_BASI_UCRET;

                    // İndirim oranlarını final değişkenler olarak kullandık
                    if (yolcuYasi >= 0 && yolcuYasi < 12) {
                        biletFiyati *= COCUK_INDIRIMI;
                    } else if (yolcuYasi <= 24) {
                        biletFiyati *= GENCLIK_INDIRIMI;
                    } else if (yolcuYasi >= 65 && yolcuYasi <= 120) {
                        biletFiyati *= YASLI_INDIRIMI;
                    }

                    System.out.println("Tek Yön Bilet Fiyatı: " + biletFiyati);

                    break;

                case 2:

                    // Ternary operatörü kullandık
                    System.out.println(yolcuYasi < 0 || yolcuYasi > 120 ? "Hatalı yaş verisi girdiniz. 0-120 arasında değer girilebilir" : "");

                    // Tekrar eden hesaplamayı bir değişkene atadık
                    biletFiyati = mesafe * KM_BASI_UCRET;

                    // İndirim oranlarını final değişkenler olarak kullandık
                    if (yolcuYasi >= 0 && yolcuYasi < 12) {
                        biletFiyati *= COCUK_INDIRIMI;
                    } else if (yolcuYasi <= 24) {
                        biletFiyati *= GENCLIK_INDIRIMI;
                    } else if (yolcuYasi >= 65 && yolcuYasi <= 120) {
                        biletFiyati *= YASLI_INDIRIMI;
                    }

                    // Gidiş dönüş indirimini final değişken olarak kullandık
                    biletFiyati *= GIDIS_DONUS_INDIRIMI * 2;

                    System.out.println("Gidiş Dönüş Bilet Fiyatı: " + biletFiyati + "\nİndirim Uygulanmıştır.");

                    break;

                default:
                    System.out.println("Hatalı Veri Girişi Yaptınız.");
            }
        }
    }
}
