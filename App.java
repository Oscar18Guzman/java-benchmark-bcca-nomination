import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Nomination> nominations = load();

        Nomination nomination = start();
        nominations.add(nomination);
        save(nominations);
        System.out.println("Thank you, we will get in touch soon");
    }

    public static Nomination start() {
        System.out.println("Nominator Information");
        System.out.println("Your Name: ");
        String nominatorName = in.nextLine();
        System.out.println("Email Address: ");
        String nominatorEmail = in.nextLine();
        System.out.println("School Position: ");
        String nominatorPosition = in.nextLine();
        System.out.println("RelationShip to Nominee");
        String relationshipToNominee = in.nextLine();

        System.out.println("Please share more about the Nominee ");
        System.out.println("Nominee Information");
        System.out.println("Your Name: ");
        String nomineeName = in.nextLine();
        System.out.println("Age: ");
        String nomineeAge = in.nextLine();
        System.out.println("Student Contact info (emails or phone numbers): ");
        String nomineeContactInfo = in.nextLine();
        System.out.println("Expected Graduation Date");
        String nomineeGradDate = in.nextLine();
        System.out.println(
                "Base Camp Coding Academy looks for students with aptitude and dedication to succeed in this program. Please Explain why you believe this student will make an excellent candidate: ");
        System.out.println(
                "Do you have any experience when this student has demonstrated a strong ability to think logically");
        String aptitude = in.nextLine();
        System.out
                .println("is there any evidence of the applicant being engaged in something they are passionate about");
        String perseverance = in.nextLine();
        System.out.println(
                "Do you think the applicant would be able to reliably attend the program five days a week in Water Valley?");
        String dedication = in.nextLine();
        System.out.println("Why does this student deserve a position at Base Camp");
        String workEthic = in.nextLine();
        return new Nomination(nominatorName, nominatorEmail, nominatorPosition, relationshipToNominee, nomineeName,
                nomineeAge, nomineeContactInfo, nomineeGradDate, aptitude, perseverance, dedication, workEthic);
    }

    public static ArrayList<Nomination> load() {
        try {
            FileInputStream fileStream = new FileInputStream("nominations.ser");
            ObjectInputStream os = new ObjectInputStream(fileStream);
            ArrayList<Nomination> nominations = (ArrayList<Nomination>) os.readObject();
            os.close();
            return nominations;
        } catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<Nomination>();
        }
    }

    private static void save(ArrayList<Nomination> nominations) {
        try {
            FileOutputStream fileOutput = new FileOutputStream("nominations.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOutput);
            objectOut.writeObject(nominations);
            objectOut.close();
        } catch (IOException ex) {
            System.out.println("IT DIDN'T SAVE");
        }
    }

}