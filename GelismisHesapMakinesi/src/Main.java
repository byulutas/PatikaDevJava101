import java.util.Scanner;

public class Main {
    static int toplama(int a,int b){
        Scanner inp=new Scanner(System.in);
        System.out.print("Birinci sayiyi  giriniz:");
        a = inp.nextInt();
        System.out.print("Ikinci sayiyi  giriniz:");
        b=inp.nextInt();
        return a +b;
    }
    static int cikarma(int a,int b){
        Scanner inp=new Scanner(System.in);
        System.out.print("Birinci sayiyi  giriniz:");
        a= inp.nextInt();
        System.out.print("Ikinci sayiyi  giriniz:");
        b=inp.nextInt();
        return a-b;
    }
    static int carpam(int a,int b){
        Scanner inp=new Scanner(System.in);
        System.out.print("Birinci sayiyi  giriniz:");
        a= inp.nextInt();
        System.out.print("Ikinci sayiyi  giriniz:");
        b=inp.nextInt();
        return a*b;
    }
    static double bolme(double a,double b){
        Scanner inp=new Scanner(System.in);
        System.out.print("Birinci sayiyi  giriniz:");
        a= inp.nextInt();
        System.out.print("Ikinci sayiyi  giriniz:");
        b=inp.nextInt();
        return a/b;
    }
    static int usluSayiAlma(int a,int b){
        Scanner inp=new Scanner(System.in);
        System.out.print("Birinci sayiyi  giriniz:");
        a= inp.nextInt();
        System.out.print("Ikinci sayiyi  giriniz:");
        b=inp.nextInt();
        int toplam =1;
        for (int i=1;i<=b;i++){
            toplam*=a;
        }
        return toplam;
    }
    static int faktoriyel(int a,int b) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi  giriniz:");
        a = inp.nextInt();
        int toplam =1;
        for (int i=1;i<=a;i++){
            toplam*=i;
        }
        return toplam;
    }
    static int modAlma(int a,int b){
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci sayiyi  giriniz:");
        a= inp.nextInt();
        System.out.print("Ikinci sayiyi  giriniz:");
        b=inp.nextInt();
        int toplam=a%b;
        return toplam;
    }


    static int dikdortgenAlanVeCevreHesaplama(int a, int b) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Uzun kenarin uzunlugunu yaziniz:");
        a= inp.nextInt();
        System.out.print("Kisa kenar uzunlugunu yaziniz:");
        b=inp.nextInt();
        int cevre=(2*a)+(2*b);
        int alan =a*b;
        System.out.println("Alan :"+alan+"\n"+"Cevre :"+cevre);
        return alan;

    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String menu = "1-Toplama \n" +
                "2-Cikartma\n" +
                "3-Carpma\n" +
                "4-Bolme\n" +
                "5-Uslu Sayi Hesaplama\n" +
                "6-Faktoriyel Hesaplama\n" +
                "7-Mod Alma\n" +
                "8-Dikdortgen cevre ,alan Hesaplama\n";
        int secim;
        do {



            System.out.println(menu);
            System.out.print("Bir islem seciniz :");
            secim= inp.nextInt();
            switch (secim){
                case 1:
                    System.out.println("Sonuc :"+toplama(1,1));
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Sonuc :"+cikarma(1,1));
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Sonuc :"+carpam(1,1));
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("Sonuc :"+bolme(1,1));
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                case 5:
                    System.out.println("Sonuc :"+usluSayiAlma(1,1));
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                case 6:
                    System.out.println("Sonuc :"+faktoriyel(1,1));
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                case 7:
                    System.out.println("Sonuc :"+modAlma(1,1));
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                case 8:
                    dikdortgenAlanVeCevreHesaplama(1,1) ;
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                default:
                    System.out.println("\nHatali islem !!!Tekrar deneyin \n");


            }
        }while (secim!=0);
    }

}