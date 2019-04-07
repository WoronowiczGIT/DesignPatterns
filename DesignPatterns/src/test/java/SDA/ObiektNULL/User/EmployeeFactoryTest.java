package SDA.ObiektNULL.User;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    @Test
    public void check_if_factory_returns_userNULL_in_case_of_incorrect_data() {
        //BDD behavior driven development
        //given -> przygotowanie
        EmployeeFactory factory = new EmployeeFactory();
        //when -> interakcja
        Employee user = factory.getUser("incorrect data");
        //then - >
        Assert.assertNotNull(user);
        Assert.assertTrue(user instanceof UserNULL);

    }
}