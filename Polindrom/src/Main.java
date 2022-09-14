public class Main {

        static boolean isPalindrom(int x){
            int sonuc,gecici=x,sayininTersi=0;
            while(gecici!=0){
                sonuc=gecici%10;
                sayininTersi=(sayininTersi*10)+sonuc;
                gecici/=10;
            }
            if(x==sayininTersi) {
                return true;
            }
            else{
                return false;
            }
        }

        public static void main(String[] args){
            System.out.println(isPalindrom(303));
        }

}