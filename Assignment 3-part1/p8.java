import java.util.Scanner;
class Medical {
    public static void main(String args[]){

     Scanner sc=new Scanner(System.in);
     System.out.println("Enter medical cause (Y or N)");
     char medicalCause =sc.next().charAt(0);

     if(medicalCause=='Y' || medicalCause=='y'){
        System.out.println("Allow student to sit in class");
     }
     else if(medicalCause=='N' || medicalCause=='n'){
        System.out.println(" Not allow student ");

     }

    }
    

}