package machine;

import java.awt.Choice;
import java.security.interfaces.RSAKey;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

import recipe.Americano;
import recipe.CafeLatte;
import recipe.CafeMocha;

public class VandingMachine {
	
	private String serialNumber;
	private String modelName;
	private String music;
	private String menu;

	private boolean hotOrIce;

	private int water=1000;
	private int milk=1000;
	private int ChocoMlik=1000;
	private int sugar=1000;
	private int bean=1000;
	static int cup=100;
	private int ice=100;
	private int price;
	private int inputMoney; //입금한 금액
	private int totalMoney=10000; //잔금
	
	
	

	Scanner sc = new Scanner(System.in);

	private Americano americano = new Americano();
	private CafeLatte cafeLatte = new CafeLatte();
	private CafeMocha cafeMocha = new CafeMocha();
	
	
	public VandingMachine() {
		this.serialNumber = "950208";
		this.modelName = "송향전자";
		this.music = "NewJeans-OMG";
		this.totalMoney = 10000; 
	}

	public void printMenu() {
		System.out.println("===========");
		playMusic();
		System.out.println("메뉴를 입력해 주세요: 1.아메리카노 2.카페라떼 3.카페모카 4.종료 5.관리자페이지");
	}
	
	
	
	public void run() {
			
		while(true) {
			// 1.메뉴 보여주기
			printMenu();
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
				case 1: {
					this.menu = "\"Americano\"";
					price=americano.getPrice();
					System.out.println("음료를 HOT 아니면 ICE로 시키시겠습니까? 1.ICE 2.HOT");
					addIce(Integer.parseInt(sc.nextLine()));
					americano.makeAmericano(this);
					System.out.println("고객님은["+((hotOrIce == true) ? "Ice" : "Hot")+"]"+menu+"를 주문 하셨습니다");
					System.out.println(price+"원 결재를 해주세요[1만,5천원 권만 가능]");
					inputCoin(Integer.parseInt(sc.nextLine()));
					change(menu);
					System.out.println("거스름돈"+inputMoney+"원 입니다.");					
					break;
				}
				case 2:{
					this.menu = "\"CafeLatte\"";
					price=cafeLatte.getPrice();
					System.out.println("음료를 HOT 아니면 ICE로 시키시겠습니까? 1.ICE 2.HOT");
					addIce(Integer.parseInt(sc.nextLine()));
					cafeLatte.makeCafeLatte(this);
					System.out.println("고객님은["+((hotOrIce == true) ? "Ice" : "Hot")+"]"+menu+"를 주문 하셨습니다");
					System.out.println(price+"원 결재를 해주세요[1만,5천원 권만 가능]");
					inputCoin(Integer.parseInt(sc.nextLine()));
					change(menu);
					System.out.println("거스름돈"+inputMoney+"원 입니다.");					
					
					break;
				}
				case 3:{
					this.menu = "\"CafeMocha\"";
					price=cafeMocha.getPrice();
					System.out.println("음료를 HOT 아니면 ICE로 시키시겠습니까? 1.ICE 2.HOT");
					addIce(Integer.parseInt(sc.nextLine()));
					cafeMocha.makeCafeLatte(this);
					System.out.println("고객님은["+((hotOrIce == true) ? "Ice" : "Hot")+"]"+menu+"를 주문 하셨습니다");
					System.out.println(price+"원 결재를 해주세요[1만,5천원 권만 가능]");
					inputCoin(Integer.parseInt(sc.nextLine()));
					change(menu);
					System.out.println("거스름돈"+inputMoney+"원 입니다.");					
					break;
					
				}
				case 4:{
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				case 5:{
					admin();
				}
				
				default:{
					System.out.println("잘못 입력했습니다.");
				}
			
			}
		}
	}
		
//		selectMenu(Integer.parseInt(sc.nextLine()));
//		
//		addIce(Integer.parseInt(sc.nextLine()));
//		System.out.println("고객님은["+((hotOrIce == true) ? "Ice" : "Hot")+"]"+menu+"를 주문 하셨습니다");
//		System.out.println(price+"원 결재를 해주세요[1만,5천원 권만 가능]");
//		inputCoin(Integer.parseInt(sc.nextLine()));
//		change(menu);
//		System.out.println("거스름돈"+inputMoney+"원 입니다.");
//		System.out.println(totalMoney+" : "+bean);
	

	
	
