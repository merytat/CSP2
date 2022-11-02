package Unit2;

public class NameUtility {
    private String firstName;
    private String middleName;
    private String lastName;

    public NameUtility(String fn, String mn, String ln){
        this.firstName = fn;
        this.middleName = mn;
        this.lastName = ln;
    }

    //methods

    //getFirstAndLast : first char of name and the last char of lastName,
    public String getFirstAndLast(){
        String firstOfFN = firstName.substring(0,1);
        String lastOFLN = lastName.substring(lastName.length()-1);
        String allTogether = firstOfFN + lastOFLN;
        String allInLower = allTogether.toLowerCase();
        return allInLower;
    }

    //Last letter of the first name, Middle letter of the
    //middle name, and First letter of the last name all in CAPS
    public String createMonogram(){
        return "";
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String newFN){
        this.firstName = newFN;
    }

    public String getMiddleName(){
        return middleName;
    }

    public void setMiddleName(String newFN){
        this.middleName = newFN;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String newFN){
        this.lastName = newFN;
    }

    @Override
    public String toString(){
        return firstName + " " + middleName + " " + lastName;
    }
}
