public class Employee {
    String firstName; // instance variable
    String lastName; // instance variable
    double monthlySalary; // instance variable

    //created Employee constructor that initializes three variables
    public Employee(String fName, String lName, double monthSalary ) {
        setFirstName(fName);
        setLastName(lName);
        setMonthlySalary(monthSalary);
    }

    //create get method for firstName
    public String getFirstName() {
        return firstName;
    }

    //create get method for lastName
    public String getLastName() {
        return lastName;
    }

    // create get method for monthlySalary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    //created get yearlySalary Method
    public double getYearlySalary(){
       return  monthlySalary*12;
    }

    //create set method for firstName
    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    //create set method for lastName
    public void setLastName(String lName) {
        this.lastName = lName;
    }

    //create set method for monthlySalary
    public void setMonthlySalary(double monthSalary) {
        if(monthSalary > 0) {
            monthlySalary = monthSalary;
        } else {
            monthlySalary = 0.0;
        }
    }
}
