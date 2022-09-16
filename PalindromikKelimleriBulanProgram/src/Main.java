import java.util.Scanner;

public class Main {
    static boolean isPalindromik(String kelime){
        String palindrom="";
        for(int i=kelime.length()-1;i>=0;i--){
            palindrom += kelime.charAt(i);
        }
        if(kelime.equals(palindrom)) {
            System.out.println("Evet " + kelime + " kelime Palindromik kelime'dir!");
            return true;
        }
        else {
            System.out.println("Hayır " + kelime + " kelime Palindromik kelime değil'dir!");
            return false;
        }
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kelime giriniz: ");
        String kelime = input.nextLine();
        System.out.println(isPalindromik(kelime);

    }}