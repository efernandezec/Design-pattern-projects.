/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composition;

import composition.classes.CombustionEngine;
import composition.classes.ElectricEngine;
import composition.classes.Human;
import composition.classes.Robot;
import composition.classes.Transport;

/**
 *
 * @author estiben
 */
public class Composition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human human = new Human();
        Robot robot = new Robot();
        
        CombustionEngine combustionEngine = new CombustionEngine();
        ElectricEngine electricEngine = new ElectricEngine();
        
        Transport transport1 = new Transport(combustionEngine, robot);
        transport1.deliver("200 km", "MESSENGER 1 ");
        
        Transport transport2 = new Transport(electricEngine, human);
        transport2.deliver("100km", "MESSENGER 2 ");
    }
    
}
