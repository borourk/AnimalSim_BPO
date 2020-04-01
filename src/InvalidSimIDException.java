
/**
 * This exception is thrown when a user sets the simID of an animal to less than 0.
 * 
 * @author benjaminorourk
 * @version 1.0
 * Spring/2020
 */

public class InvalidSimIDException extends RuntimeException {
	public InvalidSimIDException(String message) {
		super(message);
	}
}