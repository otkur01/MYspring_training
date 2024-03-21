package com.cydeo.Repository;

import com.cydeo.Model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment for : " + comment.getText());
    }
}
