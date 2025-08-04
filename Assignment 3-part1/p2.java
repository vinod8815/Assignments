import java.util.Scanner;
class Shop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int oneUnitcost =100;
        System.out.println("Enter the purchase quantity");
        int quantity =sc.nextInt();
        int totalCost =quantity*oneUnitcost;
        if(totalCost>1000){
            double discount = totalCost*10/100;
            totalCost -=discount;
            }
    System.out.println("Total cost after Discount :"+totalCost);


    }
}