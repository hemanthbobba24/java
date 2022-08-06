class TicTacToe {
    char board[] = new char[8];
    int[] magicSquare = new int[]{4, 9, 2, 3, 5, 7, 8, 1, 6};

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.board = new char[]{' ', ' ', 'x',
                                     'o', 'x', 'o',
                                     'x', ' ', 'o'};
        ticTacToe.checkWinner();
    }

    void checkWinner() {
        if (hasWon('x')) System.out.println("x win!");
        else if (hasWon('o')) System.out.println("o win!");
        else System.out.println("No winner yet...");
    }

    boolean hasWon(char player) {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                for (int k = 0; k < 9; k++)
                    if (i != j && i != k && j != k)
                        if (board[i] == player && board[j] == player && board[k] == player)
                            if (magicSquare[i] + magicSquare[j] + magicSquare[k] == 15)
                                return true;
        return false;
    }
}