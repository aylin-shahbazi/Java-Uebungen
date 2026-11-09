package u17;   

import java.util.Scanner;

public class Geheim {
    // Die 3 Benutzer und Passwörter als Konstanten (jeder String kommt nur 1x vor)
    private static final String U1 = "doors";
    private static final String P1 = "lightmyfire";
    
    private static final String U2 = "gates";
    private static final String P2 = "dos";
    
    private static final String U3 = "dent";
    private static final String P3 = "42";
    
    // Texte / Prompts
    private static final String PROMPT_USER = "Benutzername bitte: ";
    private static final String PROMPT_PASS = "Geheimwort bitte: ";
    
    // Ausgaben
    private static final String MSG_RICHTIG = "richtig";
    private static final String MSG_TEILWEISE = "Benutzername richtig, Geheimwort falsch";
    private static final String MSG_FALSCH = "falsch";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        // 1. Eingaben einlesen
        System.out.print(PROMPT_USER);
        String eingabeUser = console.next();
        
        System.out.print(PROMPT_PASS);
        String eingabePass = console.next();
        
        // Hilfsvariablen zum Merken
        boolean userStimmt = false;
        boolean passwortStimmt = false;
        
        // 2. Mit einer While-Schleife die 3 Benutzer nacheinander durchgehen
        int i = 1;
        while (i <= 3) {
            String aktuellerUser = "";
            String aktuellesPass = "";
            
            // Ganz normaler if-else Block, um den i-ten Benutzer auszuwählen
            if (i == 1) {
                aktuellerUser = U1;
                aktuellesPass = P1;
            } else if (i == 2) {
                aktuellerUser = U2;
                aktuellesPass = P2;
            } else if (i == 3) {
                aktuellerUser = U3;
                aktuellesPass = P3;
            }
            
            // Prüfen, ob der eingegebene Benutzer passt
            if (aktuellerUser.equals(eingabeUser)) {
                userStimmt = true;
                
                // Wenn der Name stimmt, prüfen wir auch das Passwort
                if (aktuellesPass.equals(eingabePass)) {
                    passwortStimmt = true;
                }
            }
            
            i++; // Zähler erhöhen, sonst haben wir eine Endlosschleife
        }
        
        // 3. Am Ende entscheiden, was ausgegeben wird
        if (userStimmt && passwortStimmt) {
            System.out.println(MSG_RICHTIG);
        } else if (userStimmt) {
            System.out.println(MSG_TEILWEISE);
        } else {
            System.out.println(MSG_FALSCH);
        }
    }
}