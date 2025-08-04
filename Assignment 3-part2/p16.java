import java.util.Scanner;
class Convert{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter choice :");
        char ch =sc.next().charAt(0);
        if(ch=='C' || ch=='c'){
            System.out.println("Enter Temperature in Fahrenheit :");
             double temperature=sc.nextDouble();
 
            double a=(double)((temperature-32)*5/9);
            System.out.println("Fahrenheit to celsuis:"+a);
        }
        else if(ch=='F' || ch=='f'){
            System.out.println("Enter Temperature in Celsius :");
             double temperatur=sc.nextDouble();
 
            double b=(double)((temperatur*9/5)+32);
             System.out.println("celsuis to fahrenheit:"+b);
        }

    }
}