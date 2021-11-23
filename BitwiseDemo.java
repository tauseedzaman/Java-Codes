import java.time.format.TextStyle;

public class BitwiseDemo {
    static int Test1(){
        byte b1 = 12; // 00001100
        byte result = (byte) (b1 << 3);
        str = String.format("%8s", Integer.toBinaryString(result & 0xFF)).replace(' ', '0');
        return result; // 01100000
    }
    public static void main(String... args) {
        System.out.println(Test1());
        // String Name = "Aaa";
        // byte b1 = 117; // 01110101
        // byte b2 = 95; // 01011111
        // byte number = (Name.hashCode());
        // System.out.println(number.toBinaryString());
        // Name.forEach(i -> System.out.println(i));
        // byte result = (byte) (b1 | b2); // 01111111
        // System.out.println("b1:" + b1);
        // System.out.println("b2:" + b2);
        // System.out.println("---------");
        // String str = String.format("%8s", Integer.toBinaryString(TestResult & 0xFF)).replace(' ', '0');
        // String str = String.format("%8s", Integer.toBinaryString(result & 0xFF)).replace(' ', '0');
        // System.out.println("result: " + result);
        // System.out.println("binary result: " + str);
    }
}