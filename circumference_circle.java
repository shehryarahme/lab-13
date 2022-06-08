import java.util.Scanner;

public class circumference_circle{

    final double PI;

    public circumference_circle (double pi){
	    this.PI=pi;
    }

	public double getPI(){
		return PI;
	}

	public static void main(String args[]) {
		float r;
		double circum;
	
		Scanner scan = new Scanner (System.in); 
		circumference_circle circle =new circumference_circle(3.14);
		System.out.print("Enter Radius of Circle : "); 
		r = scan.nextFloat();
		circum= 2*circle.getPI()*r;
	
		System.out.print("\nCircumference of Circle =" +circum);
	}
}