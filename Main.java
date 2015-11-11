public class Main {

	public static void main(String[] args) {

		Fraction a=new Fraction(0,0,"");
		Fraction b=new Fraction(0,0,"");
				
		a.n = 3; a.d=6; a.name="Дробь 1";
		b.n = 1; b.d=2; b.name="Дробь 2";
		
		//a.n = 3; a.d=6; a.name="Дробь 1";
		//b.n = 8; b.d=4; b.name="Дробь 2";
				
		System.out.println(a);
		System.out.println(b);
			
		
		System.out.println(a.mul(b));
		System.out.println(a.div(b));
		System.out.println(a.add(b));
		System.out.println(a.sub(b));
		
	}

}
