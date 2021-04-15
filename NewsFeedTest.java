import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class NewsFeedTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NewsFeedTest
{
    private NewsFeed newsFeed1;
    private MessagePost messageP1;
    private PhotoPost photoPos1;

    /**
     * Default constructor for test class NewsFeedTest
     */
    public NewsFeedTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        newsFeed1 = new NewsFeed();
        messageP1 = new MessagePost("Bob", "nice work");
        newsFeed1.addPost(messageP1);
        photoPos1 = new PhotoPost("Jan", "coolpic.jpg", "Snowman");
        newsFeed1.addPost(photoPos1);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void TestOne()
    {
        NewsFeed newsFeed1 = new NewsFeed();
        MessagePost messageP1 = new MessagePost();
        newsFeed1.addPost(messageP1);
        assertTrue(messageP1.getText().equals("no message"));
    }
}


