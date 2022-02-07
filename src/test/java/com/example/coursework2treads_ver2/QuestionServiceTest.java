package com.example.coursework2treads_ver2;


import com.example.coursework2treads_ver2.Exception.DuplicateQuestion;
import com.example.coursework2treads_ver2.Exception.QuestionNotFound;
import com.example.coursework2treads_ver2.Service.QuestionService;
import com.example.coursework2treads_ver2.Service.impl.QuestionServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static com.example.coursework2treads_ver2.Constants.QUEST1;
import static com.example.coursework2treads_ver2.Constants.QUEST2;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QuestionServiceTest {
    private QuestionService out;

    @BeforeEach
    void  setUp() {
     out = new QuestionServiceImpl();
    }
    @Test
    void shouldAddQuestionDuplicate() {
        out.add(QUEST1);
        assertThrows(DuplicateQuestion.class, () -> out.add(QUEST1));
    }
    @Test
    void shouldRemoveQuestionNotFound(){
        out.add(QUEST1);
        assertThrows(QuestionNotFound.class,()-> out.remove(QUEST2));
    }


}
