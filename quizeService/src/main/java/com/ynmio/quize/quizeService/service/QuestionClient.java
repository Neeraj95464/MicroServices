package com.ynmio.quize.quizeService.service;

import com.ynmio.quize.quizeService.model.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(url ="localhost:9091" ,value = "Question-client")
@FeignClient(name = "QUESTIONSERVICE")
public interface QuestionClient {

    @GetMapping("/question/quiz/{id}")
    List<Question> getQuestionsOfQuiz(@PathVariable Integer id);
}
