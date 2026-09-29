import java.util.Scanner;

public class Geheim {

    public static final String USER_DOORS = "doors";
    public static final String PW_DOORS = "lightmyfire";
    
    public static final String USER_GATES = "gates";
    public static final String PW_GATES = "dos";
    
    public static final String USER_DENT = "dent";
    public static final String PW_DENT = "42";

    // Konstanten fuer Texte, um Redundanz zu vermeiden
    public static final String PROMPT_USER = "Benutzername bitte: ";
    public static final String PROMPT_PASS = "Geheimwort bitte: ";
    
    public static final String MSG_RIGHT = "richtig";
    public static final String MSG_PARTIAL = "Benutzername richtig, Geheimwort falsch";
    public static final String MSG_WRONG = "falsch";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(PROMPT_USER);
        String eingabeName = scanner.nextLine();
        System.out.print(PROMPT_PASS);
        String eingabePass = scanner.nextLine();

        String ergebnis = pruefeZugriff(eingabeName, eingabePass);
        System.out.println(ergebnis);

        scanner.close();
    }
    // Prüft Zugangsdaten und liefert den passenden Status zurück
    public static String pruefeZugriff(String username, String password) {

        if (username.equals(USER_DOORS)) {
            if (password.equals(PW_DOORS)) {
                return MSG_RIGHT;
            } else {
                return MSG_PARTIAL;
            }
        } else if (username.equals(USER_DENT)) {
            if (password.equals(PW_DENT)) {
                return MSG_RIGHT;
            } else {
                return MSG_PARTIAL;
            }
        } else if (username.equals(USER_GATES)) {
            if (password.equals(PW_GATES)) {
                return MSG_RIGHT;
            } else {
                return MSG_PARTIAL;
            }
        } else {
            return MSG_WRONG;
        }
    }
}
