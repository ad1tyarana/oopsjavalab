import java.util.Arrays;
import java.util.Scanner;
public class second_largest_int {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of elements of the array:");
        int a=s.nextInt();
        int[] x=new int[a];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < a; i++) {
            x[i] = s.nextInt();
        }
        System.out.print("The array is:"+Arrays.toString(x));
        int g=x[0];
        for(int i=1;i<a;i++){
            if(x[i]>g){
                g=x[i];
            }
        }
        int index=0;
        for(int i=1;i<a;i++){
            if(g==x[i]){
                index=i;
                x[index]=0;
            }
        }
        int z=0;
        for(int i=1;i<a;i++){
            if(x[i]>z){
                z=x[i];
            }
        }
        System.out.print("\nThe second greatest integer in the array is:"+z);
        s.close();
    }
    
}
