package com.amcjt.springmvc.controller;

import com.amcjt.entity.Comment;
import com.amcjt.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class ItemController {
    @Autowired
    private CommentService commentService;

    @RequestMapping(value ="/item/itemlist.action")
    public ModelAndView itemList(){
        List<Comment> comments = commentService.showComment();
        ModelAndView mav = new ModelAndView();
        mav.addObject("list",comments);
        mav.setViewName("/itemList.jsp");
        return mav;
    }

    @RequestMapping(value ="/item/sendComment.action")
    public ModelAndView sendComment(Comment comment){
        Timestamp timestamp = new Timestamp(new Date(System.currentTimeMillis()).getTime());
        comment.setEc_create_time(timestamp);
        commentService.sendComment(comment);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/item/itemlist.action");
        return mav;
    }

    @RequestMapping(value ="/item/up.action")
    public ModelAndView sendComment(MultipartFile file) throws IOException {

        String name =file.getOriginalFilename();
        file.transferTo(new File("C:\\Users\\Administrator\\Desktop\\worktest\\"+name));
        ModelAndView mav = new ModelAndView();
        mav.addObject("image",name);
        mav.setViewName("/index.jsp");
        return mav;
    }

}
