/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composition.classes;

/**
 *
 * @author estiben
 */
public class Human implements IDriver {

    @Override
    public void navigate(String destination) {
        System.out.println("Human navigating to " + destination);
    }
    
}
