package moodanalyzer;

import org.junit.Assert;

public class MoodAnalyzerTest {
	public void givenMessage_IsProper_ShouldReturnSad() {
		MoodAnalyer moodAnalyzer = new MoodAnalyer();
		String actualResult = moodAnalyzer.analyseMood("I am Sad Mood");
		Assert.assertEquals("SAD", actualResult);
	}
}
