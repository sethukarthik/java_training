package com.java_practice.qn06;

public class JoinArrayString {
	public static void main(String[] args) {
		String[] array = {"Vikas","Lokesh","Ashok","AS112"};
		String result = "";
		int len = array.length;
		if (len > 0) {
			StringBuilder sb = new StringBuilder();
			for(String s: array) {
				sb.append(s);
				len -= 1;
				if(len != 0) {
					sb.append(",");
				}
			}
			System.out.println(sb);
		}
	}
}
