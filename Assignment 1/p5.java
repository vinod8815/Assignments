class ParkFence{
    public static void main(String args[]){
        int cost =1600;
        int length =20;
        int rate =25;
        int perameter =cost/rate;
        int breadth =(perameter/2)-length;
        int Area = length*breadth;
        System.out.println("breadth of park:"+breadth +"meter");
          System.out.println("area of park:"+Area +"meter");
           System.out.println( "perameter of park:"+perameter+"squqre meters");
    
    }
}