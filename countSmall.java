// Counting small letters present in a string
import java.util.*;
public class countSmall {
    public static void main(String [] main){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' ){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
