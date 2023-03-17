package Test;

import kr.or.kosa.Car;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Car c = new Car();
		
		c.stop();
		c.setDoor(5);
		
		System.out.println(c.getDoor());

	}

}
