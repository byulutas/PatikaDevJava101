import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,i,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci seriniz kaç adımdan oluşmsun: ");
        number = input.nextInt();
        int s1=0;
        int s2=1;
        for(i=0;i<=number;i++){
            System.out.print(s1 + " ");
            sum = s1+s2;
            s1=s2;
            s2=sum;
        }
    }
}
