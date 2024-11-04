import java.util.* ;

public class Functions {

    public static void printMyName(String name){
        System.out.println("My name is " + name);
        return ;
    }

    public static int sum(int a , int b){
        return a + b ;
    }

    public static int factorial(int n){
        int ans = 1 ;
        while(n > 0){
            ans = ans * n ;
            n--;
        }
        return ans ;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int b = sc.nextInt();

        // System.out.println("the sum of " + a + " + " + b + " is " + sum(a , b));
        System.out.println("The factorial of " + a + " is " + factorial(a));

        // printMyName();
    }
}
