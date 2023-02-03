package Ch07;

public class Employee {
    public String name;     //이름
    String address;         //주소
    protected int salary;   //월급
    private int ssn;        //주민번호(Social Security Number)

    public Employee(String name, String address, int salary, int ssn) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", ssn=" + ssn +
                ']';
    }
}