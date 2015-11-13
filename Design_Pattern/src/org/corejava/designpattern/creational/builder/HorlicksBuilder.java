package org.corejava.designpattern.creational.builder;

public class HorlicksBuilder extends BeverageBuilder {

	@Override
	public void mixWater() {
		System.out.println("Mixing 100gm of water for the Horlicks.");
		
	}

	@Override
	public void mixMilk() {
		System.out.println("Mixing 250gm of milk for the Horlicks.");
		
	}

	@Override
	public void mixSugar() {
		System.out.println("Mixing 200gm of Sugar for the Horlicks.");
		
	}

	@Override
	public void mixPowder() {
		System.out.println("Adding 100gm Horlicks powder");
		
	}

}
