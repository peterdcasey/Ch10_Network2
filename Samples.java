import java.util.*;

/**
 * Write a description of class Samples here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Samples
{
    private List<String> x = new LinkedList<>();
    
    public void ex1() {
       x.add("hey");  // 0 -> 1 after insert at 0
       x.add("boo");  // 1 -> 2
       x.add("ouch"); // 2 -> 3
       
       x.add(0, "you");  // What happens, this gets index 0
    }
    
    public Samples() {
        List<Integer> x = List.of(1,2,3,4);
        //x.add(5);
        List<String> s = List.of("a", "b", "c");
        //s.set(0, "z");
        System.out.println(s);
    }
}
