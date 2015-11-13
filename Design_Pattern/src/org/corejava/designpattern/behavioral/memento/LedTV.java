package org.corejava.designpattern.behavioral.memento;

public class LedTV {
	
	private String display;
	private int price;
	private Boolean isUsbSupport;
	
	public LedTV(String display, int price, Boolean isUsbSupport) {
		this.display=display;
		this.price=price;
		this.isUsbSupport=isUsbSupport;
	}

	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Boolean getIsUsbSupport() {
		return isUsbSupport;
	}
	public void setIsUsbSupport(Boolean isUsbSupport) {
		this.isUsbSupport = isUsbSupport;
	}

	@Override
	public String toString() {
		return "LedTV [display=" + display + ", price=" + price + ", isUsbSupport=" + isUsbSupport + "]";
	}
	
	

}
