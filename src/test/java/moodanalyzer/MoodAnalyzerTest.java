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
	@Test
	public void MessageHappyMood() {
		MoodAnalyer moodAnalyzer = new MoodAnalyer();
		String actualResult = moodAnalyzer.analyseMood("I am in Happy Mood");
		Assert.assertEquals("HAPPY", actualResult);
	}

	/**
	 * MessageHappyMood() for testing mood as Happy
	 */
	@Test
	public void MessageAnyMood() {
		MoodAnalyer moodAnalyzer = new MoodAnalyer();
		String actualResult = moodAnalyzer.analyseMood("I am in Any Mood");
		Assert.assertEquals("ANY", actualResult);
	}

	/**
	 * We have created this test case to check for NullException. If null value
	 * passed then it will return happy and will be checked by assert method.
	 */
	@Test
	public void NullExceptionHandler() {
		MoodAnalyer moodAnalyzer = new MoodAnalyer();
		String actualResult = moodAnalyzer.analyseMood(null);
		Assert.assertEquals("Happy", actualResult);
	}
}
