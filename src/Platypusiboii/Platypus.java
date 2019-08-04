package Platypusiboii;
import javax.swing.JOptionPane;

public class Platypus {
    private String name;
    void sayHi(){
      name = JOptionPane.showInputDialog("Give a platypus a name.");
    	System.out.println("The platypus " + name + " is smarter than your average platypus.");
    }
}