import java.util.* ;

public class CountNoOfDigitsInANum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0  ;
        while(n > 0){
            count++ ;
            n /= 10 ;
        }

        System.out.println("The count is : " + count);
    }
}
