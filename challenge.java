public class challenge {
    public static void main(String[] args) {
        int[][] chal = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(diagonalSum(chal));
    }

    static int diagonalSum(int[][] mat) {
        int prim = 0;
        int sec = 0;

        for (int i = 0; i < mat.length; i++) {

            if (i != (mat.length - i - 1)) {
                prim += mat[i][i];
                sec += mat[i][mat.length - i - 1];
            } else {
                prim += mat[i][i];
            }
        }
        int finalSum = prim + sec;
        return finalSum;
    }

}
