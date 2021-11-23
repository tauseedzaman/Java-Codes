public class MatricesDemo {
 public static void main(String... args) {
 // cubical matrix, with three coordinates
 int[][][] intMatrix3 = new int[2][2][2];

 for (int i = 0; i < intMatrix3.length; ++i) {

    for (int j = 0; j < intMatrix3[i].length; ++j) {

        for (int k = 0; k < intMatrix3[i][j].length; ++k) {

            intMatrix3[i][j][k] = i + j + k;

            System.out.print("["+i+", "+j+", " + k + "]");
        }
        System.out.println();
    }
    System.out.println();
}
}
}