package com.youjunying.notes.controller;

import com.youjunying.notes.domain.Note;
import com.youjunying.notes.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @RequestMapping(value = "/addNote",method = RequestMethod.POST)
    public int addNote(Note note) {
        return noteService.addNote(note);
    }

    @RequestMapping(value = "/queryall", method = RequestMethod.GET)
    public List<Note> queryall(){
        return noteService.queryall();
    }

    @RequestMapping(value = "/updateNote",method = RequestMethod.PUT)
    public int updateNote(Note note){
        return noteService.updateNote(note);
    }

    @RequestMapping(value="/deleteNote/{id}" ,method = RequestMethod.DELETE)
    public int deleteNote(@PathVariable("id")Integer id){
        return noteService.deleteNote(id);
    }
}
