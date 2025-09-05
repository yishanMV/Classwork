/**
 * Examples of printf formatting
 * 
 * @author Yishan Lin
 * @since September 5, 2025
 */
public class PrintfExample{
	
	public static void main(String[] args){
		
		int i = 987;
		double d = 32.456789;
		String str = "Hello world!";
		
		//output strings
		System.out.printf("%s after\n", str);	//open format
		System.out.printf("%20s after\n", str);	//right justified
		System.out.printf("%-20s after\n", str);	//left justified
		
		//output integers
		System.out.printf("%d after\n", i);
		System.out.printf("%20d after\n", i);
		System.out.printf("%-20d after\n", i);
		
		//output doubles
		System.out.printf("%f after\n", d);
		System.out.printf("%20.2f after\n", d);
		System.out.printf("%-20.2f after\n", d);
		System.out.printf("%20.2e after\n", d);
		
		//formatting text
		String myStr = String.format("%15s %10d %15f\n", str, i, d);
		System.out.println(myStr);
	}
}
