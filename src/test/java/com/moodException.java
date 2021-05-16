package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class moodException {

    //*
    // Added message of sad mood
    //***
    @Test
    public void giveMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser analyser = new MoodAnalyser();
        String mood = analyser.analyseMood("i am in Sad Mood"); //Message
        Assertions.assertEquals("SAD",mood); //excepted sad and return sad
    }
    
    //*
    // Added message of happy mood
    //***
    @Test
    public void giveMessage_WhenHappy_ShouldReturnHappy() {
        MoodAnalyser analyser = new MoodAnalyser();
        String mood = analyser.analyseMood("i am in Happy Mood"); //Message
        Assertions.assertEquals("HAPPY",mood); //excepted happy and return happy
    }
}
