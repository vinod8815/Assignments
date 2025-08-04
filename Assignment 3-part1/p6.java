import java.util.Scanner;
class Absolute{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number :");
    int number=sc.nextInt();
    int absolute;
    if(number<0){
        absolute=-number;
}
else{
    absolute=number;
}
System.out.println("absolute :"+absolute);

    }
}