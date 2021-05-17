package com;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyseMood(String message) throws Exception {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() throws Exception {
        try {
            if (message.length()==0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "Enter Proper Message");
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, "Enter Proper Message");
        }

    }

}
