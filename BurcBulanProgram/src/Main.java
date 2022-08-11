import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int gun,ay;

        Scanner input=new Scanner(System.in);

        System.out.println("Doğduğunuz Ayı Giriniz:");
        ay=input.nextInt();
        if(ay>=1 && ay<=12){

            System.out.println("Doğduğunuz Günü Giriniz: ");
            gun=input.nextInt();

            if(ay==1){
                if(gun>=1 && gun<=21){
                    System.out.println("Oglak Burcusunuz");
                }else if(gun>=22 && gun<=31){
                    System.out.println("Kova Burcusunuz");
                }else{
                    System.out.println("Hatali Gun Girdiniz!");
                }
            }
            else if(ay==2){
                if(gun>=1 && gun<=20){
                    System.out.println("Kova Burcusunuz");

                }else if (gun>=21 && gun<=31){
                    System.out.println("Balik Burcusunuz");
                }else{
                    System.out.println("Hatali Gun Girdiniz!");
                }

            }
            else if(ay==3){
                if (gun>=1 && gun<=20){
                    System.out.println("Balik Burcusunuz");
                }else if(gun>=21 && gun<=31){
                    System.out.println("Koc Burcusunuz");
                }
                else{
                    System.out.println("Hatali Gun Girdiniz!");
                }
            }
            else if(ay==4){
                if(gun>=1 && gun<=20){
                    System.out.println("Koc Burcusunuz");
                }else if(gun>=21 && gun<=31){
                    System.out.println("Boga Burcusunuz");
                }else{
                    System.out.println("Hatali Gun Girdiniz!");
                }
            }
            else if(ay==5){
                if (gun>=1 && gun<=21){
                    System.out.println("Boga Burcusunuz");
                }else if(gun>=22 && gun<=31){
                    System.out.println("Ikizler Burcusunuz");
                }else{
                    System.out.println("Hatali Gun Girdiniz!");
                }
            }
            else if(ay==6){
                if (gun>=1 && gun<=22){
                    System.out.println("Ikizler Burcusunuz");
                }else if(gun>=23 && gun<=31){
                    System.out.println("Yengec Burcusunuz");
                }else{
                    System.out.println("Hatali Gun Girdiniz!");
                }
            }
            else if(ay==7){
                if (gun>=1 && gun<=22){
                    System.out.println("Yengec Burcusunuz");
                }else if(gun>=23 && gun<=31){
                    System.out.println("Aslan Burcusunuz");
                }else{
                    System.out.println("Hatali Gun Girdiniz!");
                }
            }
            else if(ay==8){
                if(gun>=1 && gun<=22){
                    System.out.println("Aslan Burcusunuz");
                }else if (gun>=23 && gun<=31){
                    System.out.println("Basak Burcusunuz");
                }else{
                    System.out.println("Hatali Gun Girdiniz!");
                }
            }
            else if(ay==9){
                if(gun>=1 && gun<=22){
                    System.out.println("Basak Burcusunuz");
                }else if(gun>=23 && gun<=31){
                    System.out.println("Terazi Burcusunuz");
                }else{
                    System.out.println("Hatali Gun Girdiniz!");
                }
            }
            else if(ay==10){
                if (gun>=1 && gun<=22){
                    System.out.println("Terazi Burcusunuz");
                }else if (gun>=23 && gun<=31){
                    System.out.println("Akrep Burcusunuz");
                }else{
                    System.out.println("Hatali Gun Girdiniz!");
                }
            }
            else if(ay==11){
                if (gun>=1 && gun<=21){
                    System.out.println("Akrep Burcusunuz");
                }else if (gun>=22 && gun<=31){
                    System.out.println("Yay Burcusunuz");
                }else{
                    System.out.println("Hatali Gun Girdiniz!");
                }
            }
            else if(ay==12)
                if (gun>=1 && gun<=21){
                    System.out.println("Yay Burcusunuz");
                }else if (gun>=22 && gun<=31){
                    System.out.println("Oglak Burcusunuz");
                }
                else{
                    System.out.println("Hatali Gun Girdiniz!");
                }

        }else{
            System.out.println("Hatali Ay Girdiniz!");
        }
    }
}