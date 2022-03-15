package moodanalyzer;

public class MoodAnalyer {
	private static String message;

	public MoodAnalyer() {
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
	 * This method will compute if the mood is happy or sad. 1. We will convert the
	 * message to lower case and check it the string contains happy or sad word in
	 * it. Accordingly we will return Happy or Sad mood.
	 * 
	 * @param message - We will pass the string message from the main method.
	 * @return - We will return the mood Happy or Sad
	 */
	public String analyseMood(String message) {
		if (message.toLowerCase().contains("sad")) {
			return "SAD";
		} else if (message.toLowerCase().contains("happy") || message.toLowerCase().contains("any")) {
			return "HAPPY";
		} else {
			return null;
		}

	}

	/**
	 * In the main method we have created an object and called the methods.
	 */
	public static void main(String[] args) {
		MoodAnalyer mood = new MoodAnalyer();
		mood.setMessage("I am Happy");
		System.out.println(mood.analyseMood(message));

		mood.setMessage("I am in Sad Mood");
		System.out.println(mood.analyseMood(message));
	}

}
