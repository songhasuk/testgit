package Test;

public class Ex05_Pperation {

	public static void main(String[] args) {
		int result = 100/ 100;
		System.out.println("result :" + result);
		
		result = 13/2;
		System.out.println("result :" + result);
		
		result = 13%2;
		System.out.println("result :" + result);

		int i = 10;
		++i; // 전치증가
		System.out.println("i :"+i);
		i++; // 후치증가
		System.out.println("i :"+i);
		//다른 결합되지 않고 혼자서 있으면 전치와 후치는 의미가 없다
		
		int i2 = 5;
		int j2 = 4;
		
		int result2 = i2 + ++j2; //전치가 먼저 동작
		System.out.println("result2 : " + result2 + "\tj2 :"+j2);
		result2 = i2 + j2++;
		System.out.println("result2 : " + result2 + "\tj2 :"+j2);
		
		char c2 = 'I';
		char c3 = 'I';
		int result4 = c2 + c3;
		System.out.println(result4);
		
		int sum = 0;
		
		for(int j= 0; j<=100; j++) {
			//sum = sum+j;
			//System.out.println("sum: " + sum); //
			if(j%2 == 0) {
				sum+=j;
			}
			
		}
				
		System.out.println("ssssssssssssss"+sum) ;
				
		int val =10;
		System.out.println(val*Math.random());
		System.out.println((int)(val*Math.random()));
		
		
	}

}
