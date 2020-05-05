public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Gigi","Brigi",-1);
        Employee employee2 = new Employee("Andrei", "Popescu", 100);

        //display employee1 information
        System.out.printf("Employee 1:\nFirst Name:%s\t LastName:%s\t Monthly Salary:$%s \t\n",employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary());
        System.out.println("Yearly Salary: $" + employee1.getYearlySalary());

       //give 10% raise to employee 1
       employee1.setMonthlySalary((0.1*employee1.getMonthlySalary()) + employee1.getMonthlySalary());
       System.out.println("\nCongrats! "+ employee1.getFirstName() +" "+ employee1.getLastName() +  "\nYou have been given a 10% raise. \nThis is your new yearly salary: $" + employee1.getYearlySalary());

        //display employee2 information
        System.out.printf("\n\nEmployee 2: \nFirst Name:%s\t LastName:%s\t Monthly Salary:%s\t\n",employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary());
        System.out.println("Yearly Salary: $" + employee2.getYearlySalary());

        //give 10% raise to employee 2
        employee2.setMonthlySalary((0.1*employee2.getMonthlySalary()) +employee2.getMonthlySalary());
        System.out.println("\nCongrats! "+ employee2.getFirstName() + " " + employee2.getLastName() +  "\nYou have been given a 10% raise. \nThis is your new yearly salary: $" + employee2.getYearlySalary());
    }
}

