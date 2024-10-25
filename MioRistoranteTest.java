

public class MioRistoranteTest {

    //testa l’inserimento di un cliente tramite il metodo inserisciCliente
    public static boolean testInserisciSingolo (){
        //controlla che gli array che rappresentano i record siano tutti vuoti se no restituisce false

        String Id = "1222";
        int nascita = 1999;
        int RegistrazioneG = 12;
        int RegistrazioneM = 3;
        int RegistrazioneA = 2024;

        if(MioRistorante.inserisciCliente(Id,nascita,RegistrazioneG,RegistrazioneM,RegistrazioneA) == false)return false;

        if(MioRistorante.id[0] != null
            &&  MioRistorante.Nascita[0] != 0
            && MioRistorante.registrazioneG[0] != 0
            &&  MioRistorante.registrazioneM[0] != 0
            && MioRistorante.registrazioneA[0] != 0) return true;
        else return false;

    }
    /*4. Analogamente a quanto fatto al punto precedente, scrivete un test testInserisciEstendi (che verifica che
            tutto funzioni nel caso in cui gli array dei record siano pieni, e vadano estesi),*/
    public static boolean testInserisciEstendi(){

        MioRistorante.numrecord = MioRistorante.id.length;

        MioRistorante.estendi();
        if(MioRistorante.id.length == (MioRistorante.numrecord +1)
            && MioRistorante.Nascita.length == (MioRistorante.numrecord +1)
            && MioRistorante.registrazioneG.length  == (MioRistorante.numrecord +1)
            && MioRistorante.registrazioneM.length  == (MioRistorante.numrecord +1)
            && MioRistorante.registrazioneA.length  == (MioRistorante.numrecord +1))return true;
        else return false;
    }
/*
            ed un metodo
    testInserisciErrore, che verifica che record con dati sbagliati non possano essere inseriti (es. provate i casi
            con id già presente nell’array id, e anno di nascita negativo)
    */
    public  static  boolean testInserisciErrore(){
        String Id = "-12";
        int nascita = 1700;
        int RegistrazioneG = -2;
        int RegistrazioneM = 13;
        int RegistrazioneA = 23099;

        if( MioRistorante.inserisciCliente(Id,nascita,RegistrazioneG,RegistrazioneM,RegistrazioneA) ) return false;
        else return true;
    }

    //volendo racchiudere il corpo delle funzioni di test in un costrutto try catch per le eccezioni
    public static void main(String[] args) {

        if (testInserisciSingolo() == false) System.out.println("testInserisciSingolo: X ");
        else System.out.println("testInserisciSingolo: OK ");

        if (testInserisciEstendi() == false) System.out.println("testInserisciEstendi: X");
        else System.out.println("testInserisciEstendi: OK");

        if (testInserisciErrore() == false) System.out.println("testInserisciErrore: X");//per passarlo implementare le condizioni di compatibilità
        else System.out.println("testInserisciErrore: OK");
    }


}
