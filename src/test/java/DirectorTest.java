import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Jim", 123456, 30000, "toy", 666666);
    }


    @Test
    public void hasName(){
        assertEquals("Jim", director.getName());
    }

    @Test
    public void hasNI(){
        assertEquals(123456, director.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, director.getSalary());
    }

    @Test
    public void hasDeptName() {
        assertEquals("toy", director.getDeptName());
    }


    @Test
    public void canRaiseSalary () {
        this.director.raiseSalary(10000);
        assertEquals(40000, director.getSalary());
    }

    @Test
    public void canNotRaiseSalary () {
        this.director.raiseSalary(-10000);
        assertEquals(30000, director.getSalary());
    }

    @Test
    public void canChangeName () {
        this.director.setName("Phoebus");
        assertEquals("Phoebus", this.director.getName());
    }

    @Test
    public void canNotChangeNameIfNull () {
        this.director.setName(null);
        assertEquals("Jim", this.director.getName());
    }

    @Test
    public void canNotChangeNameIfEmpty () {
        this.director.setName("");
        assertEquals("Jim", this.director.getName());
    }
    
    @Test
    public void hasBudget(){
        assertEquals(666666, this.director.getBudget(),0.001);
    }
}
