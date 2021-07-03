package com.java_training.qn26;

public class LabInfo {
	
	public static void main(String[] args) {
		PhysicsLab phy = new PhysicsLab();
		ChemistryLab chm = new ChemistryLab();
		MechanicalLab meh = new MechanicalLab();
			
		System.out.println(phy.phySeat);
//		System.out.println(chm.chemSeat);
		System.out.println(meh.mechSeat);
	}
}
