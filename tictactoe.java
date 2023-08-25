import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args)
    {
         char[][] board=new char[3][3];
         for(int r=0;r<board.length;r++)
         {
             for(int c=0;c<board[r].length;c++)
             {
                 board[r][c]=' ';
             }
         }
         char player='X';
         boolean gameover=false;
         Scanner sc=new Scanner(System.in);
         while(!gameover)
         {
             printBoard(board);
         System.out.println("Player" +" "+ player+" " + "enter:");
         int r=sc.nextInt();
         int c=sc.nextInt();

         if(board[r][c]==' ')
         {
             board[r][c]=player;
             gameover=haveWON(board,player);
           if(gameover)
           {
               System.out.println("Player" +" "+ player+" " + "has won:");
           }
           else{
               if(player=='X')
               {
                 player = 'O';
               }
               else{
                   player='X';
               }
            }
         }
         else{
             System.out.println("Invalid move. Try again!");

         }
         }
         printBoard(board);
    }
    public static boolean haveWON(char [][] board ,char player) {
        //check the rows
        for (int r = 0; r < board.length; r++) {
            if (board[r][0] == player && board[r][1] == player && board[r][2] == player) {
                return true;

            }
        }
        //chcek for column
        for (int c = 0; c < board.length; c++) {
            if (board[0][c] == player && board[1][c] == player && board[2][c] == player) {
                return true;
            }
        }
        //diagonal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;

        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;

        }
        return false;


    }
    public static void printBoard(char[][] board)
    {
        for(int r=0;r<board.length;r++)
        {
            for(int c=0;c<board[r].length;c++)
            {
                System.out.print(board[r][c] + " | ");
            }
            System.out.println();
        }
    }
}
