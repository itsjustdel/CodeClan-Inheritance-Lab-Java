import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jim", 123456, 30000);
    }


    @Test
    public void hasName(){
        assertEquals("Jim", databaseAdmin.getName());
    }

    @Test
    public void hasNI(){
        assertEquals(123456, databaseAdmin.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, databaseAdmin.getSalary());
    }


    @Test
    public void canRaiseSalary () {
        this.databaseAdmin.raiseSalary(10000);
        assertEquals(40000, databaseAdmin.getSalary());
    }

    @Test
    public void canNotRaiseSalary () {
        this.databaseAdmin.raiseSalary(-10000);
        assertEquals(30000, databaseAdmin.getSalary());
    }

    @Test
    public void canChangeName () {
        this.databaseAdmin.setName("Phoebus");
        assertEquals("Phoebus", this.databaseAdmin.getName());
    }

    @Test
    public void canNotChangeNameIfNull () {
        this.databaseAdmin.setName(null);
        assertEquals("Jim", this.databaseAdmin.getName());
    }

    @Test
    public void canNotChangeNameIfEmpty () {
        this.databaseAdmin.setName("");
        assertEquals("Jim", this.databaseAdmin.getName());
    }
}
