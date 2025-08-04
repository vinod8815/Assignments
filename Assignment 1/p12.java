public class p12 {
    public static void main(String args[]){
        int hypo =13;
        int oneside =12;
        double otherside =Math.sqrt((hypo*hypo)-(oneside*oneside));
        double area= (oneside*otherside)/2;
        System.out.println("length of other side: "+otherside+" cm");
        System.out.println("area of right angled triangle: "+area+" cm*2");
        
    }
}