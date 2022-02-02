package Staff;

public abstract class Employee {
    private String name;
    private int NI, salary;

    public Employee(String name, int NI, int salary){
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && name != "") {
            this.name = name;
        }
    }

    public int getNI() {
        return NI;
    }

    public void setNI(int NI) {
        this.NI = NI;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(double amount){
        if(amount > 0 ) {
            this.salary += amount;
        }
    }

    public double payBonus(){
        return  salary * 0.01;
    }
}
