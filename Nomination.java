import java.io.Serializable;

public class Nomination implements Serializable {
    private static final long serialVersionUID = 1L;

    String nominatorName;
    String nominatorEmail;
    String nominatorPosition;
    String relationshipToNominee;

    String nomineeName;
    String nomineeAge;
    String nomineeContactInfo;
    String expectedGradDate;
    String aptitude;
    String perseverance;
    String dedication;
    String workEthic;

    public Nomination(String nominatorName, String nominatorEmail, String nominatorPosition,
            String relationshipToNominee, String nomineeName, String nomineeAge, String nomineeContactInfo,
            String expectedGradDate, String aptitude, String perseverance, String dedication, String workEthic) {
        this.nominatorName = nominatorName;
        this.nominatorEmail = nominatorEmail;
        this.nominatorPosition = nominatorPosition;
        this.relationshipToNominee = relationshipToNominee;
        this.nomineeName = nomineeName;
        this.nomineeAge = nomineeAge;
        this.nomineeContactInfo = nomineeContactInfo;
        this.expectedGradDate = expectedGradDate;
        this.aptitude = aptitude;
        this.perseverance = perseverance;
        this.workEthic = workEthic;
    }

}