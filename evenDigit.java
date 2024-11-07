// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class evenDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int count = 0;
        while(n > 0){
            int digit = n % 10 ;
            if(digit % 2 == 0){
                count++;
            }
            n /= 10;
        }
        if(count > 2){
            
        System.out.println(count + "true");
        }
        else{
            
        System.out.println(count + "false");
        }
    }
}