package com.youjunying.notes;

import com.youjunying.notes.domain.Note;
import com.youjunying.notes.mapper.NoteMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private NoteMapper noteMapper;

    @Test
    public void login(){
        List<Note> list= noteMapper.queryall();
       for (Note note:list){
           System.out.println(note.toString());
       }
    }
}
