package com.cydeo.Service;

import com.cydeo.Model.Comment;
import com.cydeo.Proxy.CommentNotificationProxy;
import com.cydeo.Proxy.EmailCommentNotificationProxy;
import com.cydeo.Repository.CommentRepository;
import com.cydeo.Repository.DBCommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    private final CommentRepository commentRepository;
    private  final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository,@Qualifier("push") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
