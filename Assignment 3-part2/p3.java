import java.util.Scanner;
class Percentage {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Total marks:");
        int totalMarks=inp.nextInt();
        System.out.print("Enter Total marks obtained by Student:");
        int marks=inp.nextInt();
        float percent=(float)(marks*100/totalMarks);
        System.out.println(percent);
    }
}