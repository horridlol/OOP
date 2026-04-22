class Employee{
    String empName,empDept;
    void displayDetails(){
        System.out.println("Employee name : "+empName+"\nEmployee Department : "+empDept);
    }
}
class Manager extends Employee{
    int tsize;
    String pname;
    @Override
    void displayDetails(){
        System.out.println("Employee name : "+empName+"\nEmployee Department : "+empDept);
        System.out.println("Manager team size : "+tsize+" Employees\nProject name : "+pname);
    }
}

public class prg15 {
    public static void main(String[] args) {
        Employee e=new Employee();
        Manager m=new Manager();
        e.empName="abc";
        e.empDept="comp";
        e.displayDetails();
        System.out.println("========================================");
        m.tsize=10;
        m.pname="some";
        m.displayDetails();
    }
}
