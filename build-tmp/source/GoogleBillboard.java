import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  
public void setup()  
{            
    noLoop();
    int beginIndex = 0;
    int endIndex = beginIndex + 10;
    String digits = e.substring(beginIndex, endIndex);
    double dNum = Double.parseDouble(digits);
    System.out.println(dNum);
}  
public void draw()  
{   
	for (int j = 0; j < e.length(); j++)
		isPrime();
}  
public boolean isPrime(double dNum)  
{   
    //to be finished later 
    if (dNum < 2)  
    	return false;
    for (int i = 2; i <= Math.sqrt(dNum); i++)
    {
    	if (dNum % i == 0)
    		return false;
    }
    return true;  
} 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
