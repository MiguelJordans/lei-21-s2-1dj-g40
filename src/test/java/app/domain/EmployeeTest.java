package app.domain;

import org.junit.Assert;
import org.junit.Test;


public class EmployeeTest {

//CheckNameRules


    @Test(expected = IllegalArgumentException.class)
    public void checkNameBlank() {

        Employee emp = new Employee("", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567", "specialistdoctor", "123456");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameTooManyChars() {

        Employee emp = new Employee("FirstClinicalAnalysisLaboratory", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567", "specialistdoctor", "123456");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameNotOnlyLetters() {

        Employee emp = new Employee("651fvs6ef","3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567", "specialistdoctor", "123456");
    }

//CheckDoctorIndexNumber

    @Test(expected = IllegalArgumentException.class)
    public void checkDOCBlank(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567", "specialistdoctor", "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDOCSize(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567", "specialistdoctor", "12345678");
    }

    @Test
    public void checkDOC(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567", "employee", "123456");

    }

//CheckOrgRole

    @Test(expected = IllegalArgumentException.class)
    public void checkORBlank(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567", "", "123456");

    }

    @Test
    public void checkORTypes(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567", "specialistdoctor", "123456");
    }

    @Test
    public void checkORTypes2(){
        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567", "employee", "123456");

    }

    @Test (expected = IllegalArgumentException.class)
    public void checkORChar(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567", "1", "123456");
    }

//CheckAddressRules

    @Test (expected = IllegalArgumentException.class)
    public void checkAdBlank(){

        Employee emp = new Employee("Daniel", "", "dasc@gmail.com","01492235687", "DASC00001","1234567", "specialistdoctor", "123456");
    }

    @Test (expected = IllegalArgumentException.class)
    public void checkAdLength(){

        Employee emp = new Employee("Daniel", "3425 Stone Street 12345678901234567", "dasc@gmail.com","01492235687", "DASC00001","1234567", "specialistdoctor", "123456");
    }


//ChekEmailRules

    @Test (expected = IllegalArgumentException.class)
    public void checkEmailBlank(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "","01492235687", "DASC00001","1234567", "specialistdoctor", "123456");

    }

    @Test (expected = IllegalArgumentException.class)
    public void checkEmailIsInvalid(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "Not an email","01492235687", "DASC00001","1234567", "specialistdoctor", "123456");
    }

//CheckPhoneNumberRules

    @Test (expected = IllegalArgumentException.class)
    public void checkPhoneNumberBlank() {

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","", "DASC00001","1234567", "specialistdoctor", "123456");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberTooManyChars() {

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","014922356871234123", "DASC00001","1234567", "specialistdoctor", "123456");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberNotOnlyNumbers() {

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","0d149a5b687", "DASC00001","1234567", "specialistdoctor", "123456");
    }



//CheckEmployeeIDRules

    @Test (expected = IllegalArgumentException.class)
    public void checkEmpIDBlank() {

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "","1234567", "specialistdoctor", "123456");

    }

    @Test (expected = IllegalArgumentException.class)
    public void checkEmpIDLength(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC000011234","1234567", "specialistdoctor", "123456");

    }


//CheckSOCCode
    @Test (expected = IllegalArgumentException.class)
    public void checkSOCBlank(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","", "specialistdoctor", "123456");

    }

    @Test (expected = IllegalArgumentException.class)
    public void checkSOCLength(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567123", "specialistdoctor", "123456");

    }

    @Test (expected = IllegalArgumentException.class)
    public void checkSOCIsInvalid(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","a234567", "specialistdoctor", "123456");

    }


    //setters
    @Test
    public void setDoctorIndexNumber() {
        //Arrange
        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","specialistdoctor","123456");

        //Act
        String expected = "123456";
        emp.setDoctorIndexNumber(expected);

        //Assert
        String actual = emp.getDoctorIndexNumber();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setOrgRole() {
        //Arrange
        Employee emp = new Employee("FirstCal", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","specialistdoctor","123456");

        //Act
        String expected = "specialistdoctor";
        emp.setOrgRole(expected);

        //Assert
        String actual = emp.getOrgRole();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        //Arrange
        Employee emp = new Employee("FirstCal", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","employee","123456");

        //Act
        String expected = "SecondCal";
        emp.setName(expected);

        //Assert
        String actual = emp.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAddress() {
        //Arrange
        Employee emp = new Employee("DanielCosta", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","specialistdoctor","123456");

        //Act
        String expected = "3426 Stone Street";
        emp.setAddress(expected);

        //Assert
        String actual = emp.getAddress();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setEmail() {
        //Arrange
        Employee emp = new Employee("DanielCosta", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","specialistdoctor","123456");

        //Act
        String expected = "dasc@gmail.com";
        emp.setEmail(expected);

        //Assert
        String actual = emp.getEmail();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setPhoneNumber() {
        //Arrange
        Employee emp = new Employee("DanielCosta", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","specialistdoctor","123456");

        //Act
        String expected = "01492235687";
        emp.setPhoneNumber(expected);

        //Assert
        String actual = emp.getPhoneNumber();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setEmployeeId() {
        //Arrange
        Employee emp = new Employee("DanielCosta", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","specialistdoctor","123456");

        //Act
        String expected = "DASC00001";
        emp.setEmployeeId(expected);

        //Assert
        String actual = emp.getEmployeeId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setSocCode() {
        //Arrange
        Employee emp = new Employee("DanielCosta", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","specialistdoctor","123456");

        //Act
        String expected = "1234567";
        emp.setSocCode(expected);

        //Assert
        String actual = emp.getSocCode();
        Assert.assertEquals(expected, actual);
    }


    //getters
    @Test
    public void getDoctorIndexNumber(){

        Employee emp = new Employee("DanielCosta", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","specialistdoctor","123456");


        String expected = "123456";

        String actual = emp.getDoctorIndexNumber();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getName(){

        Employee emp = new Employee("DanielCosta", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","specialistdoctor","123456");

        String expected = "DanielCosta";

        String actual = emp.getName();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getAdress(){

        Employee emp = new Employee("DanielCosta", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","specialistdoctor","123456");

        String expected = "3425 Stone Street";

        String actual = emp.getAddress();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getEmail(){

        Employee emp = new Employee("DanielCosta", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","specialistdoctor","123456");

        String expected = "dasc@gmail.com";

        String actual = emp.getEmail();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getPhoneNumber(){

        Employee emp = new Employee("DanielCosta", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","specialistdoctor","123456");

        String expected = "01492235687";

        String actual = emp.getPhoneNumber();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getEmployeeId(){

        Employee emp = new Employee("DanielCosta", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","specialistdoctor","123456");

        String expected = "DASC00001";

        String actual = emp.getEmployeeId();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getSocCode(){

        Employee emp = new Employee("DanielCosta", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567","specialistdoctor","123456");

        String expected = "1234567";


        String actual = emp.getSocCode();
        Assert.assertEquals(expected, actual);

    }


}