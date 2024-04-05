package com.ynmio.question.questionService.service;

import com.ynmio.question.questionService.model.Question;

import java.util.List;


public interface QuestionService {

    Question add(Question question);

    List<Question> getAll();

    Question getSingle(Integer id);

    List<Question> getQuestionsOfQuiz(Integer quizId);
}
