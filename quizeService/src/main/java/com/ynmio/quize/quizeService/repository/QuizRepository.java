package com.ynmio.quize.quizeService.repository;

import com.ynmio.quize.quizeService.model.Quiz;
import org.springframework.data.repository.CrudRepository;

public interface QuizRepository extends CrudRepository<Quiz ,Integer> {
}
