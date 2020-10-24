package constructor;

public class ConsstructorExample1 {
    int empId ;
    String name ;

    public ConsstructorExample1(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }
    public static void main(String[] args) {
        ConsstructorExample1 obj = new ConsstructorExample1(10,"Prime");
        printEmployeeDetails(obj.empId,obj.name);
        ConsstructorExample1 obj1 = new ConsstructorExample1(20,"Prime1");
        printEmployeeDetails(obj1.empId,obj1.name);

    }
    public static void printEmployeeDetails(int empId, String name){
        System.out.println(empId);
        System.out.println(name);

    }
}
