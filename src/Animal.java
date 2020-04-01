
/**
 * The Animal class is the parent class to every other class related to Animals  
 */

public abstract class Animal extends Location {
	
	Location location; 
	protected int simID;
	protected boolean full;
	protected boolean rested;
	
	public Animal() {//empty-argument constructor
		simID = 0;
		location = new Location(); //Initializes a new Location object with x and y set to 0.
		full = false; 
		rested = true;
	}
	
	/**
	 * Preferred Constructor
	 * @param simID
	 * @param l
	 */
	public Animal(int simID, Location l) {
		InvalidSimIDException isIDe = new InvalidSimIDException(" SimID must be an integer greater than or equal to 0 ");
		try {
			if(simID < 0) {
				throw isIDe;
			}
				else {
					setSimID(simID);
				}
		}
		catch(InvalidSimIDException ex) {
			System.out.println(ex.getMessage());
		}
		setLocation(l);
		full = false;
		rested = true;
	}
	
	/**
	 * @return a true/false value depending on what random number is generated
	 */
	public boolean eat() {
		double randomNumber;
		randomNumber = Math.random();
		if(randomNumber <= 0.5) {
			full = false;
		}
			else {
				full = true;
			}
			return full;
	}
	
	/**
	 * @return a true/false value depending on a random number between 0 and 1.
	 */
	public boolean sleep() {
		double randomNumber;
		randomNumber = Math.random();
		if(randomNumber <= 0.5) {
			rested = false;
		}
			else {
				rested = true;
			}
			return rested;
	}
	
	public int getSimID(){//Getter for SimId
		return simID;
	}
	public void setSimID(int simID){//Setter for SimId
		this.simID = simID;
	}
	public Location getLocation(){//Getter for Location
		return location;
	}
	public void setLocation(Location location){//Setter for Location
		this.location = location;
	}
	public boolean isFull(){//Getter for boolean statement Full
		return full;
	}
	public void setFull(boolean full){//Setter for boolean statement Full
		this.full = full;
	}
	public boolean isRested(){//Getter for boolean statement Rested
		return rested;
	}
	public void setRested(boolean rested){//Setter for boolean statement Rested
		this.rested = rested;
	}
	
}//End of Animal Class

