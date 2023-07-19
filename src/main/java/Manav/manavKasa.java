package Manav;

import java.time.LocalDate;
import java.util.Scanner;
public class manavKasa {
    public static void main(String[]args){
        double  armut=2.14,
                elma=3.67,
                domates=1.11,
                muz=0.95,
                badilcan=5;

        double  armutKilo,
                elmaKilo,
                domatesKilo,
                muzKilo,
                badilcanKilo;

        Scanner inp=new Scanner(System.in);
        System.out.println("Kaç kg Armut almak istiyorsunuz ?:");
        armutKilo= inp.nextDouble();

        System.out.println("Kaç kg Elma almak istiyorsunuz ?:");
        elmaKilo= inp.nextDouble();

        System.out.println("Kaç kg Domat almak istiyorsunuz ?:");
        domatesKilo= inp.nextDouble();

        System.out.println("Kaç kg Muz almak istiyorsunuz ?:");
        muzKilo= inp.nextDouble();

        System.out.println("Kaç kg Badılcan almak istiyorsunuz ?:");
        badilcanKilo= inp.nextDouble();

        double toplam;
        toplam=((armutKilo*armut)+(elmaKilo*elma)+(domatesKilo*domates)+(muzKilo*muz)+(badilcanKilo*badilcan));
        System.out.println("Fatura Tutarı :"+toplam);

        LocalDate currentDate = LocalDate.now();
        System.out.println ("Fatura Tarihi :" + currentDate);

    }

}