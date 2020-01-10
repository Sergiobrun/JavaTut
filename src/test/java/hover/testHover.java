package hover;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class testHover extends BaseTest {

    @Test
    public void testHoverUser1() {
        var hoverPage = homepage.clickHover();
        var caption = hoverPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed());
        assertEquals(caption.getTitle(),"name: user1");
        assertEquals(caption.getLinkText(),"View profile");
        assertTrue(caption.getLink().endsWith("/users/1"));
    }
}
