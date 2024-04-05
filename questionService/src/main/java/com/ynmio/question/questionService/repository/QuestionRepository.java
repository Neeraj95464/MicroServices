package com.ynmio.question.questionService.repository;

import com.ynmio.question.questionService.model.Question;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionRepository extends CrudRepository<Question ,Integer> {

    List<Question> findByQuizId(Integer id);
}
