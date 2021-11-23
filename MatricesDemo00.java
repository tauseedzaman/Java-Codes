public class MatricesDemo00 {
 public static void main(String... args) {
 // bi-dimensional array: 2 rows, 2 columns
 int[][] intMatrix = {
     {1, 0}, 
     {0, 1}
    };
 int[][] intMatrix2 = new int[2][2];
 for (int i = 0; i < intMatrix2.length; ++i) {
 for (int j = 0; j < intMatrix2[i].length; ++j) {
 intMatrix2[i][j] = i + j;
 System.out.print(intMatrix[i][j] + " ");
 }
 System.out.println();
 }
 }
}