package com.Class;

public class Emp {
	int id;
	String name;
	int sal;
	Emp(int i,String n,int j){
		id=i;
		name=n;
		sal=j;
	}
	
	

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	void display() {System.out.println(id+" "+name+sal);}



	public static void main(String[] args) {
		Emp e1=new Emp(001,"Kamal",10000);
		Emp e2=new Emp(002,"Karan",12000);
		Emp e3=new Emp(003,"Mohan",15000);
		Emp e4=new Emp(004,"Rohan",17000);
		Emp e5=new Emp(005,"Sohan",13000);
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		e5.display();
		
		
		

	}

}
