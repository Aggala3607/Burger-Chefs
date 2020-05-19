package projecct;

import java.util.List;

public class hamburger {
	String BreadType;
	String Meat;
	double price;
	public hamburger(String BreadType,String Meat,double price){
		this.BreadType=BreadType;
		this.Meat=Meat;
		this.price=price;
		
	}
	public String[] toppings(){
		String [] toppings= {"Lettuce","Tomato","Carrot","Capscicum"};
		return toppings;
	}
	public double[] price() {
		double [ ] price= { 2.67,3.25,2.52,3.5};
		return price;
	}

	public void total(List<String> x,List<Double> y) {
		double t=0;
		double z=0;
		System.out.println("Basic hamburger on a "+this.BreadType+" with "+this.Meat+", price is "+this.price);
		for(int i=0;i<x.size();i++) {
			System.out.println("Added"+" "+x.get(i)+" "+"for an extra "+y.get(i));
			 t=y.get(i)+t;
			 z=this.price+t;
			
		}
		 System.out.println("Total cost is " +z);
		
	}

}
