package com.example.coursework2treads_ver2.Service.impl;


import com.example.coursework2treads_ver2.Data.Question;
import com.example.coursework2treads_ver2.Exception.DuplicateQuestion;
import com.example.coursework2treads_ver2.Exception.QuestionNotFound;
import com.example.coursework2treads_ver2.Service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuestionServiceImpl implements QuestionService {
    private Set<Question> questions= new HashSet<>();
    private final Random random = new Random();



    @Override
    public Question add(Question question) {
        if(questions.add(question)){
            return question;
        }
      throw new DuplicateQuestion();
    }

    @Override
    public Question remove(Question question) {
        if(questions.remove(question)){
            return question;
        }
        throw  new QuestionNotFound();
    }
    //comment

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableSet(questions);
    }

    @Override
    public Question getRandomQuestion() {
        List<Question> questionsList = new ArrayList<>(getAll());
        return  questionsList.get(random.nextInt(questionsList.size()));
    }
}
