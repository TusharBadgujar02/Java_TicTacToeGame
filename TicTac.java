package bridgelabzTicTacToe;

public class TicTac {

	static char[] board;
	public static void main(String[] args) {
		System.out.println("TicTacToe Game");
		board = new char[8];
		TicTacBoard();
	}
public static void TicTacBoard() {
	System.out.println("|---|");
	System.out.println("|"+ board[1]+"|"+board[2]+"|");
	System.out.println("|---|");
	System.out.println("|"+ board[3]+"|"+board[4]+"|");
	System.out.println("|---|");
	System.out.println("|"+ board[5]+"|"+board[6]+"|");
	System.out.println("|---|");
	System.out.println("|"+ board[7]+"|"+board[8]+"|");

}
}

	