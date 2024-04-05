package com.ynmio.quize.quizeService.controller;

import com.ynmio.quize.quizeService.model.Quiz;
import com.ynmio.quize.quizeService.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }
    @GetMapping
    public List<Quiz> getAllQuiz(){
        return quizService.getAll();
    }
    @GetMapping("/{id}")
    public Quiz getSingleQuiz(@PathVariable Integer id){
        return quizService.getSingle(id);
    }
}
