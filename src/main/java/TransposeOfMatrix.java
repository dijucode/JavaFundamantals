public class TransposeOfMatrix {


    static int[][] matrix = {{1, 2, 3},
                             {4, 5, 6},
                             {7, 8, 9}};

    public static void main(String[] args) {



//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = i; j < matrix.length; j++) {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}