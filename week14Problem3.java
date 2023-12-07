package week14;

public class week14Problem3 {

    public static void main(String[] args) {
        String[][] board1 = {
                {"5", "3", ".", ".", "7", ".", ".", ".", "."},
                {"6", ".", ".", "1", "9", "5", ".", ".", "."},
                {".", "9", "8", ".", ".", ".", ".", "6", "."},
                {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
                {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
                {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
                {".", "6", ".", ".", ".", ".", "2", "8", "."},
                {".", ".", ".", "4", "1", "9", ".", ".", "5"},
                {".", ".", ".", ".", "8", ".", ".", "7", "9"}
        };

        System.out.println("Board 1: " + isValidSudoku(board1)); 

        String[][] board2 = {
                {"8", "3", ".", ".", "7", ".", ".", ".", "."},
                {"6", ".", ".", "1", "9", "5", ".", ".", "."},
                {".", "9", "8", ".", ".", ".", ".", "6", "."},
                {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
                {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
                {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
                {".", "6", ".", ".", ".", ".", "2", "8", "."},
                {".", ".", ".", "4", "1", "9", ".", ".", "5"},
                {".", ".", ".", ".", "8", ".", ".", "7", "9"}
        };

        System.out.println("Board 2: " + isValidSudoku(board2)); 
    }

    public static boolean isValidSudoku(String[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(board, i) || !isValidColumn(board, i) || !isValidBox(board, i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidRow(String[][] board, int row) {
        boolean[] seen = new boolean[9];
        for (int j = 0; j < 9; j++) {
            if (!isValidCell(board[row][j], seen)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidColumn(String[][] board, int col) {
        boolean[] seen = new boolean[9];
        for (int i = 0; i < 9; i++) {
            if (!isValidCell(board[i][col], seen)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidBox(String[][] board, int box) {
        boolean[] seen = new boolean[9];
        int startRow = 3 * (box / 3);
        int startCol = 3 * (box % 3);

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (!isValidCell(board[i][j], seen)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValidCell(String value, boolean[] seen) {
        if (value.equals(".")) {
            return true;
        }

        int num = Integer.parseInt(value);
        if (num < 1 || num > 9 || seen[num - 1]) {
            return false;
        }

        seen[num - 1] = true;
        return true;
    }
}
