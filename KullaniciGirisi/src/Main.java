import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username,password,newPassword;
        int resetControl;

        Scanner input=new Scanner(System.in);

        System.out.println("Kullanıcı Adınız: ");
        username=input.nextLine();
        System.out.println("Şifreniz: ");
        password=input.nextLine();

        if(username.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız!");
        }
        else {
            System.out.println("Bilgileriniz Yanlış !");
            System.out.println("Şifrenizi Sıfırlamak istiyorrsanız 1'i tuşlayınız: ");
            resetControl = input.nextInt();

            if (resetControl == 1) {
                System.out.println("Yeni Şifrenizi Giriniz: ");
                input.nextLine();
                newPassword = input.nextLine();

                if (newPassword.equals("java123") || newPassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }
            else {
                System.out.println("Yeni Şifre Ataması Yapılmadı!");
            }

        }
    }
}