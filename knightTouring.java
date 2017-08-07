public class Main{
    public static final int BOARD_SIZE = 8;
    public static final char symbol = '#';
    public static final char notAvailable = 'X';
    public static int[] startPosition = new int[2];
    public static char[][] moves = new char[BOARD_SIZE][BOARD_SIZE];
    public static final int[] xMoves = {2, 1, -1, -2, -2, -1, 1, 2};
    public static final int[] yMoves = {-1, -2, -2, -1, 1, 2, 2, 1};
    public static int hMove;
    public static int vMove;
    public static int successfulMoves = 0;
  public static void main(String[] args){
    
    boolean isOver = false; 
    populateArray();//populates array with default values
    startPosition[0]= (int)(Math.random()*BOARD_SIZE);//sets the initial row
    startPosition[1]= (int)(Math.random()*BOARD_SIZE);//set the initial column
    moves[startPosition[0]][startPosition[1]]=notAvailable;//fills in an 'x' for that particular cell
    while(!isOver){
      isOver = MakeMove();
    }
    //check if all blocks are filled after each
    displayGrid();
    
  }
  
  public static boolean areBlocksFilled(){//determines whether or not the blocks/cells are filled
    boolean blocksRFilled = true;
    for(int i = 0 ; i < BOARD_SIZE; i++){
      for(int j = 0 ; j < BOARD_SIZE; j++){
        if(moves[i][j] != symbol){
          successfulMoves++;
        }else{
          blocksRFilled = false;
        }
      }
    }
    return blocksRFilled; 
  }
  
  public static boolean MakeMove(){
    for(int i = 0; i < 8; i++){
      if(!getMove()){
        return true; 
      }
      
    }
    return false;
  }
  
  public static boolean getMove(){
    int badMoveCounter=0;
    int[] badMoves= new int[BOARD_SIZE];//captures values of bad moves
    while(badMoveCounter<8){
      int randomMove = (int)(Math.random()*BOARD_SIZE);
      hMove = startPosition[0]+ xMoves[randomMove];
      vMove = startPosition[1]+ yMoves[randomMove];
      //logic to determine whether or not the moves generated are valid. 
      if((hMove < BOARD_SIZE) &&  (hMove >=0) && (vMove < BOARD_SIZE && vMove >=0)&&(moves[hMove][vMove] != notAvailable)){
        moves[hMove][vMove]=notAvailable;
        startPosition[0]=hMove;
        startPosition[1]=vMove;
      }else{
        //check if the move is already in bad moves, if it is then the move was already made. 
        boolean moveAlreadyMade = false;
        for(int i = 0;  i < BOARD_SIZE; i++){
          if(randomMove == badMoves[i]){//checks badmoves array 
            moveAlreadyMade = true;
            
          }
          
            
        }
        
        if(!moveAlreadyMade){
            badMoves[badMoveCounter] = randomMove;
            badMoveCounter++;
        }
      }
      
    }
   return false; 
  }
    
    
  
  
  public static void displayGrid(){
      
      
      for(int r = 0; r < BOARD_SIZE; r++){
          
        for(int c = 0; c < BOARD_SIZE; c++){
          System.out.print(moves[r][c]+ " ");
          
          
        }
        System.out.println();
      }
    }
  
  
  public static void populateArray(){
    for(int i = 0; i <BOARD_SIZE; i++){
      for(int j = 0; j <BOARD_SIZE; j++){
        moves[i][j] = symbol;
      }
    }
  }
}