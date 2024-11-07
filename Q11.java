import java.util.*;

class Solution{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Inst arr [] = new Inst[4];
        for(int i = 0 ; i < arr.length ; i++){
            int a = sc.nextInt() ; 
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); 
            sc.nextLine();
            int d = sc.nextInt(); 
            sc.nextLine();
            String l = sc.nextLine();
            arr[i] = new Inst(a , b , c, d , l );
        }
        
        String ip1 = sc.nextLine();
        String ip2 = sc.nextLine();
        
        int ans1 = FindNumClearancedByLoc(arr , ip1);
        Inst ans2 = UpdateInstitutionGrade(arr , ip2);
        
        if(ans1 > 0){
            System.out.println(ans1);
        }else{
            System.out.println("There are no cleared students in this particular location");
        }
        if(ans2 != null){
            System.out.println(ans2.name + "::" + ans2.g);
        }
        
    }
    
    public static int FindNumClearancedByLoc(Inst [] arr , String ip){
        int sum = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].l.equalsIgnoreCase(ip)){
                sum += arr[i].cleared;
            }
        }
        
        return sum ;
    }
    
    public static Inst UpdateInstitutionGrade(Inst [] arr , String ip){
        Inst temp = null ;
        int grade = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].name.equalsIgnoreCase(ip)){
                grade = (arr[i].placed * 100)/arr[i].cleared ;
                if(grade >= 80){
                    arr[i].g = "A" ;
                }else{
                    arr[i].g = "B" ;
                }
                
                temp = arr[i] ;
            }
        }
        return temp ;
    }
}

class Inst{
    int id ;
    String name ;
    int placed ;
    int cleared ;
    String l ;
    String g ;
    
    public Inst(int id , String name , int placed , int cleared , String l ){
        this.id = id ;
        this.name = name ;
        this.placed = placed ;
        this.cleared = cleared ;
        this.l = l ;
        this.g = "" ;
    }
    
}

/*
Create a class Institution with below attributes:

institutionId - int
institutionName - String
noOfStudentsPlaced - int
noOfStudentsCleared- int
location - String
grade - String

Write getters, setters for the above attributes.
Create constructor which takes parameter in the above sequence except grade.

Create class Solution with main method.
Implement two static methods - FindNumClearancedByLoc and UpdateInstitutionGrade in Solution class.

FindNumClearancedByLoc method:
----------------------------------------------
This method will take two input parameters - array of Institution objects and string parameter location.
The method will return the sum of the noOfStudentsCleared attribute from institution objects for the location passed as 
parameter. If no institution with the given location is present in the array of institution objects, then the method 
should return 0.

UpdateInstitutionGrade method:
-----------------------------------------------
This method will take a String parameter institutionName, along with the array of Institution objects.
The method will return the institution object, if the input String parameter matches with the institutionName attribute of the 
institution object. Before returning the object, the grade should be arrived based on the rating calculation mentioned below. 
This grade value should be assigned to the object.If any of the above conditions are not met, then the method should return 
null.

* The grade attribute should be calculated as follows:

Rating=(noOfStudentsPlaced * 100)/noOfStudentsCleared
If the rating >= 80 , then grade should be 'A'.
Else, then grade should be 'B'

**Note:**
--------------------------------------------
No institution object would have the same value for institutionName attribute.
All institution object would have the noOfStudentsPlaced value lesser than noOfStudentsCleared value.
All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For FindNumClearancedByLoc method - The main method should print the noOfClearance as it is, if the returned value is 
greater than 0, or it should print "There are no cleared students in this particular location".

For UpdateInstitutionGrade method - The main method should print the institutionName and grade of the returned Institution 
object. The instituationName and grade should be concatinated with :: while printing. eg:- TCS::A, where TCS is the 
institution name and A is the grade.
If the returned value is nullthen it should print "No Institute is available with the specified name".

Before calling these static methods in main, use Scanner object to read the values of four Phone objects referring attributes 
in the above mentioned attribute sequence (except grade attribute). Next, read the value for location and institutionName.

Input
-------------------------------------------
111
Amrita
5000
10000
Chennai
222
Karunya
16000
20000
Coimbatore
333
AppleTech
10000
12000
Chennai
444
Aruna
6000
10000
Vellore
Chennai
Karunya

Output
----------------------------------------
22000
Karunya::A

Starter Code
========================================
    import java.util.Scanner
    public class Solution
    {

    public static void main(String[] args)
    {
    //code to read values
    //code to call required method
    //code to display the result
    }

    public static int findNumClearancedByLoc(Institution[] instArray, String location)
    {
    //method logic
    }

    public static Institution updateInstitutionGrade(Institution[] instArray, String instName)
    {
    //method logic
    }
    }
    class Institution
    {
    //code to build Institution class
    }
 */