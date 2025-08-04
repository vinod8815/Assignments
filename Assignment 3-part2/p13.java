import java.util.Scanner;
class Arithmetic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        float num1=sc.nextInt();
        System.out.println("Enter a symbol of perfom operater(+,*,/,-,):");
        char ch=sc.next().charAt(0);
        System.out.println("Enter another number :");
        float num2=sc.nextFloat();
        float result;
        switch (ch){
            case'+':
            result = num1+num2;
            System.out.println("Result :"+result);
            break;
            case'*':
            result = num1*num2;
            System.out.println("Result :"+result);
            break;
            case'-':
            result = num1-num2;
            System.out.println("Result :"+result);
            break;
            case'/':
            result = num1/num2;
            System.out.println("Result :"+result);
            break;
            case'%':
            result = num1%num2;
            System.out.println("Result :"+result);
            break;
            default:
            System.out.println("Not a operater");



        }


    }
}