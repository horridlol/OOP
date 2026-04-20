import java.util.*;
class Employee{
    private String employeeName;
    private double employeeSalary;
    public void readEmployeeData(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter employee name : ");
        this.employeeName=s.nextLine();
        System.out.println("Enter employee salary : ");
        this.employeeSalary=s.nextDouble();
    }
    public void displayEmployeeData(){
        System.out.println("Employee name : "+employeeName);
        System.out.println("Employee Salary : "+employeeSalary);
    }
}
public class prg7 {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.readEmployeeData();
        e.displayEmployeeData();
    }
}