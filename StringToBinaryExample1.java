
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringToBinaryExample1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String StringInput;
        int i=1;

        // loop until user press 1 
        do {
            System.out.println("Enter Your Message:");
            StringInput = input.nextLine();

            String result = convertStringToBinary(StringInput);

            System.out.println("\nBinary Of Your Message :\n"+ result);
            System.out.println("\nPretty Print Binary Of Your Message:\n" + prettyBinary(result, 8, " "));

            System.out.print("\nPress 1 if you wana close or 0 to continue: ");
            i = input.nextInt();
        } while (i != 1);
        input.close();

    }

    //String To Binary Conversion
    public static String convertStringToBinary(String input) {

        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char inChar : chars) {
            result.append(
                    String.format("%8s", Integer.toBinaryString(inChar))  
                            .replaceAll(" ", "0")                         
            );
        }
        return result.toString();

    }

    //method to prettyfy the binary
    public static String prettyBinary(String binary, int blockSize, String separator) {

        List<String> result = new ArrayList<>();
        int index = 0;
        while (index < binary.length()) {
            result.add(binary.substring(index, Math.min(index + blockSize, binary.length())));
            index += blockSize;
        }

        return result.stream().collect(Collectors.joining(separator));
    }
}