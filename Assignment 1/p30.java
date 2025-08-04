class BedRoom{
    public static void main(String args[]){
        int length=200 ,wide=400;
        int floorArea=length*wide;
        int tileLength=5, tileBre=8;
       int tileArea=tileLength*tileBre;
       int totalTiles=floorArea/tileArea;
       System.out.println("Total no of tiles required :"+totalTiles);

    }
}