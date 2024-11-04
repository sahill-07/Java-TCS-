import java.util.* ;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0 ;

        while(n > 0){
            int digit = n % 10 ;
            reverse = reverse * 10 + digit ;
            n /= 10 ;
        }

        System.out.println("The reverse of the number " + n + "is " + reverse);
    }
}
