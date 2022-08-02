import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int r;
       double pi=3.14;
       double aci;

       Scanner input=new Scanner(System.in);
       System.out.println("Daire dilimi'nin  yaricapini giriniz: ");
       r=input.nextInt();
       System.out.println("Merkez acinin olcusunu giriniz: ");
       aci=input.nextInt();

       double alan=pi*r*r;
       double cevre=2*pi*r;
       double dairedilimininalani=(pi*(r*r)*aci)/360;

       System.out.println("Daire'nin alani:"+alan);
       System.out.println("Daire'nin cevresi:"+cevre);
       System.out.println("Daire Diliminin alani:"+dairedilimininalani);

    }
}