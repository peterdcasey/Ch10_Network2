import java.util.ArrayList;

/**
 * Write a description of class CommentedPost here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class CommentedPost extends Post {
    private int likes;
    private ArrayList<String> comments;
    
    public CommentedPost(String user) {
        super(user);
        likes = 0;
        comments = new ArrayList<>();
    }
    
    /**
     * Record one more 'Like' indication from a user.
     */
    public void like() {
        likes++;
    }

    /**
     * Record that a user has withdrawn his/her 'Like' vote.
     */
    public void unlike() {
        if (likes > 0) {
            likes--;
        }
    }

    /**
     * Add a comment to this post.
     * 
     * @param text  The new comment to add.
     */
    public void addComment(String text) {
        comments.add(text);
    }
    
    public void display() {
        // display();    BAAAD
        super.display();
        
        if(likes > 0) {
            System.out.println("  -  " + likes + " people like this.");
        }
        else {
            System.out.println();
        }
        
        if(comments.isEmpty()) {
            System.out.println("   No comments.");
        }
        else {
            System.out.println("   " + comments.size() 
                                + " comment(s). Click here to view.");
        }        
    }
}
