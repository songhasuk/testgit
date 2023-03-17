package Test;

import java.util.Random;

public class test {

	public static void main(String[] args) {
		
		Random r = new Random();
		int min = 100, max = 1000;
		int score = ((r.nextInt((max-min)+1)+min)/100)*100;	
		
		System.out.println(score);
		
		
		switch(score) {
	
		case 1000 : {
			System.out.println("[경품] = TV");
		}
		case 900 : {
			System.out.println("[경품] = NoteBook");
		}
		case 800 : {
			System.out.println("[경품] = 냉장고");
		}
		case 700 : {
			System.out.println("[경품] = 한우세트");
		}
		case 600 : {
			System.out.println("[경품] = 휴지");
			break;
		}
		default :
			System.out.println("[경품] = 칫솔");
		
		
		}
		
		

	}

}
