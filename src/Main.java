import java.util.Scanner;

public class Main {
    static boolean palindrom(int sayi){

        int tersi=sayi,ilkBasamak,basamak=0;

        while (tersi!=0){
            ilkBasamak=tersi%10;
            basamak=(basamak*10)+ilkBasamak;
            tersi/=10;

        }
        return sayi == basamak;
    }
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Palindrom sayi giriniz");
        int sayi=input.nextInt();
        if (palindrom(sayi)){
            System.out.println(sayi+"Palindrom sayidir");
        }
        else {
            System.out.println(sayi+" Palindrom sayi değildir");
        }

    }
}