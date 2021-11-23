import java.util.*;
public class AI_Test {
    public static int calculateAge(int yearOfBirth){
    int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    int age = currentYear - yearOfBirth;
    return age;
    }

    public static void main(String[] args) {
        System.out.println("Enter Your Birth Date: \b");
        Scanner input = new Scanner(System.in);
        int d0b = input.nextInt();
        int age = calculateAge(d0b);
        System.out.println("Your Age is " + age);
    }   
}
