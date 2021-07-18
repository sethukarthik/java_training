package com.java_practice.bicycle_inherit;

public class MountainBike extends Bicycle {
	int seatHeight;
	int mountIns = 100;
	
	public MountainBike() {
		super(0,0,0);
	}
	
	public MountainBike(int cadence, int gear, int speed, int seatHeight) {
		super(cadence, gear, speed);
		this.seatHeight = seatHeight;
	}
	
	// the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
    
//    @Override
//    protected void speedProtected() {
//    	System.out.println("MountainBike");
//    }
    
    protected static void speedProtected(int a) {
    	System.out.println("MountainBike");
    }
    
    public void methodOne(int i) {
    	
    }
    
    public static void main(String[] args) {
//		MountainBike mbike;
		Bicycle bike;
//		mbike = new MountainBike(0, 0, 0, 0);
		bike = new Bicycle(0, 0, 0);
//		Bicycle.this.nes
		Bicycle.NestedCycle nest = bike.new NestedCycle();
		System.out.println(nest.nestedN);
		nest.nested();
//		System.out.println(bike);
//		System.out.println(bike.pro);
//		System.out.println("==============");
//		System.out.println(mbike.pro);
//		System.out.println(bike.sfi);
//		System.out.println(bike.sta);
//		System.out.println(bike.fi);
//		System.out.println("==============");
//		System.out.println(mbike.sfi);
//		System.out.println(mbike.fi);
//		System.out.println(mbike.sta);
//		System.out.println("==============");
//		bike.speedProtected();
//		mbike.speedProtected();
//		mbike.speedProtected(1);
//		System.out.println(mbike.mountIns);
//		System.out.println("==============");
//		bike.speedProtected();
    	
    	//Casting shows the use of an object of one type in place of another type, among the objects permitted by inheritance and implementations. For example, if we write
    	Object obj = new MountainBike();
    	
//    	obj.
    	System.out.println(obj.toString());
    	// then obj is both an Object and a MountainBike (until such time as obj is assigned another object that is not a MountainBike). This is called implicit casting.
//    	MountainBike mybike = obj;
//    	Bicycle bike = obj;
    	if(obj instanceof MountainBike) { //true
    		Bicycle mykike = (MountainBike) obj;
        	mykike.speedProtected();
    	}
    	
//    	MountainBike name = new Bicycle();
	}

	@Override
	public String toString() {
		return "MountainBike [seatHeight=" + seatHeight + ", mountIns=" + mountIns + ", cadence=" + cadence + ", gear="
				+ gear + ", speed=" + speed + ", pro=" + pro + ", fi=" + fi + ", sta=" + sta + ", sfi=" + sfi + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
