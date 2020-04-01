
/**
 * This exception is thrown when a user sets the wingSpan of Goldfinch to less than 5cm or greater than 11cm.
 * 
 * @author benjaminorourk
 * @version 1.0
 * Spring/2020
 */

public class InvalidWingspanException extends RuntimeException {
	public InvalidWingspanException(String message) {
		super(message);
	}
}