import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sim [] arr = new Sim[5];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble();
            double d = sc.nextDouble();sc.nextLine();
            String e = sc.nextLine();

            arr[i]=new Sim(a,b,c,d,e);
        }
        String ip1 = sc.nextLine();
        String ip2 = sc.nextLine();

       Sim [] ans = transferCustomerCircle(arr, ip1, ip2);

       for(int i = 0 ; i < ans.length ; i++){
            System.out.println(ans[i].cname + " " + " " + ans[i].c + " " + ans[i].rps);
       }

       sc.close();
    }

    public static Sim[] transferCustomerCircle(Sim [] arr , String ip1 , String ip2) {
        List<Sim>a = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++ ){
            if(arr[i].c.equalsIgnoreCase(ip1)){
                arr[i].c = ip2;
                a.add(arr[i]);
            }
        }

        a.sort(Comparator.comparingDouble(Sim::getRps).reversed());
        return a.toArray(new Sim[0]);

    }

}


class Sim{
    int sid ;
    String cname ;
    double b;
    double rps ;
    String c ;

    public Sim(int sid , String cname , double b ,double rps , String c){
        this.sid = sid ;
        this.cname = cname ;
        this.b = b ;
        this.rps = rps ;
        this.c = c ;
    }

    public double getRps(){
        return rps;
    }
}

