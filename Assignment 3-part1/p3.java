import java.util.Scanner;
class Company{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employ salary");
        double salary=sc.nextDouble();
        System.out.println("Enter employ year of service");
        int year =sc.nextInt();
        if(year>5){
            double bonus =salary*5/100;
            System.out.println("your bonus :"+bonus);
            }
            else{
                System.out.println("no bonus");

            }
    }
}