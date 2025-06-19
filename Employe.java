public class Employe{
    int id;
    String name;
    float salary;
    String designation;
    public static void main(String [] args){
       Employe emp=new Employe();
emp.id=101;
emp.name="mouni";
emp.salary=10000.0f;
emp.designation="Java learner";
System.out.println("Id : "+emp.id);
System.out.println("Name : "+emp.name);
System.out.println("Salary : "+emp.salary);
System.out.println("Designation : "+emp.designation);

System.out.println("---------------------------------");
Employe emp1=new Employe();
emp1.id=102;
emp1.name="vedvi";
emp1.salary=20000.0f;
emp1.designation="Java learner";
System.out.println("Id :" +emp1.id);
System.out.println("Name : "+emp1.name);
System.out.println("Salary : "+emp1.salary);
System.out.println("Designation : "+emp1.designation);


    }
}

