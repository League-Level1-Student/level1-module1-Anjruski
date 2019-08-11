package BUMBUMBUMBUMBUM;

import sun.applet.Main;

public class vault {
public static void main(String[] args) {
	vault vault = new vault();
	Bond Bond = new Bond();
	Bond.FindCode(vault);
}
	int SecretCode = 666;
public boolean tryCode(int code) {
	if (code == SecretCode) {
		return true;
	}
return false;
}
}
