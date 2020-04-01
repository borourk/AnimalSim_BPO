/**
 * The Application class is used to run the code written for every other class
 * 
 * @author benjaminorourk
 * @version 1.0
 * Spring/2020
 */
public class Application {
	/**
	 * The main method is used to run all tests for the program
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("*********************************************");
		System.out.println("                Location Tests              ");
		System.out.println("*********************************************");
	
		System.out.println("*********************************************");
		System.out.println("                 Animal Tests                ");
		System.out.println("*********************************************");
		
		System.out.println("*********************************************");
		System.out.println("                Goldfinch Tests              ");
		System.out.println("*********************************************");
		Animal g = new Goldfinch();
		g.eat();
		g.sleep();
		g.setSimID(10);
		g.fly(l):
		g.walk(l);
		
		System.out.println("*********************************************");
		System.out.println("              BrownBear Tests                ");
		System.out.println("*********************************************");
		Animal b = new BrownBear();
		b.eat();
		b.sleep();
		b.setSimID(10);
		b.swim(l);
		b.walk(l);
	}//Ends the main method
}//Ends the Application class