package P07_GeometrikHesaplama;

import java.util.InputMismatchException;

import static P07_GeometrikHesaplama.Variables.geometrikSekiller;
import static P07_GeometrikHesaplama.Variables.scan;

public class Kare implements AlanCevreBilgileri{


    @Override
    public void alanVeCevreHesapla() {
        System.out.print(" bir kenar uzunlugu  giriniz: ");
        System.out.println();

        double kisaKenar = 0;
        try {
            kisaKenar = scan.nextDouble();
        } catch (InputMismatchException e) {
            String hataliGiris=scan.nextLine();
            System.out.println("gecersiz karakter. tekrar deneyiniz");
            alanVeCevreHesapla();
        }

        Variables dikdortgen = new Variables(1,1, kisaKenar);
        geometrikSekiller.put("kare", dikdortgen);
        System.out.print("Karenin Alani = " + geometrikSekiller.get("kare").getGenislik()*
                geometrikSekiller.get("kare").getGenislik());
        System.out.println();
        System.out.print("Karenin Cevresi = " + (geometrikSekiller.get("kare").getGenislik()*4));
        System.out.println();
    }


}
