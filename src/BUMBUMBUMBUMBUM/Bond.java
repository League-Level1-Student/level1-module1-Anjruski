package BUMBUMBUMBUMBUM;

import javax.swing.JOptionPane;

public class Bond {
public int FindCode (vault vault) {
	for (int i = 0; i < 1000000; i++) {
		if(vault.tryCode (i)) {
			System.out.println("You opened the vault! and now you have a demon on your hands");
			return i;
		}
	}
return -1;
}
}
