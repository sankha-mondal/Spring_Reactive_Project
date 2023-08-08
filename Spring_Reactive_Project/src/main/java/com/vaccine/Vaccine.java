package com.vaccine;

public class Vaccine {

	private String name;
	private boolean delivered;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDelivered() {
		return delivered;
	}

	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}

	@Override
	public String toString() {
		return "Vaccine [name=" + name + ", delivered=" + delivered + "]";
	}

	public Vaccine(String name) {
		super();
		this.name = name;
	}

	public Vaccine() {
		super();
		// TODO Auto-generated constructor stub
	}

}
