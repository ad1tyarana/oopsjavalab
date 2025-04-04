import java.util.Scanner;
public class SUM_OF_DIGITS {
    public static void main(String[] args) {
        System.out.println("Enter the number to find the sum of it's digits=");
        Scanner s= new Scanner (System.in);
        int a=s.nextInt();
        int sum=0;
        while(a!=0){
            sum+=a%10;
            a=a/10;
        }
        System.out.println("SUM OF DIGITS OF THE NUMBER="+ sum);
        s.close();
    }
}
