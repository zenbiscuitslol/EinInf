public class Sudoku {
    public static void main(String args[]) {
        int[][] sudoku = {
                {1, 7, 9, 8, 6, 3, 2, 5, 4},
                {5, 3, 4, 1, 7, 2, 6, 9, 8},
                {8, 6, 2, 9, 4, 5, 3, 1, 7},
                {3, 5, 6, 4, 9, 7, 8, 2, 1},
                {9, 1, 8, 3, 2, 6, 4, 7, 5},
                {4, 2, 7, 5, 1, 8, 9, 6, 3},
                {6, 8, 3, 2, 5, 1, 7, 4, 9},
                {7, 4, 5, 6, 3, 9, 1, 8, 2},
                {2, 9, 1, 7, 7, 4, 5, 3, 6} //7 repeats twice in coloumn 5
        };
        System.out.println(checksudoku(sudoku));
    }

    public static boolean checkcoloumn(int[][] sudoku, int coloumn) {
        boolean[] check = new boolean[10];
        for (int i = 0; i < 9; i++) {
            int a = sudoku[i][coloumn];
            if (a != 0 && check[a]) {
                return false;
            }
            check[a] = true;
        }
        return true;
    }

    public static boolean checkrow(int[][] sudoku, int row) {
        for (int i = 0; i < 9; i++) {
            boolean[] check = new boolean[10];
            int a = sudoku[row][i];
            if (a != 0 && check[a]) {
                return false;
            }
            check[a] = true;
        }
        return true;
    }

    public static boolean check3x3(int[][] sudoku, int row, int coloumn) {
        boolean[] check = new boolean[10];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = sudoku[row + i][coloumn + j];
                if (num != 0 && check[num]) {
                    return false;
                }
                check[num] = true;
            }
        }
        return true;
    }

    public static boolean checksudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            if (!checkrow(sudoku, i) || !checkcoloumn(sudoku, i)) {
                return false;
            }
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!check3x3(sudoku, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }
}