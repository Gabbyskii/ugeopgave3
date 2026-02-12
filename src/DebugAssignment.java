public class DebugAssignment {
    /* Hvis du kører programmet får du en række fejl.
     * Fix programmet så det kan køre
     * outputtet bliver:
     * "7 is the smallest!"
     *
     *  OBS! Skriv hvad du har gjort som kommentar ud for hver linje du fixer
     */

    void main() {

        int a = 7, b = 42;

        int smaller = minimum(a,b); // variablen int smaller oprettet så metodekaldet i if statementen fungerer

        if (smaller == a) { //if statemten argument skal være i () istedet for krøllen{}

       System.out.println(smaller+ " is the smallest!"); //erstattede a med variablen smaller så det printede 7 istedet

        }

    }

    int minimum(int a, int b) { // ikke være void men int, så den kan return tallets int værdi
        int smaller; //int smaller variabel lavet

        if (a < b) {

             smaller = a; //int smaller variabel skal deklares udenfor if statements, derfor kun smaller =a

        } else { // else skal ikke have parentes statements, den står alene

             smaller = b;

        }

        return smaller; // returner variablen, istedet for return int smaller, da metoden allerede har returtype int

    }

}
