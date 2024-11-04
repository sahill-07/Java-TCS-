import java.util.* ;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine();
        int ans = Integer.parseInt(binary , 2);
        System.out.println("Binary representation of " + binary + " is " + ans);
    }
}
