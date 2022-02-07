package com.example.coursework2treads_ver2.Service;



import com.example.coursework2treads_ver2.Data.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(Question question);
    Question remove(Question question);
    Collection<Question> getAll();
    Question getRandomQuestion();
}
