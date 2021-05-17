package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class moodException {

    //*
    // Added message of sad mood
    //***
    @Test
    public void giveMessage_WhenSad_ShouldReturnSad() throws Exception {
        MoodAnalyser analyser = new MoodAnalyser(null); //Invalid Message in constructor
        try {
            String mood = analyser.analyseMood();
            Assertions.assertEquals("SAD", mood); //excepted sad and return sad
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.getMessage());
        }
    }

    //*
    // Added message of happy mood
    //***
    @Test
    public void giveMessage_WhenNull_ShouldThrowMessage () throws Exception {
        MoodAnalyser analyser = new MoodAnalyser(null); //Empty Message in constructor
        try {
            String mood = analyser.analyseMood();
            System.out.println(mood);
            Assertions.assertEquals("HAPPY", mood);
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.getMessage());
        }
    }
}
