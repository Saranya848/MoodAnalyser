package moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

	/**
	 * MessageSadMood() for testing mood as sad
	 */
	@Test
	public void MessageSadMood() {
		MoodAnalyer moodAnalyzer = new MoodAnalyer();
		String actualResult = moodAnalyzer.analyseMood("I am Sad Mood");
		Assert.assertEquals("SAD", actualResult);
	}

	/**
	 * MessageHappyMood() for testing mood as Happy
	 */
	// @Test
	// public void MessageHappyMood() {
	// MoodAnalyer moodAnalyzer = new MoodAnalyer();
	// String actualResult = moodAnalyzer.analyseMood("I am in Any Mood");
	// Assert.assertEquals("HAPPY", actualResult);
	// }
}
