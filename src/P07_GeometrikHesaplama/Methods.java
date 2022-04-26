package P07_GeometrikHesaplama;

public class Methods extends Variables {


    public static void girisMenusu() {

        System.out.println("Hesaplamak istediginiz sekli seciniz:\n1- Cember\n2- Dikdortgen\n3- Kare\nQ- Cikis");
        String secim = scan.next();

        switch (secim) {

            case "1":
                new Cember().alanVeCevreHesapla();
                girisMenusu();
                break;
            case "2":
                new Dikdortgen().alanVeCevreHesapla();
                girisMenusu();
                break;
            case "3":
                new Kare().alanVeCevreHesapla();
                girisMenusu();
                break;
            case "Q":
            case "q":
                System.out.println("Iyi gunler");
                break;
            default:
                System.out.println("Hatali giris yaptiniz. lutfen tekrar deneyiniz.");
                break;

        }
    }


}