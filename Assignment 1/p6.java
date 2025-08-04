class Triangle{
    public static void main(String args[]){
        int a =10;
        int b =9;
        int perameter =36;
        int c =perameter-(a+b);
        float s =(float)(a+b+c)/2;
        float area =(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Third side(c):"+c+"meter");
        System.out.println("Area of the triangle:"+area+ "cm");

    }
}  