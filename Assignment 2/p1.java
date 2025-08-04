import java.util.Scanner;
class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rectangleParemeter");
        int rectangleParemeter = sc.nextInt();
        System.out.println("Enter rectangleLength");
        int rectangleLength =sc.nextInt();
        int rectangleBreadth =(rectangleParemeter/2)-rectangleLength;
        int rectangleArea =(rectangleLength*rectangleBreadth);
        System.out.println("RectangleBreadth :"+rectangleBreadth +" cm");
        System.out.println("RectangleArea :"+rectangleArea +" square meter");

    }
}