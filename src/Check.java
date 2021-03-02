public class Check {

    private static final int[] pieces= {1,2};
    private int[] board;
    private int count;
    public  Check(){
        board = new int[]{-1, -2, -3, -4, -5, -6, -7, -8, -9};
    count = 0;
    }
  public boolean test(){

      int m = 0;

      for (int i = 0 ; i < 3 ; i++) {

          if(board[i] == board[i+3] && board[i] == board[i+6]){
              return true;
          }
          if(board[m] == board[m+1] && board[m] == board[m+2]){
              return true;
          }
          m = m + 3;
      }

      if (board[0] == board[4] && board[4] == board[8]){
          return true;
      }

      if (board[2] == board[4] && board[4] == board[6]){
          return true;
      }

      return false;
  }
    public boolean setPosition(int index){
       if (board[index] == 'x' || board[index]== 'o'){
           return false;
       }
       board[index]=pieces[count%2];
       count++;
       return true;
    }
    public char getPiece(){
        if(count%2==0){
            return 'x';
        }
        return 'o';

    }

}

