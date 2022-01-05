import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=1;
        do {
            System.out.println(i);
            System.out.print("Press 1 if you wana close: ");
            i = input.nextInt();
            // i++;
        } while (i != 1);
        input.close();
    }
}
