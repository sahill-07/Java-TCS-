import java.util.*;

public class courseProgram {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Course [] arr = new Course[4] ;
        for(int i = 0 ; i < 4  ; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            int e = sc.nextInt(); sc.nextLine();
            arr[i] = new Course(a, b, c, d, e);
        }
        String ip1 = sc.nextLine();
        int ip2 = sc.nextInt();
        int ans1 = findAvgOfQuizByAdmin(arr , ip1);
        if(ans1 != 0){
            System.out.println(ans1);
        }
        else{
            System.out.println("No Course found");
        }
        Course [] ans2 = sortCourseByHandsOn(arr , ip2 );
        if(ans2 != null){
            for(int i = 0 ; i < ans2.length ; i++){
                System.out.println(ans2[i].cname);
            }
        }
        else{
            System.out.println("\"No Course found with mentioned attribute.");
        }
    }

    public static int findAvgOfQuizByAdmin(Course [] arr , String ip) {
        int count = 0 , sum = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].cad.equalsIgnoreCase(ip)){
                sum += arr[i].q;
                count++;
            }
        }
        if(count > 0){
            return Math.abs(sum/count);
        }
        return 0;
    }
    public static Course[] sortCourseByHandsOn(Course [] arr , int ip) {
        List<Course> ar1 = new ArrayList<>();
        for (Course course : arr) {
            if (course.h < ip) {
                ar1.add(course);
            }
        }

        // Convert List to array for sorting
        Course[] ar = ar1.toArray(new Course[0]);
        Course temp = null ;
        for(int i = 0 ; i < ar.length - 1 ; i++){
            for(int j = i ; j < ar.length - 1 ; j++){
                if(ar[j].h > ar[j + 1].h){
                    temp = ar[j] ;
                    ar[j] = ar[j + 1] ;
                    ar[j + 1] = temp ;
                }
            }
        }

        if(ar.length > 0){
            return ar ;
        }
        return null;
    }
}

class Course{
    int cid ;
    String cname;
    String cad ;
    int q ;
    int h ;

    public Course(int cid , String cname , String cad , int q , int h ){
        this.cid = cid ;
        this.cname = cname ;
        this.cad = cad;
        this.q = q ;
        this.h = h ;
    }
}
