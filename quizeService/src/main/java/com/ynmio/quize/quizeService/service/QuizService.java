package com.ynmio.quize.quizeService.service;

import com.ynmio.quize.quizeService.model.Quiz;

import java.util.List;

public interface QuizService
{
    Quiz add(Quiz quiz);

    List<Quiz> getAll();

    Quiz getSingle(Integer id);
}
