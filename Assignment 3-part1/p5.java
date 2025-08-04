import java.util.Scanner;
class Person{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st person age :");
        int a=sc.nextInt();
        System.out.println("Enter 2nd person age :");
        int b=sc.nextInt();
        System.out.println("Enter 3rd person age :");
         int c=sc.nextInt();
        if(a>b && a>c){
        
            System.out.println("person A is older");
        }
        else if(b>a && b>c){
            System.out.println("person B is older");
            }
        else{
            System.out.println("person C is older");
            }
         if(a<b && a<c){
            System.out.println("person is A younger");
            }
            else if(b<a && b<c){
                System.out.println("person B is younger");
            }       
            else{
                System.out.println("person C is younger");
            }

    }
}