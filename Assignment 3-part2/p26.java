import java.util.Scanner;
class StudentGrade{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter marks of Physics :");
    int physics=sc.nextInt();
    System.out.println("Enter marks of Chemistry :");
    int Chemistry=sc.nextInt();
    System.out.println("Enter a marks of Biology :");
    int Biology=sc.nextInt();
    System.out.println("Enter a marks of Mathematics :");
    int Mathematics=sc.nextInt();
    System.out.println("Enter a marks of Computer :");
    int Computer=sc.nextInt();
    int total=physics+Mathematics+Chemistry+Biology+Computer;
    float percentage=(float)(total/5.0);
    char grade;
    if(percentage>=90){
        grade='A';
    }
    else if(percentage>=80){
        grade='B';
    }
    else if(percentage>=70){
        grade='C';
    }
    else if(percentage>=60){
        grade='D';
    }
    else if(percentage>=40){
        grade='E';
    }
    else{
        grade='F';
    }
    System.out.println("Total :"+total);
    System.out.println("Percentage :"+percentage+"%");
    System.out.println("Grade :"+grade);                                                 
    }
}