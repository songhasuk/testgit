
package Test;

/*

  클래스 == 설계도 == 데이터 타입
  
  Tip)
  하나의 물리적인 java 파일에 여러개의 클래스 생성 가능(연습할 때만, 실무 x)
  원칙적인 방법 : 패키지 kr.or.kosa.utils.Apt 또는 kr.or.kosa.model.Apt 클래스를 만든다
  생성된 설계도는 필요시 재사용이 가능하다(똑같은 아파트 무한이 생성 가능)
  
  
*/

class Apt { //설계도  == 데이터 타입(작은 타입을 여러개 가지고 있는 큰 타입)
			//설계도는 구제화 되지 않으면 종이한장 의미가 없다.
			//목적 : Apt 설계도(클래스)를 가지고 똑같은 아파트를 무한이 생성하겠다(memory에) == new 연산자를 통해서
			
	String doorColor;
}



public class Ex04_Object_Variable {
	
	public static void main(String[] args) {
		
		Apt apt;  // apt변수는 Apt 객체의 주소를 담을 수 있는 변수
		apt = new Apt (); // heap 메모리(4byte)에 아파트가 한채 생성되고, 생성된 아파트의 주소가 apt 변수에 할당
		
		System.out.println("apt 주소 :"+ apt);
		//Apt@6f2b958e
		//Apt(클래스명) + @(문자) + 주소값(16진수 값) 결합된게 return
		
		Apt apt2 = new Apt();
		System.out.println(apt==apt2); //false
		System.out.println("apt2 주소 :"+ apt2);
		
		Apt apt3 = apt2; //주소값 할당(동거)
		// apt2참조변수에 들어간 객체주소를 apt3에 넣어준다. 
		System.out.println(apt2 == apt3); //true
		
		
		apt2.doorColor = "red";
		System.out.println(apt3.doorColor);
		apt3.doorColor = "blue";
		System.out.println(apt2.doorColor);
		
		//동작 원리
		/*
		 Ex04_Object_Variable.java → javac.exe → Ex04_Object_Variable.class(실행파일)
		 →Ex04_Object_Variable 엔터 
		 
		 [컴파일러 실행 과정]
		 JVM 동작 → OS → 메모리 대여 → 메모리(용도) 구획정리 → 각각의 땅에 (자원할당) 메모리 == (힙, 스택, 클래스 에리어)
		 → 프로그램 종료 → 사용했던 memory는 OS에 반환 ...END
		 
		 이클립스 → ctrl + f11 == ↑ 컴파일러
		 
		 1. main 함수 실행 ... 반드시 local variable(지역변수) 초기화
		 2. main tlwkrwjadlfk
		 
		 
		 */
	
		
		
		
		
		
		
	}
	
	

}
