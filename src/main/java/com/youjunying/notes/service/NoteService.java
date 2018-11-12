package com.youjunying.notes.service;

import com.youjunying.notes.domain.Note;
import com.youjunying.notes.mapper.NoteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteMapper noteMapper;

    /**
     * 查询所有Note信息
     * @return
     */
    public List<Note> queryall(){
        return noteMapper.queryall();
    }

    /**
     * 新增note信息
     * @param note
     * @return
     */
    public int addNote(Note note){
        return noteMapper.addNote(note);
    }

    /**
     * 修改note信息
     * @param note
     * @return
     */
    public int updateNote(Note note){
        return noteMapper.updateNote(note);
    }

    /**
     * 根据id删除note信息
     * @param id
     * @return
     */
    public int deleteNote(int id){
        return noteMapper.deleteNote(id);
    }
}
