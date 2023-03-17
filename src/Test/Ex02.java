package Test;

public class Ex02 {

	public static void main(String[] args) {
		//int (-21 ~ 21)
		int num = 100000000;
		System.out.println("num : " + num);
		//int num2 = 100000000000; //The literal 100000000000 of type int is out of range 
		// literal 개발자 직접 입력한 값 (있는 그대로의 값)
		// 컴파일 오류 
		// 나는 4byte 크기의 방인데 .... 더 큰값은 담을 수 없어
		
		//1. 해결방법
		//int num2 = 100000000000;
		long num2 = 100000000000L; //The literal 100000000000 of type int is out of range 
		//개발자 입력하는 정수 범위는 int 벗어나면 안되요
		System.out.println("num2 : " + num2);
		
		long num3 = 100; //속지 않을 려면 값을 보지 말고 타입을 보세요 (리터럴값도)
		                 //long num3 = (long)100
		                 //암시적 형변환 (자동으로 컴파일러가 ... 큰타입에 작은 타입을 넣는 것은)
						 //작은 타입에 있는 값을 큰 타입에 넣는 것은 당근이지
		
		//해결하세요
		//손실이 발생하더라 담아 보겠다 
		//int num4 = 10000000000;   //The literal 10000000000 of type int is out of range
		//int num4 = 10000000000L;  //Type mismatch: cannot convert from long to int
		//담아 담아 (손실 ....) 명시적 형변환 , (타입 변환) ,  캐스팅
		int num4 = (int)10000000000L;
		System.out.println("타입 변환 : " + num4); //타입 변환 : 1410065408 쓰레기값 
		//정상적인 해결 방법이 아니다 (버려지는 값)
		
		//데이터 손실이 없어요 다행이도 ... 있을 수 도 있어 
		//1. 강제 형변환
		//int num5 = (int) 1000L; //Type mismatch: cannot convert from long to int
		
		//2. 담을 그릇을 크게 
		//long num5 = 1000L;
		
		//char 2byte  >> 16bit >>  0 ~ (216-1) >> 0 ~ 65535 (유니코드)
		/*
		유니코드(영어: Unicode)는 전 세계의 모든 문자를 컴퓨터에서 일관되게 표현하고 다룰 수 있도록 설계된 산업 표준이다  
		유니코드(Unicode)는 전 세계의 모든 문자를 다루도록 설계된 표준 문자 전산 처리 방식이다.  
		> 컴퓨터는 이진수만 안다.
        > 컴퓨터와 내가 문자를 입력하고 출력할 수 있도록 해주는게 바로 문자 코드다.
        > 그리고 문자코드와 숫자를 매칭시킨 표를 문자표라고 한다.
        > 대표적으로 아스키 코드표가 있다
		아스키 코드표 (ASCII Codes)
        = American Standard Code for Information Interchange
		*/
		
		//char 2byte : 한 문자를 표현하기 위해서 만든 타입
		// 영문자 , 특수문자 , 공백 , 한글  >>>> 한문자로 표현하는 표준화
		// 한문자 >> 'A' , '가' , ' '
		// 문자열 >> "abcd" >> String str="abcd";
		
		char ch = '가';
		System.out.println("한문자 : " + ch);
		//char ch2='가나';  예외 발생 (컴파일도 안되요) ...한문자만 가능
		
		ch = 'a';
		ch = 'A';
		
		// char 정수 타입 (문자를 저장하지만 내부적으로 정수값을 가지고 있다)
		// 아스키 코드표에서 십진수값과 문자값을 비교해 보세요
		int chint = ch;
		System.out.println("ch 문자를 십진수 보면 : " + chint); // 65
		
		//int chint = ch;
		//내부적으로 암묵적으로 자동 형변환이 발생 했어요(자동으로)
		//int chint = (int)ch;
		
		char chint2 = 'a';
		System.out.println(chint2);
		int intch2 = (int)chint2; //개발자가 직접 형변환 문제 없다
		
		
		int intch3 = 65;
		//char chint3 = intch3; //Type mismatch: cannot convert from int to char
		
		//1 해결 (명시적 형변환) >> 데이터 손실 발생
		//char chint3 = (char) intch3;
		
		//2 해결 받는 그릇을 크게 ... (개발자의 의도 문자를 보고 싶어요)
		//int chint3 = intch3;
		
		//char chint3 = intch3; >> 위로 올라가서 char intch3 = 65;
		
		char chint3 = (char) intch3;
		System.out.println("chint3 가지는 문자값 : " + chint3);
		
		/*
		 1. 할당에 있어서 값을 보지말고 값이 가지는 타입을 보자
		 1.1 리터럴 값에 대해서
		 1.1.1 정수 리터럴의 기본 타입은 int
		 1.1.2 실수 리터럴의 기본 타입은 double
		 
		 2. 암시적 형변환 , 명시적 형변환
		 2.1 큰타입에 작은 타입의 값을 넣는 것은 암시적 형변환를 하기에 개발자 ...그냥 ...사용
		 2.2 작은 타입에 큰타입을 넣고자 한다면 자동 형변환을 지원하지 않기 때문제 강제적(명시적) 형변환
		 2.2.1  접미사 L , l ,   (int)정수 , (long)정수
		 KEY POINT 강제적 형변환  데이터 손실을 감수 .....  책임은 개발자가 져야 한다 .....
		 ex) char c = (char) int 범위값 .... 손실 발생... 
		 */
		
		//String 타입  (8+1) 값타입 처럼 사용하자 >> 값타입 처럼 써도 문제 없게 만들었어요
		//문자열 >> 문자의 집합 >> 문자의 배열은 >> 문자열
		// int , long 동일하게 사용하세요
		String name = "홍길동";
		name = "홍길동 바보";
		
		String color = "red";
		color = color + " 방가방가"; // 오라클  + 산술만 해요 >> 결합 연산자 ||
		System.out.println(color);
		
		//TIP)
		//연산자는 언어마다 표현이 달라요
		//JAVA   >>  + 산술(합) 하고 , 결합도 해요 [결합을 먼저한다]
		//Oracle >>  + 산술만 해요 , 결합연산자 ||   '안녕' || '방가방가' >> 
		
		
		//자바의 타입은 불합리하다 .....
		//처음 부터 타입을 정의하고 하는 것에 대한 불만
		
		
		//java에서 특수 문자 처리하기
		// char sing = ''; 한문자[공백, 영문, 한글] 들어가야됨
		char sing = '\''; //Invalid character constant
	    //이스케이프 문자 : 특정 문자앞에 \ 다음 값은 데이터 인정
		System.out.println(sing);	
		
		String username = "홍\"길\"동";

		System.out.println(username);
		
		String str1 = "1000";
		String str2 = "10";
		String result = str1 + str2; // + 결합 
		System.out.println("result:"+ result); // 100010
		
		System.out.println("100"+100); //1001000
		System.out.println(100+"100"); //1001000
		System.out.println(100+100+"100"); // 200100
		System.out.println(100+(100+"100")); // 100100100
		System.out.println(100+"100"+100); // 100100100
		
		
		String uri = "C:\\Temp";
		System.out.println(uri);
		// \t (tap), \n (new line) = 줄바꿈, 탭 적용
		uri = "C:\\T\te\tm\tp";
		System.out.println(uri);
		
		//byte : 네트워크 데이터 교환, 파일처리 , 이미지 read >> Array
		//long : 금융 화폐
		
		//실수형 (부동소주점)
		//float 4byte  
		//double 8byte
		//*** 실수 리터럴은 기본 타입 double """
		
		//실수는 그냥 double 타입 사용하는데 float 사용시 명시적으로 접미사(f)를 붙인다.
		
		float f = 3.14f; // 3.14값이 double로 인식해 값에 f접미사를 붙여야됨
		float f2 = (float)3.14; // 어런 경우 데이터 손실 ... 가져 올 수도 있음
		
		//현명한 개발자는 처음부터 타입 범위를 크게 잡아서 사용
		
		double d = 3.14;
		
		//1. int(4byte) < float(4byte) 같은 바이트일 때 실수가 더 크다
		//2. float 과 double 중에서 정밀하게 값을 표현 : bouble
		
		float data = 1.123456789f;
		System.out.println("f"+data); 
		//타입 번위값을 벗어나는 소수점은 출력이 안된다 : 소수점 7자리(반올림)
		
		double data2 = 1.123456789123456789;
		System.out.println("d"+data2);
		//타입 번위값을 벗어나는 소수점은 출력이 안된다 : 소수점 16자리(반올림)
		
		
		double data4 = 100;
		int number = 100;
		//int result2 = (int)data4+number ;
		// double result2 = data4+number ;  
		//형변환 보다 번위가 큰 타입으로 선언해주는게 데이터 손실이 없다.
		
		//System.out.println(result2);
		
		// int result2 = (int)data4+number ;
		// ↑범위값이 넘어가서 오류가 발생한다. 
		///////////////////////////////////////////////////////////////
		
		//[중요]
		// 1. 큰 타입 + 작은 타입 : 이 연산 결과는 큰타입
		// 2. 타입간 변환 : 변수가 가지는 값을 보지말고 변수의 타입으로 판단하자
		// 3. 명시적(강제적) 형변환 시 데이터 손실을 고민하자
		
		
		
		
		
		
		char cha = 7000; // 7000 은 정수리터럴의 범위를 벗어나지 않았다 
		                 // The literal 값에 범위에 대한 오류는 아니다 
	   //cha = 80000;    //80000값은 정수리터럴 범위에 있다 >> Type mismatch: cannot convert from int to char
		                 //나는 오류는 값의 범위를 넘어서면 타입에 변환에 대한 오류를 발생 시킨다
		cha = (char)80000;
		System.out.println((int)cha);
		
		
		
		byte bb = 1; //1은 정수 리터럴 범위에 있다 
		bb = 127;
		//bb = 128; //128은 리터럴 범위에 있다 하지만
		            //범위값을 벗어난다 그럼 할당시 Type mismatch: cannot convert from int to byte
		
		
		int i2 = 100;
	    int i3 = 1000000000;
	    //int i4 = 10000000000; //The literal 10000000000 of type int is out of range 
	    //int i5 = 10000000000L;//Type mismatch: cannot convert from long to int
	    int i6 = (int)10000000000L;
		
	    //***정수리터럴의 기본 타입은 int 형입니다 (int 형 범위값을 리터럴로 표현가능합니다)***
	    
	    //long l2 = 10000000000; //The literal 10000000000 of type int is out of range 
	    long l2 = 10000000000L;  
	    
		 
	    byte b  = 125;   //125는 정수 리터럴 범위에 있다 .
		//byte b2 = 128; //Type mismatch: cannot convert from int to byte
		b = (byte) (b + 1); //정수 연산 기본은 int 형이다 ...
		System.out.println(b);
		
		
		b = 127;
		System.out.println(b);
		b = (byte)128; //정수 리터럴 범위에 있다 .... 할당시 문제 발생 ... 그럼 타임을 맞추어서 ...
		System.out.println("b :" + b);
		
		
	}

}