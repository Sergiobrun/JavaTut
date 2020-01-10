package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class testDropdown extends BaseTest {

    @Test
    public void testSelectOption(){

        var dropdownPage = homepage.clickDropdown();

        String options = "Option 1";
        dropdownPage.selectFromDropdown(options);

        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1);
        assertTrue(selectedOptions.contains(options), "salio mal");


    }
}

