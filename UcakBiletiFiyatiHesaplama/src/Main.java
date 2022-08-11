import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe,yas,yolculukTipi;
        double normalFiyat,yasIndirimi,GidisDonusBiletIndirimi,indirimliTutar,toplamFiyat;

        Scanner input=new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz : ");
        mesafe=input.nextInt();

        System.out.println("Yasiniz giriniz : ");
        yas=input.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        yolculukTipi=input.nextInt();

        if(yas<0||mesafe<0 || yolculukTipi<1||yolculukTipi>2){
            System.out.println("Hatali Veri Girdiniz!");
        }
        else{

            if(yas<=12) {
                if (yolculukTipi==1){
                    normalFiyat=mesafe*0.10;
                    yasIndirimi=normalFiyat*0.5;
                    toplamFiyat=normalFiyat-yasIndirimi;
                    System.out.println("Toplam Tutar = "+toplamFiyat+" TL");

                }else if(yolculukTipi==2){
                    normalFiyat=mesafe*0.10;
                    yasIndirimi=normalFiyat*0.5;
                    indirimliTutar=normalFiyat-yasIndirimi;
                    GidisDonusBiletIndirimi=indirimliTutar*0.20;
                    toplamFiyat=indirimliTutar-GidisDonusBiletIndirimi;
                    toplamFiyat=toplamFiyat*2;
                    System.out.println("Toplam Tutar = "+toplamFiyat+" TL");
                }
            }else if (yas>12&&yas<=24) {
                if (yolculukTipi == 1) {
                    normalFiyat=mesafe*0.10;
                    yasIndirimi=normalFiyat*0.1;
                    toplamFiyat=normalFiyat-yasIndirimi;
                    System.out.println("Toplam Tutar = "+toplamFiyat+" TL");

                } else if (yolculukTipi == 2) {
                    normalFiyat=mesafe*0.10;
                    yasIndirimi=normalFiyat*0.1;
                    indirimliTutar=normalFiyat-yasIndirimi;
                    GidisDonusBiletIndirimi=indirimliTutar*0.20;
                    toplamFiyat=indirimliTutar-GidisDonusBiletIndirimi;
                    toplamFiyat=toplamFiyat*2;
                    System.out.println("Toplam Tutar = "+toplamFiyat+" TL");
                }
            }
            else if (yas>=65) {
                if (yolculukTipi == 1) {
                    normalFiyat=mesafe*0.10;
                    yasIndirimi=normalFiyat*0.3;
                    toplamFiyat=normalFiyat-yasIndirimi;
                    System.out.println("Toplam Tutar = "+toplamFiyat+" TL");

                } else if (yolculukTipi == 2) {
                    normalFiyat=mesafe*0.10;
                    yasIndirimi=normalFiyat*0.3;
                    indirimliTutar=normalFiyat-yasIndirimi;
                    GidisDonusBiletIndirimi=indirimliTutar*0.20;
                    toplamFiyat=indirimliTutar-GidisDonusBiletIndirimi;
                    toplamFiyat=toplamFiyat*2;
                    System.out.println("Toplam Tutar = "+toplamFiyat+" TL");
                }
            }
            else {
                if (yolculukTipi == 1) {
                    normalFiyat=mesafe*0.10;
                    toplamFiyat=normalFiyat;
                    System.out.println("Toplam Tutar = "+toplamFiyat+" TL");

                } else if (yolculukTipi == 2) {
                    normalFiyat=mesafe*0.10;
                    GidisDonusBiletIndirimi=normalFiyat*0.20;
                    toplamFiyat=normalFiyat-GidisDonusBiletIndirimi;
                    toplamFiyat=toplamFiyat*2;
                    System.out.println("Toplam Tutar = "+toplamFiyat+" TL");
                }

            }

        }

    }
}