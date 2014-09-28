import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

/**
 * Created by kphani on 28/09/2014.
 */
public class BaseTest {
    final WebDriver driver=DriverDiscovery.driver;
    
    Navigation navigation = new Navigation(driver);



}
