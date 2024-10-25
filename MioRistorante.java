import java.security.SecureRandom;
import java.util.Scanner;
import java.lang.Object;
import java.util.*;
import java.lang.*;
import java.util.Arrays; //per espendere gli array
/*Fornisce metodi statici per comuni manipolazioni di array
sort
binarySearch
equals
fill
arraycopy (volendo per l'estensione dell'array primitivo)
 */

public class MioRistorante {
    ///trabocchetto 2:
    // Gli array di int sono già inizializzati a 0 di default
    // L'array di String è già inizializzato a null di default
    static int numrecord =0;

    static String[] id = new String[3]; // Array di String di dimensione 3
    static int[] Nascita = new int[3];   // Array di int di dimensione 3
    static int[] registrazioneG = new int[3]; // Array di int di dimensione 3
    static int[] registrazioneM = new int[3]; // Array di int di dimensione 3
    static int[] registrazioneA = new int[3]; // Array di int di dimensione 3


    public static boolean inserisciCliente (String Id, int nascita, int RegistrazioneG, int RegistrazioneM, int RegistrazioneA){

        //controllo se il vettore è pieno e nel caso lo si estende
        if (id[id.length-1] != null) estendi();

        /***Mettere le condizioni di compatibilità sui parametri, se non le superano
         * stampare un messaggio che avvisa l'user che il cliente non è stato inserito e
         * non consentire l'inserimento del record e tornare falso
         */

        //inserimento negli array
        id[numrecord]=Id;
        Nascita[numrecord]=nascita;
        registrazioneG[numrecord]=RegistrazioneG;
        registrazioneM[numrecord]=RegistrazioneM;
        registrazioneA[numrecord]=RegistrazioneA;

        numrecord++;

        return true;
    }

    static int idAutomatici(){
        //scrivere un test in un commento per questo metodo
            //spazzolare gli id e controllare che non ne ci siano degli uguali
                //il seguente controlla solo sui successivi e così via lultimo non viene controllato o usando metodi sulle collezioni

                 /******si basa sull'uso delle proprietà dellelle collezioni hash set****/
        /*
            //deve anche fare un uso ripetitivo della classe insericsi per riempire la struttura da testare

        public static boolean haDuplicati(List<String> lista) {
        HashSet<String> set = new HashSet<>();
        for (String elemento : lista) {
            // Se l'elemento non può essere aggiunto, significa che è un duplicato
            if (!set.add(elemento)) {
                return true; // Trovato un duplicato
            }
        }
        return false; // Nessun duplicato trovato
        }
        */

        SecureRandom ramdom = new SecureRandom();
        int id=0;
        boolean t= false;
        while ( t == true){

            id = ramdom.nextInt();

            //adattando il numero all'interavllo desiderato
            id = (id % (9999 - 999)) + 1000;

            //spazzola i record per vedere se il numero è già presente e aggiorna t

        }
        return id;
    }

    //estensione array
    public static void estendi(){
        String [] arrayestesoString = new String[id.length+1];
        int [] arrayestesoInt = new int[id.length+1];

        System.arraycopy(id,0,arrayestesoString,0,id.length );
        id = arrayestesoString;

        System.arraycopy(Nascita,0,arrayestesoInt,0,Nascita.length);
        Nascita = arrayestesoInt;


        System.arraycopy(registrazioneG,0,arrayestesoInt,0,registrazioneG.length);
        registrazioneG = arrayestesoInt;


        System.arraycopy(registrazioneM,0,arrayestesoInt,0,registrazioneM.length);
        registrazioneM = arrayestesoInt;


        System.arraycopy(registrazioneA,0,arrayestesoInt,0,registrazioneA.length);
        registrazioneA = arrayestesoInt;
    }

    //metodo inserisci
    public static void inserisci(Scanner tastiera){
        String Id;
        int nascita;
        int RegistrazioneG;
        int RegistrazioneM;
        int RegistrazioneA;


        //completare con i controlli
            //input
            System.out.print("Inserisci l'ID #"+ ": ");
            Id = tastiera.nextLine(); // Input per l'array di String

            System.out.print("Inserisci l'anno di nascita #: ");
            nascita = tastiera.nextInt(); // Input per l'array di int
            tastiera.nextLine(); // Consuma il newline rimasto

            System.out.print("Inserisci il giorno di registrazione #: ");
            RegistrazioneG = tastiera.nextInt(); // Input per il giorno di registrazione
            tastiera.nextLine(); // Consuma il newline rimasto

            System.out.print("Inserisci il mese di registrazione #: ");
            RegistrazioneM = tastiera.nextInt(); // Input per il mese di registrazione
            tastiera.nextLine(); // Consuma il newline rimasto

            System.out.print("Inserisci l'anno di registrazione #: ");
            RegistrazioneA = tastiera.nextInt(); // Input per l'anno di registrazione
            tastiera.nextLine(); // Consuma il newline rimasto

            boolean sas = inserisciCliente(Id,nascita,RegistrazioneG,RegistrazioneM,RegistrazioneA);
            if(sas == false)System.out.println("sei un pagliaccio");

    }



    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);


        // Chiedi all'utente di inserire i dati
         for (int i=0;i<10;i++)inserisci(tastiera);



        // Chiusura dello scanner
        tastiera.close();





    }
}