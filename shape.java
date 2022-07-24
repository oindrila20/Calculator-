package od12;

import java.io.*;

class Shape{		// declare the shape class
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String a[])throws IOException{
		System.out.println("Choose a Shape:");
		System.out.println("1.Circle\n2.Rectangle");	// menu to choose shape
		int ch=Integer.parseInt(br.readLine());


        switch(ch){		// choose different shapes
            case 1: 
                new Circle().calc();
                break;
            case 2: 
                new Rectangle().calc();
                break;
            default:
                System.out.println("Wrong Input");
             }		
	}


	void calc(){
		System.out.println("Enter dimensions:");
	}


	double Area(double radius){ 			// method to calculate area when radius is given(Overloading)
		return(3.14*Math.pow(radius, 2));
	}
    
   double Area(double length, double breadth){  // method to calculate area when length and breadth is given(Overloading)
       return(length*breadth);
   }
	final void display(double result){		// final display method to print the result
			System.out.println("The Area is = "+result);
	}
}



class Circle extends Shape{	// declare Circle class by extending Shape class
	void calc(){
		try{
			super.calc();
			System.out.println("Enter radius: ");
			double radius=Double.parseDouble(br.readLine());
			double area=Area(radius);
			display(area);
		}
		catch(IOException e){
			System.out.println(e);
		}
			
	}
}



class Rectangle extends Shape{	// declare Rectangle class by extending Shape class
	void calc(){
		try{
			super.calc();
			System.out.println("Enter length: ");
			double length=Double.parseDouble(br.readLine());
			System.out.println("Enter breadth: ");
			double breadth=Double.parseDouble(br.readLine());
			double area=Area(length,breadth);
			display(area);
			
		}
		catch(IOException e){
			System.out.println(e);
		}
			
	}
}
