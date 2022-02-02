import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jim", 123456, 30000, "toy");
    }


    @Test
    public void hasName(){
        assertEquals("Jim", manager.getName());
    }

    @Test
    public void hasNI(){
        assertEquals(123456, manager.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, manager.getSalary());
    }

    @Test
    public void hasDeptName() {
        assertEquals("toy", manager.getDeptName());
    }


    @Test
    public void canRaiseSalary () {
        this.manager.raiseSalary(10000);
        assertEquals(40000, manager.getSalary());
    }

    @Test
    public void canNotRaiseSalary () {
        this.manager.raiseSalary(-10000);
        assertEquals(30000, manager.getSalary());
    }

    @Test
    public void canChangeName () {
        this.manager.setName("Phoebus");
        assertEquals("Phoebus", this.manager.getName());
    }

    @Test
    public void canNotChangeNameIfNull () {
        this.manager.setName(null);
        assertEquals("Jim", this.manager.getName());
    }

    @Test
    public void canNotChangeNameIfEmpty () {
        this.manager.setName("");
        assertEquals("Jim", this.manager.getName());
    }
}
