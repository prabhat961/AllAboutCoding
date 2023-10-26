package oops;

 class employee{
    int empId;
    String Name;
    static String Company = "Amazon";
    void show(){
        System.out.println(empId+" "+Name+" "+Company);
    }
    employee(int eId, String Name){
        this.empId = eId;
        this.Name = Name;
    }
}

public class constructor {
    public static void main(String[] args) {
        employee e1 = new employee(101, "Prabhat");
        employee e2 = new employee(102, "Chitra");
        employee e3 = new employee(103, "Deepak");
        employee e4 = new employee(104, "Monika");

        e1.show();
        e2.show();
        e3.show();
        e4.show();
    }
}
