import java.util.Scanner;
class LowerUpper{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a chacter :");
        char x=sc.next().charAt(0);

        if(x >='a' && x <='z'){
            System.out.println("The chacter is in lower case");
         }
         else if(x >='A' && x <='Z'){
            System.out.println("The chacter is in upper case");
            }
            else{
                System.out.println("The chacter is not in alphabate");

            }
    }
}