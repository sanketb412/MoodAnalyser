package com;

public class MoodAnalyser {
    private final String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
            if (message.contains("Sad")){
                return "SAD";}
            else if (message.contains("Happy")){
                return "HAPPY";}
            else
                return "Null";
    }
}
