package com.example.demoSpring1;

import java.util.ArrayList;

public class Question {
    private int id;
    private String title;
    private String text;
    private int answer;
    private ArrayList<String> options = new ArrayList<>();

    public Question(String title, String text, ArrayList<String> options) {
        this.title = title;
        this.text = text;
        this.options = options;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
