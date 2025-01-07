
package composition.classes;

/**
 *
 * @author estiben
 */
public class Transport {
    private IEngine engine;
    private IDriver driver;
    
    
    public Transport(IEngine engine, IDriver driver){
        this.driver = driver;
        this.engine = engine;
    }
    
    public void deliver(String destination, String cargo){
        System.out.println("Starting develivery of " + cargo);
        driver.navigate(destination);
        engine.move();
        System.out.println("Delivery complete");
    }
}
