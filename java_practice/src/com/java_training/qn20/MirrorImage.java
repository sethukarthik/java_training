package com.java_training.qn20;

public class MirrorImage {
	public String image;
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public void generateImage(String str) {
		String rev = "";
		for(int i = str.length()-1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		setImage(str+"|"+rev);
	}
	
	public static void main(String[] args) {
		MirrorImage mImage = new MirrorImage();
		mImage.generateImage(args[0]);
		System.out.println(mImage.getImage());
	}
}
