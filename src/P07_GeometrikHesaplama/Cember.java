package P07_GeometrikHesaplama;

import java.util.InputMismatchException;

import static P07_GeometrikHesaplama.Variables.geometrikSekiller;
import static P07_GeometrikHesaplama.Variables.scan;

public class Cember implements AlanCevreBilgileri{


    @Override
    public void alanVeCevreHesapla() {
        System.out.print("yaricap  giriniz: ");
        System.out.println();
        double yariCap = 0;
        try {
            yariCap = scan.nextDouble();
        } catch (InputMismatchException e) {
            String hataliGiris=scan.nextLine();
            System.out.println("gecersiz karakter. tekrar deneyiniz");
            alanVeCevreHesapla();
        }


        Variables cember = new Variables(yariCap, 1, 1);
        geometrikSekiller.put("cember", cember);
        System.out.print("Cemberin Alani = " + geometrikSekiller.get("cember").getYariCap() *
                geometrikSekiller.get("cember").getYariCap() * PI_SAYISI);
        System.out.println();
        System.out.print("Cemberin Cevresi = " + 2 *
                geometrikSekiller.get("cember").getYariCap() * PI_SAYISI);
        System.out.println();
    }





}
