package com.ynmio.question.questionService.controller;

import com.ynmio.question.questionService.model.Question;
import com.ynmio.question.questionService.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping
    public Question create(@RequestBody Question question){
        return questionService.add(question);
    }
    @GetMapping
    public List<Question> getAllQuiz(){
        return questionService.getAll();
    }
    @GetMapping("/{id}")
    public Question getSingleQuiz(@PathVariable Integer id){
        return questionService.getSingle(id);
    }

    @GetMapping("/quiz/{id}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Integer id){
        return questionService.getQuestionsOfQuiz(id);
    }
}

