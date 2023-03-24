 package recipe;

import machine.VandingMachine;

public class CafeLatte {
	private int bean;
	private int mlik;
	private int sugar;
	private int price;

	public CafeLatte() {
		this.bean = 100;
		this.mlik = 100;
		this.sugar = 100;
		this.price = 1500;
	}
	
	public void makeCafeLatte(VandingMachine vm) {
		vm.setBean(vm.getBean()-bean);
		vm.setMilk(vm.getMilk()-mlik);
		vm.setSugar(vm.getSugar()-sugar);
	}

	
	public int getBean() {
		return bean;
	}

	public void setBean(int bean) {
		this.bean = bean;
	}

	public int getMlik() {
		return mlik;
	}

	public void setMlik(int mlik) {
		this.mlik = mlik;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	

}
