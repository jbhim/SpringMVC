package com.amcjt.service;

import com.amcjt.entity.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> showComment();
    void sendComment(Comment comment);
}
