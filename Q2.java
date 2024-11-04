import java.util.*;

public class Q2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Medicine [] m = new Medicine[4];
        for(int i = 0 ; i < 4 ; i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            m[i] = new Medicine(a , b , c, d);
        }

        String p1 = sc.nextLine();
        List<Integer> arr = medicinePriceForGivenDisease(m, p1);
        for(int i = 0 ; i < arr.size() ; i++){
            System.out.println(arr.get(i));
        }

    }    
    public static List<Integer> medicinePriceForGivenDisease(Medicine[] m , String p1){
        List<Integer>arr = new ArrayList<>();

        for(int i = 0 ; i < m.length ; i++){
            if(m[i].getDisease().equalsIgnoreCase(p1)){
                arr.add(m[i].getPrice());
            }
        }

        Collections.sort(arr);
        return arr;
    }
}


class Medicine{
    String medicineName;
    String batchNo;
    String disease;
    int price ;

    public Medicine(String medicineName , String batchNo , String disease , int price){
        this.medicineName = medicineName ;
        this.batchNo = batchNo ;
        this.disease = disease ;
        this.price = price ;
    }

    public String getMedicineName(){
        return medicineName ;
    }
    public String getBatchNo(){
        return batchNo;
    }
    public String getDisease(){
        return disease;
    }
    public int getPrice(){
        return price;
    }
}