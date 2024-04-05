package com.ynmio.quize.quizeService.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Question
{
    private int questionId;
    private String question;
    private int quizId;
}
