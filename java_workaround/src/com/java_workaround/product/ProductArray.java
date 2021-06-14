package com.java_workaround.product;

public class ProductArray {
	int id;
	String name;
	double cost;

	public ProductArray(int id, String name, double cost) {
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public static void main(String[] args) {
		// products for object
		ProductArray[] products = new ProductArray[ ] {new ProductArray(1, "Pencil", 5.0), new ProductArray(1, "Pencil", 5.0), new ProductArray(1, "Pencil", 5.0)};
		// initialize products
		ProductArray product1 = new ProductArray(1, "Pencil", 5.0);
		ProductArray product2 = new ProductArray(1, "Pen", 50.0);
		ProductArray product3 = new ProductArray(1, "Eresar", 3.0);

		products[0] = product1;
		products[1] = product2;
		products[2] = product3;

		double totalCost = 0.0;

		for (int i = 0; i < products.length; i++) {
//			System.out.println(products[i].getId());
//			System.out.println(products[i].getName());
//			System.out.println(products[i].getCost());
			totalCost += products[i].getCost();
		}
		
		for(ProductArray temp : products) {
			System.out.println("ItemName: " + temp.getName() + " ItemCost: " + temp.getCost());
		}
		System.out.println(totalCost);

	}
}
