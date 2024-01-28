import java.util.HashSet;
import java.util.Set;

  /*Scrivere una funzione che restituisca un hashset riempito
  Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
  Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
  Svuotare l'hashset, verificarlo e stampare il risultato
*/

public class App {


    public static void main(String[] args) {
       

      Set<String> saluti = caricaHash();

      String arrivederci = "arrivederci";

      saluti.add(arrivederci);
       
      //scorre tutto il set e cancella se è arrivederci , peccato che poi espolode Exception in thread "main" java.util.ConcurrentModificationException
      try {
          for (String e : saluti) {
            if (e.equals(arrivederci)) {
              saluti.remove(e);
            }
          }
        } catch (Exception e) {
        System.out.println("BOOM");
      }

       saluti.clear();

        System.out.println("il set è vuoto? " + saluti.isEmpty());

    }


    public static Set<String> caricaHash(){

        Set<String> saluti = new HashSet<String>();

        saluti.add("ciao");
        saluti.add("hello");
        saluti.add("hallo");
        saluti.add("saluton");
        saluti.add("hola");
        saluti.add("ciao");

        return saluti;

    }
}
