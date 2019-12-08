import java.util.*;
public class M3Q10{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a =0;
        int b =0;
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=scn.nextInt();
        }
        for(int j=0; j<arr.length; j++){
            for(int k=j+1; k<arr.length; k++){
                if(arr[k]<arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = tmp;
                }
            }
        }
        System.out.println(arr[n-1]*arr[n-2]);
    }
}