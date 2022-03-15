package moodanalyzer;

public class MoodAnalyer {
	private static String message;

	/**
	 * Defualt Constructor
	 */
	public MoodAnalyer() {

	}

	/**
	 * Parameter Constructor
	 * 
	 * @param message
	 */
	public MoodAnalyer(String message) {
		this.setMessage(message);
	}

	/**
	 * Getter method for message
	 * 
	 * @return
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Setter method for Message
	 * 
	 * @param message
	 */
	public void setMessage(String message) {
		MoodAnalyer.message = message;
	}

	/**
	 * This method will compute if the mood is happy or sad using Exception
	 * Handling. 1. We will convert the message to lower case and check it the
	 * string contains happy or sad word in it. 2. Accordingly we will return Happy
	 * or Sad mood. 3.The NullPointerException will be triggered & it will return
	 * Invalid Mood
	 * 
	 * @param message - We will pass the string message from the main method.
	 * @return - We will return the mood Happy or Sad
	 */
	public String analyseMood(String message) throws MoodException {
		try {
			if (message.toLowerCase().contains("sad")) {
				return "SAD";
			} else if (message.toLowerCase().contains("happy")) {
				return "HAPPY";
			} else {
				return "ANY";
			}
		} catch (NullPointerException e) {
			throw new MoodException("Exception found");
		}
	}

	/**
	 * In the main method we have created an object and called the methods.
	 * 
	 * @throws MoodException
	 */
	public static void main(String[] args) throws MoodException {
		MoodAnalyer mood = new MoodAnalyer();
		System.out.println(mood.analyseMood(message));

	}
}
