/**
 * Created by MXB2320 on 6/28/2017.
 */
public class HomePage extends SeleniumUtils {

    public static final String SEARCH_BOX = ".//input[@id='headerSearch']";

    public boolean validateSearchBox () {
        if (waitUntilElementDisplayed( SEARCH_BOX )) {
            return true;

        }
        return false;
    }


    }
