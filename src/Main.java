import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Random random=new Random();
        int n=0,num=random.nextInt(1,100);
        int[] wrong=new int[5];
        boolean isWin=false,isWrong=false;
        while (n<5){
            System.out.println("Sayı tahmininizi girin");
            int guess= in.nextInt();
            if (guess<=0 || guess>100) {
                System.out.println("Tahmininiz 1 ile 100 arasında olmalı.");
                if (isWrong ) {
                    wrong[n++]=guess;
                    System.out.println("Tekrar hatalı aralıkta tahmin yaptınız.\n"+"Kalan hakkınız : "+  (5-n));
                }else {
                    isWrong=true;
                    System.out.println("Tekrar hatalı aralıkta tahmin yaparsanız hakkınızdan düşülecektir.");
                }
                continue;
            }
            if (guess == num) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğiniz sayı : "+num);
                isWin=true;
                break;
            }else {
                System.out.println("Tahmininiz Yanlış ! ");
                if (guess > num) {
                    System.out.println(guess + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(guess+ " sayısı, gizli sayıdan küçüktür.");
                }

                wrong[n++] = guess;
                System.out.println("Kalan hakkınız : " + (5 - n));
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            System.out.println("Tahmin edilmesi beklenen sayı: "+num);
            System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
        }
    }
}