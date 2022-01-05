import java.util.Scanner;
 class Test{
    String name;
    int marks;
    public void SetValues(){
        Scanner entry1 = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        this.name = entry1.nextLine();
        System.out.println("Enter Your Marks: ");
        this.marks = entry1.nextInt();
    }
    public void ShowValues(){
        System.out.println("Your Name is: "+ this.name);
        System.out.println("Your Marks are: "+ this.marks);
    }
}
public class TwoClasses{
    public static void main(String[] args) {
        Test student1 = new Test();
        
        student1.SetValues();
        student1.ShowValues();
    }
}