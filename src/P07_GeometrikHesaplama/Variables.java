package P07_GeometrikHesaplama;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static P07_GeometrikHesaplama.Methods.girisMenusu;

public class Variables {

public static Scanner scan=new Scanner(System.in);
    public static Map<String ,Variables> geometrikSekiller=new HashMap<String ,Variables>();
    private static double yariCap=1;
    private static double uzunKenar =1;
    private static double genislik=1;
public static double kareDikdortgenAlan=getUzunKenar()*getGenislik();
public static double kareDikdortgenCevre=(getUzunKenar()+getGenislik())*2;
public static double cemberAlan=getYariCap()*getYariCap()*AlanCevreBilgileri.PI_SAYISI;

    public Variables() {
    }

    public Variables(double yariCap, double uzunluk, double genislik) {
        setYariCap(yariCap);
        setUzunKenar(uzunluk);
        setGenislik(genislik);
    }

    public static double getYariCap() {
        return yariCap;
    }

    public static void setYariCap(double yariCap) {


        if (yariCap>0){
            Variables.yariCap = yariCap;
        }else{
            System.out.println("gecerli bir uzunluk giriniz");
            girisMenusu();
        }
    }

    public static double getUzunKenar() {
        return uzunKenar;
    }

    public static void setUzunKenar(double uzunKenar) {
        if (uzunKenar>0){
            Variables.uzunKenar = uzunKenar;
        }else{
            System.out.println("gecerli bir uzunluk giriniz");
            girisMenusu();
        }

    }

    public static double getGenislik() {

        return genislik;
    }

    public static void setGenislik(double genislik) {
        if (genislik>0){
            Variables.genislik = genislik;
        }else{
            System.out.println("gecerli bir uzunluk giriniz");
            girisMenusu();
        }
    }
}



