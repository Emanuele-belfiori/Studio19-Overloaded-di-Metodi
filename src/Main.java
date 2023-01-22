public class Main {
    public static void main(String[] args) {
        System.out.println("Overload di Metodi");
        System.out.println();
        /*
        * OVERLOADED METHODS:
        *
        * - Cosa sono:
        *
        * - Creiamo diversi metodi con numeri e parametri differenti
        *
        * - Creiamo diversi metodi con tipi di dato differenti
         */

/*-------------------------------------------------------------------------------------------------------*/

        // COSA SONO GLI OVERLOADED METHODS:

        /*
        Attraverso l'Overload si possono creare metodi completamente identici ma con parametri differenti,
        questo è imperativo se usassimo gli stessi parametri risulterebbe un errore.
        In sostanza gli overloaded methods= un metodo con lo stesso nome ripetuto più volte la cui signature
        (firma) ciò che caratterizza il metodo, la firma (signature) del metodo che è la combinazione di
        parametri dovrà essere diversa categoricamente in tutti, oppure cambia il tipo di dato, o ancora la
        combinazione di tipi di dato differenti Es: double e int - int e float e così via.
         */

/*-------------------------------------------------------------------------------------------------------*/

        int doppioInt= addizione(5,5); // Richiamo e attribuisco valori al metodo int addizione 2 valori
        System.out.println("Il risultato dell'addizione è: " + doppioInt);

        int triploInt= addizione(5, 5, 5); // '' '' '' metodo int addizione 3 valori
        System.out.println("Il risultato dell'addizione è: " + triploInt);

        double doppioDouble= addizione(5.5, 5.5); // '' '' '' metodo double addizione 2 valori
        System.out.println("Il risultato dell'addizione è: " + doppioDouble);

        double doubleInt= addizione(5.5, 5); // '' '' '' metodo addizione valore double e valore int
        System.out.println("Il risultato dell'addizione è: " + doubleInt);

    }
    // CREIAMO DIVERSI METODI CON NUMERI E PARAMETRI DIVERSI (Overload):

    //METODO ADDIZIONE:
    static int addizione (int a, int b){
        int risultato= a + b;
        return risultato;
    }
    //Overload:
    static int addizione (int a, int b, int c){ // Aggiunto un valore
        int risultato= a + b + c;
        return risultato;
    }
    //Overload:
    static double addizione (double a, double b){ //Ho cambiato il valore in double
        double risultato= a + b;
        return risultato;
    }
    //Overload:
    static double addizione (double a, int b){ //Ho cambiato il valore in double
        double risultato= a + b;
        return risultato;
    }
}