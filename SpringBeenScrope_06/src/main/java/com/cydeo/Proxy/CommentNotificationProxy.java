package com.cydeo.Proxy;

import com.cydeo.Model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
