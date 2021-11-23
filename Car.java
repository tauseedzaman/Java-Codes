public class Car {
    protected String brand = "BMW";
    public void horn(){
        System.out.println("Horn");
    }
    
}

class SModel extends Car{
    private String Model_name = "BMS-2";
    public static void main(String[] args) {
        SModel model = new SModel();
        model.horn();
        System.out.println(model.brand+ " "+model.Model_name);
    }
}