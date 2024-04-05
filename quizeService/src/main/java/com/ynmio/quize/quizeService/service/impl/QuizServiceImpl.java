package com.ynmio.quize.quizeService.service.impl;

import com.ynmio.quize.quizeService.model.Quiz;
import com.ynmio.quize.quizeService.repository.QuizRepository;
import com.ynmio.quize.quizeService.service.QuestionClient;
import com.ynmio.quize.quizeService.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService {
    @Autowired
    private QuizRepository quizRepository;
    @Autowired
    private QuestionClient questionClient;

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> getAll() {

         List<Quiz> quizes= (List<Quiz>) quizRepository.findAll();

        List<Quiz> quizeList=quizes.stream().map(quiz -> {
            quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());
        return quizeList;
    }

    @Override
    public Quiz getSingle(Integer id) {
        Quiz quiz= quizRepository.findById(id).
                orElseThrow(()->new RuntimeException("Quiz not found "));
        quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getId()));
        return quiz;
    }
}
