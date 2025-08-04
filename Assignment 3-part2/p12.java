import java.util.Scanner;
class EvenOddSwitch {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a alphabet letter:");
        char ch=inp.next().charAt(0);
        switch (ch) {
                case 'a':
                    System.out.println("vowel");
                    break;
                case 'e':
                    System.out.println("vowel");
                    break;
                case 'i':
                    System.out.println("vowel");
                    break;
                case 'o':
                    System.out.println("vowel");
                    break;
                case 'u':
                    System.out.println("vowel");
                    break;
               default:
                    System.out.println("Not a vowel");
            }
    }
}