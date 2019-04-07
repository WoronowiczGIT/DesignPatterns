package SDA.ObiektNULL.User;

public class UserNULL implements Employee {
        private String name = "";
        private String lastName = "";
        private int age = Integer.MIN_VALUE;

        @Override
        public String toString() {
                return "UserNULL{" +
                        "name='" + name + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", age=" + age +
                        '}';
        }
}
