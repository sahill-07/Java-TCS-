// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class wordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] str = s.split(" ");
        int count = 0 ;
        for(int i = 0 ; i < str.length ; i++){
            count++;
        }
        System.out.println(count);
    }
}