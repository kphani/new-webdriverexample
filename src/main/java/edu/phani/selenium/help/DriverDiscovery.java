package edu.phani.selenium.help;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by kphani on 27/09/2014.
 */
public class DriverDiscovery {
    private static final String RUN_CONFIG_PROPERTIES = "/runConfig.properties";
    private static RemoteWebDriver driver;

    static {
        try {
            getDriverTyp();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoClassDefFoundError e) {
            e.printStackTrace();

        }


    }

    public static void getDriverTyp() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {
        Properties props = new Properties();
        InputStream is = DriverDiscovery.class.getResourceAsStream(RUN_CONFIG_PROPERTIES);
        props.load(is);
        String driverType = props.getProperty("driverType");
        Class<?> retrievedClass = Class.forName(driverType);
        driver = (RemoteWebDriver) retrievedClass.newInstance();
    }


    public static RemoteWebDriver getDriver() {
        return driver;
    }
}








