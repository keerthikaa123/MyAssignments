package Assignment4.Employee;

public class Employee {
     public void getEmployeeInfo(int id ) {
    	 System.out.println("Employee Id:  " +id);
     }
     public void getEmployeeInfo(String name) {
    	 System.out.println("Employee  Id:  "+name);
     }
     public void getEmployeeInfo(String email,  long phone) {
    	 
    	 System.out.println("Employee Email:  "+email+" phone No: "+phone);
    	 
     }
     public static void main(String [] args) {
     Employee empDetails=new Employee();
     empDetails.getEmployeeInfo(3456);
     empDetails.getEmployeeInfo("Keerthika");
     empDetails.getEmployeeInfo("Keerthika.msc2023@gmail.com",9384973765L);
     
    	 
    	 
    	 
     }
}
