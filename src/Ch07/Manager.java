package Ch07;

public class Manager extends Employee{
    private int bonus;
    // 부모클래스의 필드값의 초기화를 반드 해야함
    public Manager(String name, String address, int salary, int ssn, int bonus) {
        super(name, address, salary, ssn);
        this.bonus = bonus;
    }

    void test(){
        System.out.println("이름:"+name);
        System.out.println("주소:"+address);
        System.out.println("월급:"+salary);
//        System.out.println("주민번호:"+ssn);
        System.out.println("보너스:"+bonus);
    }
}