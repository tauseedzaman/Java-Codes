import java.lang.Thread.State;
import java.util.List;
public class Listsss {
    public static void main(String[] args) {
        List<String> items = List.of("1","2","3","a","A","4","5","6","7","8","9");
        items.forEach(item -> {
            if (item == "a") {
                System.out.println("THis is a");
            } else {
                System.out.println("Not a");
            }
        });
    }
    
}