	public void admin() {
		boolean b_num = true;
		while(b_num) {
			System.out.println("[관리자 모드 입니다]");
			System.out.println("1.총수량 조회 2.유지보수 3.관리자모드 종료");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch (choice) {
			case 1: {
				vmprint();
				break;
				
			}case 2: {
				charging();
				break;
			}case 3:{
				System.out.println("관리자 모드 종료");
				b_num = false;  //★
				break;
			}
			default:{
				System.out.println("잘못입력했습니다.");
			}
			}
		}
			
		
	}
	
	public void vmprint() {
		System.out.println("[총수량]");
		System.out.println("[원두]:"+bean+"[물]:"+water+"[우유]:"+milk+"[초코유우]:"+ChocoMlik+"[설탕]:"+sugar+"[컵]:"+cup+"[얼음]:"+ice);
		System.out.println("[총금액]:"+totalMoney);
	}
	public void charging() {
		this.bean = 1000;
		this.water = 1000;
		this.milk = 1000;
		this.ChocoMlik=1000;
		this.sugar=1000;
		this.cup=100;
		this.ice=100;
		this.totalMoney=10000;
		System.out.println("충전완료");
	}

	
	
	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}


	

	public int inputCoin(int inputMoney) { //입력 금액ㄴ
		this.inputMoney = inputMoney;
		
		return inputMoney;
		}

	

	public int change(String menu) {
		
		if(inputMoney >= price) {
		
			if(menu == "\"Americano\"") {
				inputMoney-=americano.getPrice();
				totalMoney+=americano.getPrice();
			}else if(menu == "\"CafeLatte\"") {
				inputMoney-=cafeLatte.getPrice();
				totalMoney+=cafeLatte.getPrice();
			}else if(menu == "\"CafeMocha\"") {
				inputMoney-=cafeMocha.getPrice();
				totalMoney+=cafeMocha.getPrice();
			}
			cup--;
			return inputMoney;
		}else {
		System.out.println("잔금 부족입니다.");
		return inputMoney = 0;
	}
		
}

	public void playMusic(){
		System.out.println("~~♬음악 실행 중입니다♬~~:"+music);
	}

	public void addIce(int ice) {
		
		
		try {
			if(ice ==1) {
				hotOrIce = true;
				this.ice-=10;
				
			}else if(ice ==2)  {
				hotOrIce = false;
			}		
			
		} catch (Exception e) {
			System.out.println("잘못 입력했습니다");
		}
	}

		
	
	//관리자
	
	public void fillBean(int bean) {}

	public void fillWater(int water) {}

	public void fillCup(int cup) {}

	public void fillMlik(int mlik) {}

	public void fillIce(int ice) {}

	public void fillChange(int change) {
		
	}

	public void fillSugar(int suger) {}
	
	public int getWater() {
		return water;
	}

	public int getMilk() {
		return milk;
	}

	public int getChocoMlik() {
		return ChocoMlik;
	}

	public int getBean() {
		return bean;
	}

	public int getCup() {
		return cup;
	}

	public int getIce() {
		return ice;
	}

	public int getTotalMoney() {
		return totalMoney;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

	public void setChocoMlik(int chocoMlik) {
		ChocoMlik = chocoMlik;
	}

	public void setBean(int bean) {
		this.bean = bean;
	}

	public void setCup(int cup) {
		this.cup = cup;
	}

	public void setIce(int ice) {
		this.ice = ice;
	}

	
}
