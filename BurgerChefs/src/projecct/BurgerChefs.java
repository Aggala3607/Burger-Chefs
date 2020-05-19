package projecct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import burger.DeluxeBurger;
import burger.HealthyBurger;



public class BurgerChefs {
public static void ray(String[] x,int y,double[] z) {
		
		for (int i=0;i<y;i++) {
			System .out.println(i+1 + " " +" "+x[i] +" "+ " "+ z[i]+"$");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Hamburger= {"Hamburger","Healthy Burger","Deluxe BUrger"};
		List<String> Tlist=new ArrayList<>();
		List<Double>TPrice=new ArrayList<>();
		double Hprice[]= {5.0,7.25,14.25};
		double Mprice[]= {0,0,0,0};
		Scanner input=new Scanner(System.in);
		String [] BreadRoll= {"Brioche Sandwich Roll",
				"Ciabatta Oblong Bun",
				"Ciabatta Square Bun",
				"French Torpedo Roll"
		};
		String[]  Meat= {"Brisket","Dry-Aged Beef","Short Rib"};
		
		
		ray(Hamburger,3,Hprice);
		int choice=input.nextInt();
		System.out.println("Select Your Bread");
		ray(BreadRoll,4,Mprice);
		
		int bread=input.nextInt();
		ray(Meat,3,Mprice);
		System.out.println("Select Your Meat");
		int meat=input.nextInt();
		
		if(choice==1) {
			
			hamburger obj=new hamburger(BreadRoll[bread-1],Meat[meat-1],5);
			String []toppings=obj.toppings();
			double price[]=obj.price();
			char ch='Y';
			while(ch=='Y'||ch=='y') {
				
				
				System.out.println("Add toppings");
				ray(toppings,4,price);
				int x=input.nextInt();
				Tlist.add(toppings[x-1]);
				TPrice.add(price[x-1]);
				System.out.println("Do u want add more toppings   y/n");
				
				ch=input.next().charAt(0);
				while(ch!='y'&&ch!='Y'&&ch!='n'&&ch!='N') {
					System.out.println("Invalid input");
					System.out.println("Do u want add more toppings   y/n");
					ch=input.next().charAt(0);
					if(ch=='Y'||ch=='y') {
					ray(toppings,4,price);
					 x=input.nextInt();
					Tlist.add(toppings[x-1]);
					TPrice.add(price[x-1]);
					}
					else if(ch=='n'||ch=='N') {
						break;
					}
					
					}
				
				
			}
			obj.total(Tlist, TPrice);
			
			}
if(choice==2) {
			
			HealthyBurger obj=new HealthyBurger(BreadRoll[bread-1],Meat[meat-1],7.25);
			String []toppings=obj.toppings();
			double price[]=obj.price();
			char ch='Y';
			while(ch=='Y'||ch=='y') {
				
				
				System.out.println("Add toppings");
				ray(toppings,6,price);
				int x=input.nextInt();
				Tlist.add(toppings[x-1]);
				TPrice.add(price[x-1]);
				System.out.println("Do u want add more toppings   y/n");
				
				ch=input.next().charAt(0);
				while(ch!='y'&&ch!='Y'&&ch!='n'&&ch!='N') {
					System.out.println("Invalid input");
					System.out.println("Do u want add more toppings   y/n");
					ch=input.next().charAt(0);
					
					if(ch=='Y'||ch=='y') {
						
					ray(toppings,4,price);
					 x=input.nextInt();
					Tlist.add(toppings[x-1]);
					TPrice.add(price[x-1]);
					}
					else if(ch=='n'||ch=='N') {
						break;
					}
					
					
					
					}
				
			
		}
			 obj.total(Tlist, TPrice);
			
		}
if(choice==3) {
	   Tlist.add("Chips");
	   Tlist.add("Drink");
	   TPrice.add(2.75);
	   TPrice.add(1.81);
	   DeluxeBurger obj=new DeluxeBurger(BreadRoll[bread-1],Meat[meat-1],10);
	   obj.total(Tlist, TPrice);
	   
	   
}

	}

}
