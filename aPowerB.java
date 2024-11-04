import java.util.*;

public class aPowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = (int)Math.pow(a, b);
        System.out.println(ans);
        int ans2 = 1 ;
        for(int i = 0 ; i < b ; i++){
            ans2 = ans2 * a ; 
        }
    }
}
