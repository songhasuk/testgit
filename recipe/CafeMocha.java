package recipe;

import machine.VandingMachine;

public class CafeMocha {
	
	private int bean;
	private int ChocoMlik;
	private int sugar;
	private int price;

	
	public CafeMocha() {
		this.bean=100;
		this.ChocoMlik=100;
		this.sugar=100;
		this.price=2000;
	}
	
	public void makeCafeLatte(VandingMachine vm) {
		vm.setBean(vm.getBean()-bean);
		vm.setSugar(vm.getSugar()-sugar);
		vm.setChocoMlik(vm.getChocoMlik()-ChocoMlik);
		
	}

	public int getBean() {
		return bean;
	}

	public void setBean(int bean) {
		this.bean = bean;
	}

	public int getChocoMlik() {
		return ChocoMlik;
	}

	public void setChocoMlik(int ChocoMlik) {
		this.ChocoMlik = ChocoMlik;
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
		this.price = 1000;
	}

	
}
