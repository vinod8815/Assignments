class Ratio{
    public static void main(String args[]){
        double baseratio=8;
        double heightratio =5;
        double area=320;
        double x =(area/(baseratio*heightratio)/2);
        double base= 8*x;
        double height = 5*x;
        System.out.println("base of traingle: "+base+" meters");
        System.out.println("height of traingle: "+height+" meters");
    }
}