import java.util.*;
public class indexOfAChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        char c = sc.next().charAt(0); 
        int ans = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            if(c == s.charAt(i)){
                break;
            }
            ans++;
        }
        System.out.println(ans);
    }
}
