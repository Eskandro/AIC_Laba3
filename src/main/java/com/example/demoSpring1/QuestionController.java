package com.example.demoSpring1;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;

@RestController
public class QuestionController {
    private ArrayList<Question> questions = new ArrayList<>();

    public QuestionController() {

    }

    @PostMapping("/a[i/questions")
    public Question getQuestion(@RequestBody Question Ques) {
        questions.add(Ques);
        questions.get(questions.size() - 1).setId((questions.size()) - 1);
        return questions.get(questions.size() - 1);
    }

    @GetMapping("/api/quizzes")
    public ArrayList<Question> getQuiz() {
        return questions;
    }

    @PostMapping("/api/quizzes/{id}/solve")
    public QuestionAnsHandler solveQuestion(@RequestParam int answer, @PathVariable int id) {
        try {
            return new QuestionAnsHandler(answer, id);
        } catch (IndexOutOfBoundsException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/quizzes/{id}")
    public Question getQuiestion(@PathVariable int id) {
        try {
            return questions.get(id);
        } catch (IndexOutOfBoundsException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

}


