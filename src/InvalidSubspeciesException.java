/**
 * This exception is thrown when a user tries to input a subSpecies that is not supported.
 * 
 * @author benjaminorourk
 * @version 1.0
 * Spring/2020
 */

public class InvalidSubspeciesException extends RuntimeException {
	public InvalidSubspeciesException(String message) {
		super(message);
	}
}