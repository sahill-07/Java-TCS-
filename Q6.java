import java.util.*;

public class Q6 {
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        Book [] arr = new Book[4];
        for(int i = 0 ; i < 4 ; i++){
            int a = sc.nextInt() ;
            int b = sc.nextInt() ;
            sc.nextLine();
            String c = sc.nextLine();
            String d = sc.nextLine();
            double e = sc.nextDouble();
            sc.nextLine();

            arr[i] = new Book(a , b, c, d , e);
        }

        String ip1 = sc.nextLine();
        Book ans1 =  fbwmp(arr);
        if(ans1 != null){
            System.out.println(ans1.bid + " " + ans1.t);
        }else{
            System.out.println("No Book found with mentioned attribute.");
        }
        Book ans2 = sbt(arr , ip1);
        if(ans2 != null){
            System.out.println(ans2.bid);
            System.out.println(ans2.p);
        }
        else{
            System.out.println("No Book found with mentioned attribute.");
        }
    }

    public static Book fbwmp(Book [] arr){
        Book temp = null ;
        double maxi = Integer.MIN_VALUE ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].price > maxi ){
                maxi = arr[i].price ;
                temp = arr[i];
            }
        }
        return temp;
    }

    public static Book sbt(Book [] arr , String ip){
        Book ans = null;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].t.equalsIgnoreCase(ip)){
                ans = arr[i];
            }
        }

        return ans ;
    }
}

class Book{
    int bid ;
    int p ;
    String t ;
    String a ;
    double price ;

    public Book(int bid , int p , String t , String a , double price){
        this.bid = bid ;
        this.p = p ;
        this.t = t ;
        this.a = a ;
        this.price = price ;
    }
}
