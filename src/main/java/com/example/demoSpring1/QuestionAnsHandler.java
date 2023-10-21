package com.example.demoSpring1;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

public class QuestionAnsHandler {
    private boolean success;
    private String feedback;
    private final List<Question> questions = new ArrayList<>();
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public QuestionAnsHandler(int index, int question) {
        try {
            if (index == 2) {
                success = true;
                feedback = "Yes!";
            } else {
                success = false;
                feedback = "No, please try again ";
            }
        } catch (IndexOutOfBoundsException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }


    }
}
