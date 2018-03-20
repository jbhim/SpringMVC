package com.amcjt.mybatis.mapper;

import com.amcjt.entity.Comment;
import org.springframework.stereotype.Controller;
import java.util.List;

public interface CommentMapper {
    List<Comment> find();
    void insert(Comment comment);
}
