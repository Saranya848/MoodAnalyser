package moodanalyzer;

/**
 * Inheritance and extended the Exception class. Inside the method we have
 * called the super
 * 
 * @author king
 *
 */
public class MoodException extends Exception {

	/**
	 * default id
	 */
	private static final long serialVersionUID = 1L;

	public MoodException(String message) {
		super(message);
	}
}
