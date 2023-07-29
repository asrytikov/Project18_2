package org.example;

import java.util.logging.Logger;

public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment){
        logger.info("Publishing comment:" + comment.getText());
    }

}
