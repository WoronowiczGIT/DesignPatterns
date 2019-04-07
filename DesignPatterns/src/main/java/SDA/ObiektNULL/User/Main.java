package SDA.ObiektNULL.User;

import java.util.HashMap;
import java.util.Map;

public class Main {
    // Obiekt NULL -> pusty szablon który będzie wskakiwał w miejsce obiektu kiedy bedzie zwracał null

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        Integer a = map.get(2);
        System.out.println(a);

        EmployeeFactory factory = new EmployeeFactory();
        Employee user = factory.getUser("sdf");
        System.out.println(user.toString());

    }
}
