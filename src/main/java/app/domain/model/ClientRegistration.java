package app.domain.model;

import org.apache.commons.lang3.StringUtils;

public class ClientRegistration {

    private String name;
    private String email;
    private String sex;
    private String birthdate;
    private long citizenCardNumber;
    private long phoneNumber;
    private long tinNumber;
    private long nhsNumber;


    public ClientRegistration (String name, String email, String sex, String birthdate, long citizenCardNumber, long phoneNumber, long tinNumber, long nhsNumber){

        checkNameRules(name);
        checkEmailRules(email);
        checkSexRules(sex);
        checkBirthdateRules(birthdate);
        checkCitizenCardNumberRules(citizenCardNumber);
        checkPhoneNumberRules(phoneNumber);
        checkTINNumberRules(tinNumber);
        checkNHSNumberRules(nhsNumber);

        this.name = name;
        this.email = email;
        this.sex = sex;
        this.birthdate = birthdate;
        this.citizenCardNumber = citizenCardNumber;
        this.phoneNumber = phoneNumber;
        this.tinNumber = tinNumber;
        this.nhsNumber = nhsNumber;


    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSex() {
        return sex;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public long getCitizenCardNumber() {
        return citizenCardNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public long getTinNumber() { return tinNumber; }

    public long getNhsNumber() { return nhsNumber; }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setCitizenCardNumber(long citizenCardNumber) {
        this.citizenCardNumber = citizenCardNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setTinNumber(long tinNumber) {
        this.tinNumber = tinNumber;
    }

    public void setNhsNumber(long nhsNumber) {
        this.nhsNumber = nhsNumber;
    }

    private void checkNameRules(String name){

        String aux = name.trim();
        aux = aux.toLowerCase();
        char[] auxchar = aux.toCharArray();

        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if (!(name.length() < 30)) {
            throw new IllegalArgumentException("Name cannot have more than 30 characters.");
        }
        for (int i = 0; i < auxchar.length; i++) {
            char ch = auxchar[i];
            if (!(ch >= 'a' && ch <= 'z')) {
                throw new IllegalArgumentException("Invalid name.");
            }
        }

    }

    private void checkEmailRules(String email){

    }

    private void checkSexRules(String sex){

       if (!(sex.equalsIgnoreCase("Male") || sex.equalsIgnoreCase("Female") || sex.equalsIgnoreCase("Other"))){
           throw new IllegalArgumentException("Invalid sex");
       }

    }

    private void checkBirthdateRules(String birthdate){

    }

    private void checkCitizenCardNumberRules(long citizenCardNumber){

        String strCitizenCardNumber = String.valueOf(citizenCardNumber);
        String auxStrCitizenCardNumber = strCitizenCardNumber.trim();

        if (StringUtils.isBlank(auxStrCitizenCardNumber)) {
            throw new IllegalArgumentException("Phone number cannot be empty.");
        }
        if (!(auxStrCitizenCardNumber.length() == 16)) {
            throw new IllegalArgumentException("Phone number must have 11 digit numbers.");
        }

    }

    private void checkPhoneNumberRules(long phoneNumber){

        String strPhoneNumber = String.valueOf(phoneNumber);
        String auxStrPhoneNumber = strPhoneNumber.trim();

        if (StringUtils.isBlank(auxStrPhoneNumber)) {
            throw new IllegalArgumentException("Phone number cannot be empty.");
        }
        if (!(auxStrPhoneNumber.length() == 11)) {
            throw new IllegalArgumentException("Phone number must have 11 digit numbers.");
        }

    }

    private void checkTINNumberRules(long tinNumber) {

        String strTINnumber = turnIntoString(tinNumber);
        String auxStrTINnumber = strTINnumber.trim();

        if (StringUtils.isBlank(auxStrTINnumber)) {
            throw new IllegalArgumentException("TIN number cannot be empty.");
        }
        if (!(auxStrTINnumber.length() == 10)) {
            throw new IllegalArgumentException("TIN number must have 10 digit numbers.");
        }

    }

    private void checkNHSNumberRules(long nhsNumber) {

        String strNHSnumber = turnIntoString(nhsNumber);
        String auxStrNHSnumber = strNHSnumber.trim();

        if (StringUtils.isBlank(auxStrNHSnumber)) {
            throw new IllegalArgumentException("TIN number cannot be empty.");
        }
        if (!(auxStrNHSnumber.length() == 10)) {
            throw new IllegalArgumentException("TIN number must have 10 digit numbers.");
        }

    }

    private String turnIntoString(long xNumber) {
        String strXNumber;
        return strXNumber = String.valueOf(xNumber);
    }


}