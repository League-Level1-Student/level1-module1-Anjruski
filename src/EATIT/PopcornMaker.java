package EATIT;

public class PopcornMaker {
public static void main(String[] args) {
	Popcorn corn = new Popcorn("human soul");
	Microwave microwave = new Microwave();
	microwave.putInMicrowave(corn);
	microwave.setTime(7);
	microwave.startMicrowave();
	corn.applyHeat();
	corn.eat();
	
}
}
