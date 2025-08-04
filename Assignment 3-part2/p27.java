import java.util.Scanner;
class p27{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter basic salary ");
double basicSalary=sc.nextDouble();
double hra=0,da=0;
if(basicSalary<=10000){
    hra=basicSalary*0.20;
    da=basicSalary*0.80;
}
else if(basicSalary<=20000){
    hra=basicSalary*0.25;
    da=basicSalary*0.90;
}
else{
hra=basicSalary*0.30;
da=basicSalary*0.95;
}
double grossSalary=basicSalary+hra+da;
System.out.println("HRA :"+hra);
System.out.println("DA :"+da);
System.out.println("GrossSalary :"+grossSalary);
}
}