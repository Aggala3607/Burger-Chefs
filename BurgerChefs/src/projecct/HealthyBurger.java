package projecct;

import java.util.List;

public class HealthyBurger extends hamburger{

	public HealthyBurger(String BreadType, String Meat, double price) {
		super(BreadType, Meat, price);
		super.BreadType=BreadType;
		super.Meat=Meat;
		super.price=price;
		
		// TODO Auto-generated constructor stub
	}
	public String[] toppings(){
		String [] toppings= {"Lettuce","Tomato","Carrot","Capscicum","Mushroom","Corn"};
		return toppings;
	}
	public double[] price() {
		double [ ] price= { 2.67,3.25,2.52,3.5,2.56,4.25};
		return price;
	}
	public void total(List<String> x,List<Double> y) {
		double t=0;
		double z=0;
		System.out.println("Healthyburger on a "+" "+this.BreadType+" with  "+this.Meat+", price is  "+this.price);
		for(int i=0;i<x.size();i++) {
			System.out.println("Added"+" "+x.get(i)+" for an extra "+y.get(i));
			 t=y.get(i)+t;
			 z=this.price+t;
			
		}
		 System.out.println("Total cost is " +z);
		
	}

	

}