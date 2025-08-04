class FloorTile{
    public static void main(String args[]){
        int length=800,wide=900;
        int floorArea=length*wide;
        int tileSide=10,tileArea=tileSide*tileSide;
        int totalTile=floorArea/tileArea;
        System.out.println("Total no of tile required :"+totalTile);

    }
}