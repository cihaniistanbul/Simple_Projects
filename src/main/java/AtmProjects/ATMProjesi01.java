package AtmProjects;

import java.util.Scanner;

public class ATMProjesi {

    /*
    Döngüler ve Karar Mekanizmaları - ATM Projesi
    Java döngüler ile kullanıcının banka hesabını yönetebildiği bir ATM projesi yapıyoruz.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hesapBakiyesi = 1000;
        int girisHakki = 3;
        int sifrem=1234;

        do  {
            System.out.print("Şifrenizi giriniz: ");
            int girilenSifre = scanner.nextInt();

            if (girilenSifre == sifrem) {
                System.out.println("Giriş başarılı!");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçin:");
                System.out.println("1. Hesap Bakiyesi Sorgula");
                System.out.println("2. Para Yatırma");
                System.out.println("3. Para Çekme");
                System.out.println("4. Çıkış");

                int secim = scanner.nextInt();

                switch (secim) {
                    case 1:
                        System.out.println("Hesap Bakiyesi: " + hesapBakiyesi);
                        break;
                    case 2:
                        System.out.print("Yatırmak istediğiniz miktarı girin: ");
                        int miktarYatirma = scanner.nextInt();
                        hesapBakiyesi += miktarYatirma;
                        System.out.println("Yeni Hesap Bakiyesi: " + hesapBakiyesi);
                        break;
                    case 3:
                        System.out.print("Çekmek istediğiniz miktarı girin: ");
                        int miktarCekme = scanner.nextInt();
                        if (miktarCekme > hesapBakiyesi) {
                            System.out.println("Yetersiz bakiye!");
                        } else {
                            hesapBakiyesi -= miktarCekme;
                            System.out.println("Yeni Hesap Bakiyesi: " + hesapBakiyesi);
                        }
                        break;
                    case 4:
                        System.out.println("Çıkış yapılıyor...");
                        System.out.println("tekrar bekleriz");

                        return;

                    default:
                        System.out.println("Geçersiz seçim!");
                        break;
                }
            } else {
                girisHakki--;

                System.out.println("Hatalı şifre! Kalan giriş hakkı: " + girisHakki);

                if (girisHakki == 0) {
                    System.err.println("Hesabınız bloke edildi!");
                }
            }
        }while ((girisHakki > 0));


    }
}
