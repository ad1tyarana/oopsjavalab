public class arrayq1 {
    public static void main(String[] args){
        int arr[]={2,3,2,5,2,6};
        int i=0;
        int sum=0;

        for(i=0;i<=5;i++){
            if(arr[i]==2){
                sum+=1;
            }
        }
        System.out.println("NUMBER OF TIMES 2 APPEARS IN THE ARRAY="+sum);
    } 

}
