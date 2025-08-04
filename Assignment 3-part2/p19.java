import java.util.Scanner;
class TriangleType{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side1 :");
        int side1 =sc.nextInt();
        System.out.println("Enter side2 :");
        int side2 =sc.nextInt();
        System.out.println("Enter side3 :");
        int side3 =sc.nextInt();
        
            if(side1==side2 && side2==side3)
        System.out.println("Equilater Triangle");
        else if(side1==side2 || side2==side3 || side1==side3)
        System.out.println("Isosceles Triangle"); 
        else if(side1!=side2 || side2!=side3 || side3!=side1)
            System.out.println("Scalene Triangle");
        else
            System.out.println("This is not Triangle");
           }
}