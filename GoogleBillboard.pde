public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  
public void setup()  
{            
    noLoop();
}  
public void draw()  
{   
	for (int beg = 1; beg < e.length(); beg++)
	{
		int end = beg + 10;
		String digits = e.substring(beg, end);
		double num = Double.parseDouble(digits);
		if (isPrime(num))
		{
			System.out.println(num);
			break;
		}

	}

}  
public boolean isPrime(double dNum)  
{   
    if (dNum < 2)  
    	return false;
    for (int i = 2; i <= Math.sqrt(dNum); i++)
    {
    	if (dNum % i == 0)
    		return false;
    }
    return true;  
} 