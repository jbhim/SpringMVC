package com.amcjt.test;

import com.amcjt.entity.Comment;
import com.amcjt.mybatis.mapper.CommentMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class Demo {
    @Test
    public void fun(){
       ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        CommentMapper commentMapper = context.getBean(CommentMapper.class);
        List<Comment> comment = commentMapper.find();
        for (Comment comment1 : comment) {
            System.out.println(comment1);
        }

    }
}
