import java.util.Scanner;
class Student{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Total number of classes held");
        int TotalClasses=sc.nextInt();
        System.out.println("Number of classes attended");
        int AttendedClasses=sc.nextInt();
        double percentage=(AttendedClasses*100)/TotalClasses;
        System.out.println("Percentage of classes attended :"+percentage+"%");
        if(percentage>=75){
            System.out.println("You are allowed to sit in class");
        
        }
        else{
            System.out.println("You are not allowed to sit in class");
        }
    }
}