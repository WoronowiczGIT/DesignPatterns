package SDA.ObiektNULL.User;

public class EmployeeFactory {

    Employee getUser(String csv){
        String[] data = csv.split(";");
        try {
            String name = data[0];
            String lastName = data[1];
            Integer age = Integer.parseInt(data[2]);

            User user = new User(name,lastName,age);
            return user;

        }catch (NumberFormatException e){
            System.out.println("SumTingWong "+e);
            return new UserNULL();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("SumTingWong "+e);
            return new UserNULL();
        }

    }
}
