package com.youjunying.notes.mapper;

import com.youjunying.notes.domain.Note;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface NoteMapper {

    @Select("select id,title,content,time from note")
    List<Note> queryall();

    @Insert("insert into note(title,content,time) values (#{title},#{content},now())")
    Integer addNote(Note note);

    @Update("update note set title=#{title},content=#{content} where id=#{id}")
    Integer updateNote(Note note);

    @Delete("delete from note where id=#{id}")
    Integer deleteNote(@Param("id") Integer id);
}
