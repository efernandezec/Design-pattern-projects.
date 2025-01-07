/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composition.clases;

/**
 *
 * @author estiben
 */
public class Robot implements IDriver{

    @Override
    public void navigate(String destination) {
        System.out.println("Robot navigating to " + destination);
    }
    
}
