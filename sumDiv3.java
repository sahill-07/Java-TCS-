import java.util.* ;
public class sumDiv3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int sum = 0 ;

        while(n > 0){
            int digit = n % 10 ;
            sum += digit ;
            n /= 10;
        }

        if(sum % 3 == 0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
