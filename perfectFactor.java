// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class perfectFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();int sum = 0 ;
        for(int i = 1 ; i < n ; i++){
            if(n % i == 0){
                sum += i ;
            }
        }
        
        if(sum == n){
            System.out.println("prime factor");
        }else{
            System.out.println("not prime factor");
        }
        
    }
}