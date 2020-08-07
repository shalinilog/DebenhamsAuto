import cucumber.api.java.After;
import cucumber.api.java.Before;
import functionalLibrary.CommonFunctions;

public class Hooks extends CommonFunctions  {

   CommonFunctions commonFunctions = new CommonFunctions();

    @Before

    public void beforeTest()
    {
    commonFunctions.openBrowser();

    }
  @After

    public void afterTest()
  {
    commonFunctions.closeBrowser();

  }




}