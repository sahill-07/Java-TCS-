// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5]; int sum = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % 2 == 1){
                sum += arr[i];
            }
        }
        
        if(sum > 8 ){
            System.out.println(sum);
        }
        else{
            System.out.println("no");
        }
        
    }
}