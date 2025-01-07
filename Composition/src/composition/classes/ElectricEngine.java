/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composition.classes;

/**
 *
 * @author estiben
 */
public class ElectricEngine implements IEngine {
    @Override
    public void move(){
        System.out.println("Moving with electric engine...");
    }
}
