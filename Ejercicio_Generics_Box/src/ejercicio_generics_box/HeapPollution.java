package ejercicio_generics_box;
/**
 * @author Daniel
 */
public class HeapPollution {
    Set<Integer> set = new HashSet<>();
    Set rawSet = set;
    rawSet.add("heap pollution!"); // heap pollution
    set.stream().forEach(System.out::println); // Clase Cast Excepcion

//
    Set<Integer> set = new HashSet<>();
    set = Collections.checkedSet(set, Integer.class);
    Set rawSet = set;
    rawSet.add("exception!");  // ClassCastException, no heap pollution
    set.stream().forEach(System.out::println);
}
