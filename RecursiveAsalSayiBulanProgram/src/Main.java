import java.util.Scanner;

public class Main {
    static boolean AsalSayiKontrol(int sayi,int index){
        if(sayi<=2){
            return (sayi==2)?true:false;
        }
        if(sayi % index==0){
            return false;
        }
        if(index*index>sayi){
            return true;
        }
        return AsalSayiKontrol(sayi,index+1);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.print("Sayı giriniz: ");
            int number=input.nextInt();
            if(AsalSayiKontrol(number,2)){
                System.out.println(number+" sayısı asaldır!");
            }else{
                System.out.println(number+" sayısı  asal değildir!");
            }
        }
    }}