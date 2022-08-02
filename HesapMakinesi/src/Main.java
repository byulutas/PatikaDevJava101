import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1,sayi2,secim;

        Scanner input=new Scanner(System.in);
        System.out.println("İlk Sayiyi Giriniz:");
        sayi1=input.nextInt();
        System.out.println("İkinci Sayiyi Giriniz:");
        sayi2=input.nextInt();

        System.out.println("1-Toplam \n2-Cikarma\n3-Carpma\n4-Bolme:");
        System.out.println("Seciminiz:");
        secim=input.nextInt();

        switch(secim){
            case 1:
                System.out.println("Toplam:"+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Cikarma:"+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Carpma:"+(sayi1*sayi2));
                break;
            case 4:
                if(sayi2==0){
                    System.out.println("Bir sayi 0'a bölünmez!");
                }
                else {
                    System.out.println("Bolme:" + (sayi1 / sayi2));
                }
                break;
            default:
                System.out.println("Yanlıs secim");

        }
    }
}