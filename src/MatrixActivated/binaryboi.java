package MatrixActivated;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class binaryboi implements ActionListener {
	JFrame JF = new JFrame("Convert 8 bits of binary to ASCII");
	JPanel JP = new JPanel();
	JButton JB = new JButton("convert");
	JTextField JT = new JTextField(8);
	JLabel JL = new JLabel("A");
	public static void main(String[] args) {
	binaryboi BB = new binaryboi();
	BB.ButtonSetup();
	}

	// TODO Auto-generated method stub
public void ButtonSetup() {
	JF.pack();
	JF.add(JP);
	JF.pack();
	JP.add(JB);
	JP.add(JT);
	JP.add(JL);
	JF.pack();
	JF.setVisible(true);
JB.addActionListener(this);	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String JTF = JT.getText();
	JTF = convert(JTF);
	JL.setText(JTF);
	
}
String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}
}

