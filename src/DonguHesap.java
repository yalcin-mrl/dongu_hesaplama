import java.util.Scanner;

public class DonguHesap {
    public static void main(String[] args){
        int num,top = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(num%2 == 0){
            if(num%4 == 0){
                top += num;
            }
            num = sc.nextInt();

        }
        System.out.println("Top: "+ top);
    }
}
