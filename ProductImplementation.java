
package com.Himanshu.ProblemPractice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Product implements Comparable{
	public int id;
	public String name;
	public double price;
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Object o) {
		Product p=(Product)o;
		if(this.getPrice()>p.getPrice())
			return 1;
		else if(this.getPrice()<p.getPrice())
			return -1;
		else
			return 0;
	}
}
public class ProductImplementation {
	public double sumofprice(ArrayList<Product> pl){ 
		double sum=0;
		Iterator i=pl.iterator();
		while(i.hasNext()) {
			Product p=(Product)i.next();
			sum=sum+p.getPrice();	
		}
		return sum;
	}
	
	public float maxprice(ArrayList<Product> pl){
		return (float)Collections.max(pl).getPrice();
	}
	public float minprice(ArrayList<Product> pl){
		return (float)Collections.min(pl).getPrice();
	}
	public List<String> getProductNameList(ArrayList<Product> pl){
		List<String> al=new ArrayList<String>();
		Iterator i=pl.iterator();
		while(i.hasNext())
			al.add(((Product)i.next()).getName());
		return al;
	}
	public static void main(String[] args) {
		ArrayList plist=new ArrayList<Product>();
		plist.add(new Product(20,"Bag",897));
		plist.add(new Product(21,"Book",87));
		plist.add(new Product(22,"Table",89));
		plist.add(new Product(23,"pen",597));

		
		ProductImplementation pa=new ProductImplementation();
		
		System.out.println(pa.getProductNameList(plist));
		System.out.println(pa.sumofprice(plist));
		System.out.println("Max price :"+pa.maxprice(plist));
		
}