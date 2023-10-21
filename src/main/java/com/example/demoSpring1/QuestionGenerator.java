package com.example.demoSpring1;

import java.util.ArrayList;
import java.util.Arrays;

public class QuestionGenerator {
    public ArrayList<Question> questions() {
        ArrayList<Question> result = new ArrayList<Question>();
        result.add(new Question());
        result.get(0).setTitle("Month");
        result.get(0).setText("Сколько месяцев в году?");
        result.get(0).setOptions(new ArrayList<>(Arrays.asList("1", "2", "12", "3")));

        result.add(new Question());
        result.get(1).setTitle("Cold water");
        result.get(1).setText("Как называют замёрзшую воду?");
        result.get(1).setOptions(new ArrayList<>(Arrays.asList("Холодная вода", "Сок", "Лёд", "Лимонад")));

        result.add(new Question());
        result.get(2).setTitle("Sides of the world.");
        result.get(2).setText("Сколько сторон света?");
        result.get(2).setOptions(new ArrayList<>(Arrays.asList("1", "2", "4", "3")));

        result.add(new Question());
        result.get(3).setTitle("Time");
        result.get(3).setText("Сколько минут в одном часе?");
        result.get(3).setOptions(new ArrayList<>(Arrays.asList("15", "30", "60", "100")));

        return result;

    }

}
