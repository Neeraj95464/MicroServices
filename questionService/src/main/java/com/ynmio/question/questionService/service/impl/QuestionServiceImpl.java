package com.ynmio.question.questionService.service.impl;

import com.ynmio.question.questionService.model.Question;
import com.ynmio.question.questionService.repository.QuestionRepository;
import com.ynmio.question.questionService.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepository questionRepository;
    @Override
    public Question add(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> getAll() {
        return (List<Question>) questionRepository.findAll();
    }

    @Override
    public Question getSingle(Integer id) {
        return questionRepository.findById(id).orElseThrow(()->new RuntimeException("Question not found "));
    }

    @Override
    public List<Question> getQuestionsOfQuiz(Integer quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}
