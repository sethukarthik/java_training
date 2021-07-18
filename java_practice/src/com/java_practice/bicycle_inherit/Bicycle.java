package com.java_practice.bicycle_inherit;

public class Bicycle{
	int cadence;
	int gear;
	int speed;
	int seatHeight;
	private String brandName = "Cycle";
	protected String pro = "Producted";
	
	@Override
	public String toString() {
		return "Bicycle [cadence=" + cadence + ", gear=" + gear + ", speed=" + speed + ", brandName=" + brandName
				+ ", pro=" + pro + ", fi=" + fi + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	static String sta = "Static";
	final String fi = "Final";
	static final String sfi = "Static Final";
	
	public Bicycle() {
		FuncInter lambda = (a, b) -> a + b;
		System.out.println(lambda.test(2, 3));
	}
	
	public Bicycle(int cadence, int gear, int speed) {
		this.cadence = cadence;
		this.speed = speed;
		this.gear = gear;
//		this.brandName = brandName;
	}
	
	public void setCadence(int cadence) {
        this.cadence = cadence;
    }
        
    public void setGear(int gear) {
        this.gear = gear;
    }
        
    public void applyBrake(int decrement) {
        this.speed -= decrement;
    }
    
    public void brandName(String name) {
    	this.brandName = name;
    }
        
    public void speedUp(int increment) {
        this.speed += increment;
    }
    
    private void speedPrivate() {
    	System.out.println("This is from speed private");
    }
    
    protected void speedProtected() {
    	System.out.println("This is speed protected");
    }
    
    public static void speedStatic() {
    	System.out.println("This is speed static");
    }
    
    public static void main(String[] args) {
    	Bicycle bike = new Bicycle(0, 0, 0);
		System.out.println(bike.brandName);
		
		FuncInter lambda = (a, b) -> a + b;
		System.out.println(lambda.test(2, 3));
	}
    
    public void methodOne(int i) {
    	
    }
    
    public class NestedCycle {
    	String nestedN = "Nested";
    	public void nested() {
    		System.out.println("Nested Cycle");
    	}
    }
}
