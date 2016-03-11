/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charles
 */
import javax.swing.*;
public class SwingInput {
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("What is your name?");
        String input = JOptionPane.showInputDialog("How old are you?");
        int age = Integer.parseInt(input);
        JOptionPane.showMessageDialog(null,"Hello, " + name + " ");
        JOptionPane.showMessageDialog(null,"Next year, you will be " + (age+1));
    }
    
    
}
