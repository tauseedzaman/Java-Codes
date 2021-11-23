import java.util.Scanner;

public class InputTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        public static int condition;
        String Name;

        do{
            System.out.println("Enter Your name:");
            Name = sc.nextLine();
            System.out.println("Your Name is :"+ Name);
            
            System.out.println("Do You Want to Continue[Y/N]: ");
            this.condition = sc.nextInt();
            System.out.println("you choose "+condition);

        }while(condition == 1);
    }
}