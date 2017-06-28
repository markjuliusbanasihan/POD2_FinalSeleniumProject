import org.junit.Assert;
import org.junit.Test;

/**
 * Created by MXB2320 on 6/28/2017.
 */
public class MainTest {
    HomePage utils = new HomePage();
    public static final String URL = "http:/www.homedepot.com";

    @Test
    public void startTestHere () {
        //Selenium Project Step 1
        Assert.assertTrue( "Unable to navigate to home page" + URL, utils.navigateURL(URL));
        System.out.println("Navigated to " +URL);

        Assert.assertTrue("Search box not displayed", utils.validateSearchBox());
        System.out.println("Search box validated.");
    }
}