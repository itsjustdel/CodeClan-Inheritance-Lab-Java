import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Jim", 123456, 30000);
    }


    @Test
    public void hasName(){
        assertEquals("Jim", developer.getName());
    }

    @Test
    public void hasNI(){
        assertEquals(123456, developer.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, developer.getSalary());
    }


    @Test
    public void canRaiseSalary () {
        this.developer.raiseSalary(10000);
        assertEquals(40000, developer.getSalary());
    }

    @Test
    public void canNotRaiseSalary () {
        this.developer.raiseSalary(-10000);
        assertEquals(30000, developer.getSalary());
    }

    @Test
    public void canChangeName () {
        this.developer.setName("Phoebus");
        assertEquals("Phoebus", this.developer.getName());
    }

    @Test
    public void canNotChangeNameIfNull () {
        this.developer.setName(null);
        assertEquals("Jim", this.developer.getName());
    }

    @Test
    public void canNotChangeNameIfEmpty () {
        this.developer.setName("");
        assertEquals("Jim", this.developer.getName());
    }
}