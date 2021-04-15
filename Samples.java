import java.util.*;

/**
 * Write a description of class Samples here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Samples
{
    public Samples() {
        List<Integer> x = List.of(1,2,3,4);
        //x.add(5);
        List<String> s = List.of("a", "b", "c");
        s.set(0, "z");
        System.out.println(s);
    }
}
