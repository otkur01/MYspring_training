package com.cydeo;

import com.cydeo.Config.commentConfig;
import com.cydeo.Model.Comment;
import com.cydeo.Proxy.CommentNotificationProxy;
import com.cydeo.Proxy.EmailCommentNotificationProxy;
import com.cydeo.Repository.CommentRepository;
import com.cydeo.Repository.DBCommentRepository;
import com.cydeo.Service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp {
    public static void main(String[] args) {
       Comment comment =new Comment("Hekim","java going good");
//        CommentRepository commentRepository = new DBCommentRepository();
//        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();
//        CommentService commentService = new CommentService(commentRepository,commentNotificationProxy );
//        commentService.publishComment(comment);


        ApplicationContext context = new AnnotationConfigApplicationContext(commentConfig.class);
        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);


    }
}
