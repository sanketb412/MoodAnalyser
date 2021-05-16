package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class moodException {
    @Test
    public void giveMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser analyser = new MoodAnalyser();
        String mood = analyser.analyseMood("i am in Sad Mood");
        Assertions.assertEquals("SAD",mood);
    }
}
