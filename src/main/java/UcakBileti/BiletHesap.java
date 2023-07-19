package UcakBileti;

        /* Uçak Bileti Fiyatı Hesaplayan Program
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara
göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */

        import java.util.Scanner;

        public class BiletHesap {
            public static void main(String[] args) {

                Scanner scan=new Scanner(System.in);

                System.out.println("Lütfen gitmek istediginiz mesafeyi km cinsinden giriniz:");
                double km= scan.nextDouble();

                System.out.println("Lütfen Yaşınızı Giriniz:");
                double yas= scan.nextDouble();

                System.out.println("Yolculuk Tipini Giriniz: \n1)Tek Yön \n2)Gidiş Dönüş");
                int yolculukTipi=scan.nextByte();

                double tutar;

                if (km<0) System.out.println("Hatalı mesafe girişi yaptınız.Lütfen 0'dan büyük değer giriniz. ");
                else {

                    switch (yolculukTipi) {

                        case 1:

                            if (yas < 0 || yas > 120)
                                System.out.println("Hatalı yaş verisi girdiniz. 0-120 arasında değer giriniz");

                            else if (yas >= 0 && yas < 12) {

                                tutar = (km * 0.10) * 0.5;
                                System.out.println("Tek Yön Bilet Fiyatı: " + tutar );

                            } else if (yas <= 24) {

                                tutar = (km * 0.10) * 0.9;
                                System.out.println("Tek Yön Bilet Fiyatı: " + tutar );

                            } else if (yas >= 65 && yas <= 120) {

                                tutar = (km * 0.10) * 0.7;
                                System.out.println("Tek Yön Bilet Fiyatı: " + tutar);

                            } else {
                                tutar = (km * 0.10);
                                System.out.println("Tek Yön Bilet Fiyatı: " + tutar);
                            }
                            break;

                        case 2:

                            if (yas < 0 || yas > 120)
                                System.out.println("Hatalı yaş verisi girdiniz. 0-120 arasında değer girilebilir");

                            else if (yas >= 0 && yas < 12) {
                                tutar = (((km * 0.10) * 0.5) * 0.8) * 2;
                                System.out.println("Gidiş Dönüş Bilet Fiyatı: " + tutar + "\nİndirim Uygulanmıştır.");

                            } else if (yas <= 24) {
                                tutar = (((km * 0.10) * 0.9) * 0.8) * 2;
                                System.out.println("Gidiş Dönüş Bilet Fiyatı: " + tutar + "\nİndirim Uygulanmıştır.");

                            } else if (yas >= 65 && yas <= 120) {
                                tutar = (((km * 0.10) * 0.7) * 0.8) * 2;
                                System.out.println("Gidiş Dönüş Bilet Fiyatı: " + tutar + "\nİndirim Uygulanmıştır.");

                            } else {
                                tutar = ((km * 0.10) * 0.8) * 2;
                                System.out.println("Gidiş Dönüş Bilet Fiyatı: " + tutar + "\nİndirim Uygulanmıştır.");
                            }

                            break;

                        default:
                            System.out.println("Hatalı Veri Girişi Yaptınız.");
                    } // switch
                } // ilk if else
            } // main
        } // class
