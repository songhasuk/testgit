package recipe;

import machine.VandingMachine;

public class Americano {
	private int bean;
	private int water;
	private int price;
	
	public Americano() {
		this.bean = 100;
		this.water = 100;
		this.price = 1000;
	}
	
	public void makeAmericano(VandingMachine vm) {
		vm.setBean(vm.getBean()-bean);
		vm.setWater(vm.getWater()-water);
	}
	

	public int getBean() {
		return bean;
	}

	public int getWater() {
		return water;
	}

	public int getPrice() {
		return price;
	}



	

}
