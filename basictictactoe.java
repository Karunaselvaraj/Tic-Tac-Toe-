import java.util.*;
public class tictactoegame {
    public static void main(String[] args) {
        char board[][]=new char[3][3];
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board.length;col++){
                board[row][col]=' ';
            }
        }
        char player='X';
        int f=0;
        boolean empty = true;
        while(true){
            printboard(board,player);
            System.out.println("Player "+player+" : ");
            Scanner in =new Scanner(System.in);
            int r=in.nextInt();
            int c=in.nextInt();
            if(board[r][c]==' '){
                board[r][c]=player;
                f++;
                boolean check = checkboard(board,player);
                if(check){
                    printboard(board, player);
                    System.out.println("Player"+player+": Won");
                    break;
                }
                else if(f==9){
                    printboard(board, player);
                    System.out.println("Match Drawn");
                    break;
                }
                else{
                    player=(player=='X')? 'O':'X';
                }
            }
            else{
                System.out.println("invalid input");
            }
        }
    }
    public static void printboard(char [][] board,char player){
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board.length;col++){
                System.out.print(board[row][col]+" | ");
            }
            System.out.println();
        }
    }
    public static boolean checkboard(char [][] board,char player){
        for(int row=0;row<board.length;row++){
            if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
                return true;
            }
        }
        for(int col=0;col<board.length;col++){
            if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
                return true;
            }
        }
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player ){
            return true;
        }
        if(board[0][2] ==player && board[1][1]==player && board[2][0]==player){
            return true;
        }
        return false;
    }
}
