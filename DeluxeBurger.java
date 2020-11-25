package projecct;

import java.util.List;

public class DeluxeBurger extends hamburger {

	public DeluxeBurger(String BreadType,String Meat,double price) {
		super(BreadType, Meat, price);
		super.BreadType=BreadType;
		super.Meat=Meat;
		super.price=price;
		
	}
	public void total(List<String> x,List<Double> y) {
		double t=0;
		
		System.out.println("Deluxe hamburger on a  "+this.BreadType+"  with  "+this.Meat+",  price is "+"14.54");
		for(int i=0;i<x.size();i++) {
			System.out.println("Added "+x.get(i)+" for an extra "+y.get(i));
			 t=y.get(i)+t;
			 
		}
		
		 

}
}
