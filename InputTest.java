import java.util.Scanner;

public class InputTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        public static int condition;
        String Name;
        Scanner input = new Scanner(System.in);
        int i=1;
        do {
            System.out.println(i);
            // i++;
            
            System.out.println("Enter Your name:");
            Name = sc.nextLine();
            System.out.println("Your Name is :"+ Name);
            
            System.out.println("Do You Want to Continue[Y/N]: ");
            this.condition = sc.nextInt();
            System.out.println("you choose "+condition);
            
            System.out.print("Press 1 if you wana close or 0 to continue: ");
            i = input.nextInt();
        } while (i != 1);
        input.close();
    }
}