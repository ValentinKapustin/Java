public class Fraction {
    int n, d;
    String name;

    Fraction (int num, int den, String str)
    {
        n = num;
        d = den;
        name=str;
    }

    public String toString()
    {
    	Simplify(n, d, name);
        return name+": "+n + "/" + d;
    }
    
    void Simplify(int n, int d, String name)
    {
    	int k=0;
    	for (int i=d; i>=2; i--)
    	{
        	if (n%i==0 & d%i==0)
        	{
        		n=n/i;
        		d=d/i;
        		k=1;
        	}
    	}
    	
    	if (k==1)
    	{
    		System.out.print(name+"(Сокр. дробь): "+n+"/"+d+"; ");
    	}
    }

    public Fraction mul(Fraction x)
    {
    	return new Fraction(n*x.n, d*x.d, "Умножение");
    }
    
    public Fraction div(Fraction x)
    {
    	return new Fraction(n*x.d, d*x.n, "Деление");
    }
    
    public Fraction add(Fraction x)
    {
    	name="Сложение";
    	if (d==x.d)
    	{
    		return new Fraction(n+x.n, d, name);
    	}
    	else if (d%x.d==0)
    	{
    		return new Fraction(n+(x.n*(d/x.d)), d, name);
    	}
    	else if (x.d%d==0)
    	{
    		return new Fraction(x.n+(n*(x.d/d)), x.d, name);
    	}
    	else
    	{
    		return new Fraction(n*((d*x.d)/d)+x.n*((d*x.d)/x.d), d*x.d, name);
    	}
    	
    	
    }
    
    public Fraction sub(Fraction x)
    {
    	name="Вычитание";
    	if (d==x.d)
    	{
    		return new Fraction(n-x.n, d, name);
    	}
    	else if (d%x.d==0)
    	{
    		return new Fraction(n-(x.n*(d/x.d)), d, name);
    	}
    	else if (x.d%d==0)
    	{
    		return new Fraction(x.n-(n*(x.d/d)), x.d, name);
    	}
    	else
    	{
    		return new Fraction(n*((d*x.d)/d)-x.n*((d*x.d)/x.d), d*x.d, name);
    	}
    }
    
 

}
