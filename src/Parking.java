/*
 * You have been hired to make the system that creates the receipts 
 * for a parking garage. The parking garage charges a $2 minimum 
 * fee to park. The garage charges $0.50 per hour for each hour. 
 * You can assume that no car parks for longer than 24-hours at a time. 
 * Write a program that will calculate and print the parking 
 * charges for each of customer. The program will prompt the user 
 * to enter an integer amount of time they stayed in the garage.

 * Example output:
 *
 *	 Pack Em and Stack Em
 *        Parking Garage
 *
 *Address:	1900 E. Thomas
 *		    Arlington Heights, IL 60004
 *		
 * Number of hours:	3
 *
 * Total Cost: $3.50
 *
 *
 * Thank You for Your Service!
 */

public class Parking {

	public static void main( String args[] ) {
	
		int number_of_hours = IO.getInt("Number of Hours parked:");

		int totalCost = 2 * number_of_hours;

		double x = number_of_hours + 0.50;



		System.out.println("Pack Em and Stack Em" +
				"\n Parking garage" + "\n Address: 1900E.Thomas"
				+ "\n Arlington Heights, IL 60004" + "\nNumber of hours: " + number_of_hours
				+ "\nTotal: $" + x);


		
	}
}
