package com.amcjt.service.ServiceImpl;

import com.amcjt.entity.Comment;
import com.amcjt.mybatis.mapper.CommentMapper;
import com.amcjt.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    public List<Comment> showComment() {
        List<Comment> comments = commentMapper.find();
        return comments;
    }

    @Override
    public void sendComment(Comment comment) {
        commentMapper.insert(comment);
    }


}
