import java.util.* ;

class Phone{
    int pid ;
    String os ;
    String brand ;
    int price ;

    public Phone(int pid , String os , String brand ,int price){
        this.pid = pid ;
        this.os = os ;
        this.brand = brand ;
        this.price = price ;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] arr = new Phone[4];
        for(int i = 0 ; i < 4 ; i++){
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            arr[i] = new Phone(a , b , c ,d);
        }

        
        String ip1 = sc.nextLine();
        String ip2 = sc.nextLine();

        int ans1 = findP(arr , ip1);
        Phone ans2 = getP(arr , ip2);
        if(ans1 > 0){
            System.out.println(ans1);
        }
        else{
            System.out.println("he given Brand is not available");
        }
        if(ans2 != null){
            System.out.println(ans2.pid);
        }
        else{
            System.out.println("No phones are available with specified os and price range");
        }
    }

    public static int findP(Phone [] arr , String ip){
        int sum = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].brand.equalsIgnoreCase(ip)){
                sum += arr[i].price;
            }
        }
        return sum ; 
    } 
    public static Phone getP(Phone [] arr , String ip){
        Phone temp = null;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].os.equalsIgnoreCase(ip) && arr[i].price >= 50000 ){
                temp = arr[i];
            }
        }
        return temp;
    }
}
