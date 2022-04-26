package P07_GeometrikHesaplama;


import java.util.InputMismatchException;

import static P07_GeometrikHesaplama.Variables.geometrikSekiller;
import static P07_GeometrikHesaplama.Variables.scan;

public class Dikdortgen implements AlanCevreBilgileri {

    @Override
    public void alanVeCevreHesapla() {
        System.out.print("uzun kenar  giriniz: ");
        System.out.println();
        double uzunKenar = 0;
        try {
            uzunKenar = scan.nextDouble();
        } catch (InputMismatchException e) {
            String hataliGiris=scan.nextLine();
            System.out.println("gecersiz karakter. tekrar deneyiniz");
            alanVeCevreHesapla();
        }
        System.out.print("kisa kenar  giriniz: ");
        System.out.println();
        double kisaKenar = 0;
        try {
            kisaKenar = scan.nextDouble();


        } catch (InputMismatchException e) {
            String hataliGiris=scan.nextLine();
            System.out.println("gecersiz karakter. tekrar deneyiniz");
            alanVeCevreHesapla();
        }
        Variables dikdortgen = new Variables(1, uzunKenar, kisaKenar);
        geometrikSekiller.put("dikdortgen", dikdortgen);
        System.out.print("Dikdortgenin Alani = " + geometrikSekiller.get("dikdortgen").getUzunKenar() *
                geometrikSekiller.get("dikdortgen").getGenislik()+" cm2");
        System.out.println();
        System.out.print("Dikdortgenin Cevresi = " + ((geometrikSekiller.get("dikdortgen").getUzunKenar() +
                geometrikSekiller.get("dikdortgen").getGenislik() )* 2)+" cm");
        System.out.println();


    }




    }



