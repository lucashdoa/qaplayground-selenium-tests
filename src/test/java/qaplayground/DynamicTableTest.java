package qaplayground;

import org.testng.Assert;
import org.testng.annotations.Test;

import core.BaseTest;
import pages.DynamicTablePage;

public class DynamicTableTest extends BaseTest {
    private DynamicTablePage page;

    @Test
    public void FindSpidermanRealName() {
        this.page = new DynamicTablePage();
        String expectedName = "Peter Parker";

        Assert.assertEquals(page.getSpiderManRealName(), expectedName);
    }
}
