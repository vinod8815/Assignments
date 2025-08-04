
import java.util.Scanner;
class Check{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of rectangle");
    int length =sc.nextInt();
    System.out.println("Enter the breadth of rectangle");
    int breadth =sc.nextInt();
    if(length==breadth){
        System.out.println("It is a square");
    }
    else{
        System.out.println("It is not square");
    }
    }
    
}