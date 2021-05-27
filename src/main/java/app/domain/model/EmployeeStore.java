package app.domain.model;

import java.util.ArrayList;
import java.util.List;


public class EmployeeStore {

    List <Employee> employeeList;
    Employee emp;

    private static int employeeN;

    /**
     * Constructor
     */
    public EmployeeStore(){this.employeeList = new ArrayList<>();}

    /**
     * Creates an instance of an Employee.
     *
     * @param name                   - the Employee's name
     * @param address                - the Employee's address
     * @param email                  - the Employee's email
     * @param phoneNumber            - the Employee's phone number
     * @param socCode                - the Employee's SOC Code
     * @param orgRole                - the Employee's organization role
     */

    public Employee NewEmployee (String name, String address, String email, String phoneNumber, String socCode, String orgRole){

        String ID = generateEmployeeID(name);

        return this.emp = new Employee(name, address, email, phoneNumber, ID, socCode, orgRole);
    }

    /**
     * Validates an instance of an Employee.
     *
     * @param emp - the object Employee
     * @return the validation of the Employee being created
     */

    public boolean validateEmployee (Employee emp){

        if (emp == null || listContain(emp)){
            return false;
        }
        return true;

    }

    /**
     *
     * Checks if the new object Employee is already in the list.
     *
     *
     *
     * @param emp - the object Employee
     * @return true if the list contains the Employee and false if it doesn't
     */

    public boolean listContain(Employee emp){
        if(this.employeeList.contains(emp)){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Saves an instance of Employee
     *
     * @return the saving of an instance of a Employee
     */

    public boolean saveEmployee(){
        if(validateEmployee(this.emp)){
            listAdd(emp);
            return true;
        } else {
            return false;
        }

    }

    /**
     * Adds an instance of Employee to the list
     *
     *
     * @param emp - the object Employee
     * @return the addition of Employee to the list
     */

    public boolean listAdd(Employee emp){
        employeeList.add(emp);
        return true;
    }


    /**
     * Replaces the element at the specified position in the list with the specified element.
     *
     * @param i - the index of the element to replace
     * @return the element previously at the specified position
     */

    public Employee getEmployee (int i){
        return employeeList.get(i);
    }


    /**
     * Gets Employee from the list.
     *
     *
     * @return the Employee requested
     */

    public Employee getEmp (){
        return emp;
    }


    public List<Employee> getEmployeeList() {
        return this.employeeList;
    }

    public String generateEmployeeID(String name){

        String employeID;
        StringBuilder chars = new StringBuilder();

        String[] idName = name.split("");

        for(String s : idName){
            chars.append(s.charAt(0));
        }
        employeID = chars + String.format("%05d",employeeN);

        return employeID;
    }

}
