import java.util.Scanner;
class Note{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Amount : ");
        int amount=sc.nextInt();
        

        if(amount>=500){
    System.out.println("500 Rs :"+amount/500);
    amount%=500;
    }
    if(amount>=200){
     System.out.println("200 Rs :"+amount/200);
     amount%=200;   
    }
    if(amount>=100){
    System.out.println("100 Rs :"+amount/100);
    amount%=100;
    }
    if(amount>=50){
    System.out.println("50 Rs :"+amount/50);
    amount%=50;
    }
    if(amount>=20){
    System.out.println("20 Rs :"+amount/20);
    amount%=20;
    }
    if(amount>=10){
        System.out.println("10 Rs :"+amount/10);
    amount%=10;
    }
    if(amount>=5){
    System.out.println("5 Rs :"+amount/5);
    amount%=5;
    }
    if(amount==1){
    System.out.println("1 Rs :"+amount/1);
    amount%=1;
    }
}
}