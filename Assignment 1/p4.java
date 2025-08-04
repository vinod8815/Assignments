class Tile{
    public static void main(String[] args){
   int regionLength =520;
   int regionBradth =140;      
   int tileLength =13;
   int tileBradth =7;
   int regionArea =regionLength*regionBradth;
   int tileArea =tileLength*tileBradth;
   int numberofTile =regionArea/tileArea;
   System.out.println("Number of tiles required: "+numberofTile); 
    
}
}