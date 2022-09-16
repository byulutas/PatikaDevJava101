import java.util.Scanner;

public class Main {
    static boolean isPalindromik(String name){
        String palindrom="";
        for(int i=name.length()-1;i>=0;i--){
            palindrom += name.charAt(i);
        }
        if(name.equals(palindrom)) {
            System.out.println("Evet " + name + " kelime Palindromik kelime'dir!");
            return true;
        }
        else {
            System.out.println("Hayır " + name + " kelime Palindromik kelime değil'dir!");
            return false;
        }
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kelime giriniz: ");
        String name = input.nextLine();
        System.out.println(isPalindromik(name));

    }}