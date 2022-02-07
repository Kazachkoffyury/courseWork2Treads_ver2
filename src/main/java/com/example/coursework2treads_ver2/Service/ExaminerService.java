package com.example.coursework2treads_ver2.Service;



import com.example.coursework2treads_ver2.Data.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestion(int amount);
}
