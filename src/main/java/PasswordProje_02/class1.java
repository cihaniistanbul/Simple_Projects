package PasswordProje_02;

import java.util.Scanner;

public class class1 {
    static Scanner  input = new Scanner(System.in);
    public static void main(String[] args) {




        /*
        Java koşullu ifadeler ile kullanıcı adı ve şifreyi kontrol eden program yapımı.
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun
        eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
        şifreler aynı ise ekrana "Eski şifre ile yeni şifre aynı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         */

        String parola="1234";
        String kullaniciadi="qa04";


        System.out.println("Kullanıcı adinızı giriniz");
        String name = input.nextLine();
        System.out.println("Şifrenizi giriniz");
        String password =input.nextLine();

        if (name.equals(kullaniciadi)&& parola.equals(password)){
            System.out.println("Giriş Başarili");

        }else {
            System.out.println("Hatali Giris Yaptiniz,Kullanici adi veya Parola yanliş olabilir");

            System.out.println("Parolayı sifirlamak ister misiniz : E , H");

            String cevap =input.next();
            if (cevap.equalsIgnoreCase("E")) {
                System.out.println("Yeni sifre giriniz");
                String yenisifre= input.next();

                if (yenisifre.equals(parola)){
                    System.out.println("Eski şifre ile yeni şifre aynı, lütfen başka şifre giriniz");

                }else {
                    System.out.println("Şifre oluşturuldu");
                }


            }if (cevap.equalsIgnoreCase("H")){

                System.out.println("İyi günler");

            }

        }

    }

}