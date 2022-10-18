package InternBonus;

public class Main {

	public static void main(String[] args) {
		JavaIntern i= new JavaIntern();
		i.setDetails(1, "Swasti", 1000);
		i.addBonus();
		System.out.println(i);
		
		PythonIntern p= new PythonIntern();
		p.setDetails(2, "Abhishek", 2000);
		p.addBonus();
		System.out.println(p);
		
		SQLIntern s= new SQLIntern();
		s.setDetails(3, "Manaz", 1000);
		s.addBonus();
		System.out.println(s);
		
		DotNetIntern d= new DotNetIntern();
		d.setDetails(4, "Akarsh", 1200);
		d.addBonus();
		System.out.println(d);
		
		SAPIntern j= new SAPIntern();
		j.setDetails(5, "Akhil", 900);
		j.addBonus();
		System.out.println(j);
		
	}
	}



