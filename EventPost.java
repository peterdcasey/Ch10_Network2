
/**
 * Write a description of class EventPost here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EventPost extends Post
{
    // instance variables - replace the example below with your own
    private String event;

    /**
     * Constructor for objects of class EventPost
     */
    public EventPost(String event, String user) {
        super(user);
        this.event = event;
    }

}
