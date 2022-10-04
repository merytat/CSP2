package Unit2;

public class Website {
    //attributes
    private String domain;
    private int numUsers;
    private String topLevelDomain;

    //Constructors
    //Default constructor
    public Website() {
        this.domain = "";
        this.numUsers = 0;
        this.topLevelDomain = "com";
    }


    // Specify website URL
// Register a new website
    public Website(String domainName, String topDomain) {
        domain = domainName;
        topLevelDomain = topDomain;
        numUsers = 0;
    }

    // Specify website URL
// Register an old website
    public Website(String domainName, String topDomain, int numPeople) {
        domain = domainName;
        topLevelDomain = topDomain;
        numUsers = numPeople;
    }


    public String toString() {
        String res = "https://www." + domain + "." + topLevelDomain;
        res += " has " + numUsers + " users";

        return res;
    }
}
