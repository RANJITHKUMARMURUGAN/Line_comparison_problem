import java.util.*;
public class Line_compare {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Entert the value of x1,x2,y1,y2");
	    	int x1 = scan.nextInt();
	    	int x2 = scan.nextInt();
	    	int y1 = scan.nextInt();
	    	int y2 = scan.nextInt();
	    
	    	System.out.println("Entert the value of a1,a2,b1,b2");
	    	int a1 = scan.nextInt();
	    	int a2 = scan.nextInt();
	    	int b1 = scan.nextInt();
	    	int b2 = scan.nextInt();
	    
		double line1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)+(x2-x1));
	    	double line2=Math.sqrt((a2-a1)*(a2-a1)+(b2-b1));
	    	System.out.println("Line1 is ="+" "+line1);
	    	System.out.println("Line2 is ="+" "+line2);
	}
}
