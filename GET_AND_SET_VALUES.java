public class GET_AND_SET_VALUES {
    String Name;
    int age;
    String Address;
    
    // set value for name or set value of name ;)
    public String Set_name(String input_name){
        Name = input_name;
        return Name;
    }

    // set value of age
    public int Set_age(int input_age){
        age = input_age;
        return age;
    }
    
    // set value of address
    public String Set_address(String input_address){
        Address = input_address;
        return Address;
    }

    // now get these values using functions 
    public void Show_Details(){
        System.out.println("\t----------------Details---------------------");
        System.out.println("Student Name: "+Name);
        System.out.println("Student Age: "+age);
        System.out.println("Student Address: "+Address);
    }






    public static void main(String[] args) {
        GET_AND_SET_VALUES student_1 = new GET_AND_SET_VALUES();
        student_1.Set_name("Tauseed");
        student_1.Set_age(60);
        student_1.Set_address("Pakistan ");
        student_1.Show_Details();
    }
}
