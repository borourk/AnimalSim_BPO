/**
 * This exception is thrown when a user sets either x or y as less than 0.
 * 
 * @author benjaminorourk
 * @version 1.0
 * Spring/2020
 */

public class InvalidCoordinateException extends RuntimeException{
	public InvalidCoordinateException(String message) {
		super(message);
	}
}